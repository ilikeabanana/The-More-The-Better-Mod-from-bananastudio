package net.bananastudio.themorethebetter.block;

import net.bananastudio.themorethebetter.TheMoreTheBetter;
import net.bananastudio.themorethebetter.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RED_DIAMOND_ORE = registerBlock("red_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5f)), ModItemGroup.MOREOREGROUP);
    public static final Block RED_DIAMOND_BLOCK = registerBlock("red_diamond_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(7f)), ModItemGroup.MOREBLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK, new Identifier(TheMoreTheBetter.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(TheMoreTheBetter.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        TheMoreTheBetter.LOGGER.debug("registering blocks for " + TheMoreTheBetter.MOD_ID);
    }
}
