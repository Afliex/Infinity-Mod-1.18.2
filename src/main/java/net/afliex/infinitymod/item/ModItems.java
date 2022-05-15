package net.afliex.infinitymod.item;

import net.afliex.infinitymod.InfinityMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item INFINITY_ORB = registerItem("infinity_orb",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MELTED_ORB = registerItem("melted_orb",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(InfinityMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        InfinityMod.LOGGER.info("Registering Items For " + InfinityMod.MOD_ID);
    }

}
