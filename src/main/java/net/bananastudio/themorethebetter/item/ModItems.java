package net.bananastudio.themorethebetter.item;

import net.bananastudio.themorethebetter.TheMoreTheBetter;
import net.bananastudio.themorethebetter.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RED_DIAMOND = registerItem("red_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.MOREITEMGROUP)));
    public static final Item RED_DIAMOND_AXE = registerItem("red_diamond_axe", new ModAxeItem(ModToolMaterials.RED_DIAMOND,
            2,1f,
            new FabricItemSettings().group(ModItemGroup.MORETOOLSGROUP)));
    public static final Item RED_DIAMOND_PICKAXE = registerItem("red_diamond_pickaxe", new ModPickaxeItem(ModToolMaterials.RED_DIAMOND
    , 2, 1f,
            new FabricItemSettings().group(ModItemGroup.MORETOOLSGROUP)));
    public static final Item RED_DIAMOND_SWORD = registerItem("red_diamond_sword", new ModSwordItem(ModToolMaterials.RED_DIAMOND
            , 1, 0.5f,
            new FabricItemSettings().group(ModItemGroup.MORETOOLSGROUP)));
    public static final Item RED_DIAMOND_HOE = registerItem("red_diamond_hoe", new ModHoeItem(ModToolMaterials.RED_DIAMOND
            , 2, 1f,
            new FabricItemSettings().group(ModItemGroup.MORETOOLSGROUP)));
    public static final Item VOODOODOLL = registerItem("voodoo_doll", new VooDooItem(new FabricItemSettings()
            .group(ModItemGroup.MOREITEMGROUP).maxCount(1)));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TheMoreTheBetter.MOD_ID, name), item);
    }
    public static void registerModItems(){
        TheMoreTheBetter.LOGGER.debug("registering items for " + TheMoreTheBetter.MOD_ID);
    }
}
