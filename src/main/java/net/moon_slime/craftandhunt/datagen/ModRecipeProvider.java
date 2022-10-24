package net.moon_slime.craftandhunt.datagen;

import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.tags.ITag;
import net.moon_slime.craftandhunt.CraftAndHunt;
import net.moon_slime.craftandhunt.block.ModBlocks;
import net.moon_slime.craftandhunt.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider  extends RecipeProvider {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        registerItemToBlockAndBack(ModItems.BEAR_LEATHER_PANDA.get(), ModBlocks.BEAR_LEATHER_PANDA_BLOCK.get(), pFinishedRecipeConsumer);
        registerItemToBlockAndBack(ModItems.BEAR_LEATHER_POLAR.get(), ModBlocks.BEAR_LEATHER_POLAR_BLOCK.get(), pFinishedRecipeConsumer);

        registerCraftedArmorByItem("bear_leather_polar", ModItems.BEAR_LEATHER_POLAR.get(), "bear_leather_polar", pFinishedRecipeConsumer);
        registerCraftedArmorByItem("bear_leather_panda", ModItems.BEAR_LEATHER_PANDA.get(), "bear_leather_panda", pFinishedRecipeConsumer);

        registerCraftedArmorByTag("bone", Tags.Items.BONES, "bone", pFinishedRecipeConsumer);
    }

    public static void registerItemToBlockAndBack(Item item, Block block, Consumer<FinishedRecipe> consumer) {

        Item ModItem = item;
        Block ModBlock = block;
        String itemToBlock = item.toString() + "_to_" + block.asItem().toString();
        String blockToItem = block.asItem().toString() + "_to_" + item.toString();

        ShapelessRecipeBuilder.shapeless(ModItem, 9)
                .requires(ModBlock)
                .unlockedBy("has_" + ModBlock.toString(), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlock).build()))
                .save(consumer, blockToItem);

        ShapedRecipeBuilder.shaped(ModBlock)
                .define('X', ModItem)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_" + ModItem.toString(), inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItem).build()))
                .save(consumer, itemToBlock);
    }

    public static void registerCraftedArmorByItem(String group, Item material, String variant, Consumer<FinishedRecipe> consumer) {

        Item helmet = Registry.ITEM.getOptional(rl(variant + "_helmet")).get();
        Item chestplate = Registry.ITEM.getOptional(rl(variant + "_chestplate")).get();
        Item leggings = Registry.ITEM.getOptional(rl(variant + "_leggings")).get();
        Item boots = Registry.ITEM.getOptional(rl(variant + "_boots")).get();


        ShapedRecipeBuilder.shaped(helmet)
                .pattern("xxx")
                .pattern("x x")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

        ShapedRecipeBuilder.shaped(chestplate)
                .pattern("x x")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

        ShapedRecipeBuilder.shaped(leggings)
                .pattern("xxx")
                .pattern("x x")
                .pattern("x x")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

        ShapedRecipeBuilder.shaped(boots)
                .pattern("x x")
                .pattern("x x")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

    }

    public static void registerCraftedArmorByTag(String group, TagKey<Item> material, String variant, Consumer<FinishedRecipe> consumer) {

        Item helmet = Registry.ITEM.getOptional(rl(variant + "_helmet")).get();
        Item chestplate = Registry.ITEM.getOptional(rl(variant + "_chestplate")).get();
        Item leggings = Registry.ITEM.getOptional(rl(variant + "_leggings")).get();
        Item boots = Registry.ITEM.getOptional(rl(variant + "_boots")).get();

        TagKey<Item> test = Tags.Items.BONES;

        ShapedRecipeBuilder.shaped(helmet)
                .pattern("xxx")
                .pattern("x x")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

        ShapedRecipeBuilder.shaped(chestplate)
                .pattern("x x")
                .pattern("xxx")
                .pattern("xxx")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

        ShapedRecipeBuilder.shaped(leggings)
                .pattern("xxx")
                .pattern("x x")
                .pattern("x x")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

        ShapedRecipeBuilder.shaped(boots)
                .pattern("x x")
                .pattern("x x")
                .define('x', material).group(group).unlockedBy(("has_" + material.toString()), has(material)).save(consumer);

    }



    public static ResourceLocation rl(String path)
    {
        return new ResourceLocation(CraftAndHunt.MOD_ID, path);
    }
}
