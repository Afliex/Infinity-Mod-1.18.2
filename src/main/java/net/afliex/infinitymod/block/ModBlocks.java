package net.afliex.infinitymod.block;

import net.afliex.infinitymod.InfinityMod;
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

    public static final Block INFINITY_BLOCK = registerBlock("infinity_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(8f).requiresTool()), ItemGroup.MISC);

    public static final Block INFINITY_ORE = registerBlock("infinity_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(8f).requiresTool()), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(InfinityMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(InfinityMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        InfinityMod.LOGGER.info("Registering Mod Blocks For " + InfinityMod.MOD_ID);
    }

}
