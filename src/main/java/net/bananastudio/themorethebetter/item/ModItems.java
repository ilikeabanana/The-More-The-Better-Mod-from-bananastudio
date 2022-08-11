package net.bananastudio.themorethebetter.item;

import net.bananastudio.themorethebetter.TheMoreTheBetter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RED_DIAMOND = registerItem("red_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.MOREITEMGROUP)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TheMoreTheBetter.MOD_ID, name), item);
    }
    public static void registerModItems(){
        TheMoreTheBetter.LOGGER.debug("registering items for " + TheMoreTheBetter.MOD_ID);
    }
}
