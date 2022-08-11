package net.bananastudio.themorethebetter.item;

import net.bananastudio.themorethebetter.TheMoreTheBetter;
import net.bananastudio.themorethebetter.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MOREOREGROUP = FabricItemGroupBuilder.build(
            new Identifier(TheMoreTheBetter.MOD_ID,"themoreore"), () -> new ItemStack(ModBlocks.RED_DIAMOND_ORE));
    public static final ItemGroup MOREITEMGROUP = FabricItemGroupBuilder.build(
            new Identifier(TheMoreTheBetter.MOD_ID,"themoreitems"), () -> new ItemStack(ModItems.RED_DIAMOND));
}
