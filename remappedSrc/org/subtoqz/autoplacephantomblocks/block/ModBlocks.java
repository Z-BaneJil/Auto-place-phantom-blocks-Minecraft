package org.subtoqz.autoplacephantomblocks.block;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import org.subtoqz.autoplacephantomblocks.AutoPlacePhantomBlocks;
import org.subtoqz.autoplacephantomblocks.item.ModItemGroups;
import org.subtoqz.autoplacephantomblocks.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FIRST_BLOCK = registerBlock("chromakey", new Block(FabricBlockSettings.of(Material.WOOL).strength(1.0f).luminance(15)), ModItemGroups.CHROMAKEY_GROUP);

    public static Block registerBlock(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(AutoPlacePhantomBlocks.MOD_ID, id), block);
    }

    public static Block registerBlock(String id, Block block, ItemGroup itemGroup) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings().group(itemGroup)));

        return Registry.register(Registry.BLOCK, new Identifier(AutoPlacePhantomBlocks.MOD_ID, id), block);
    }

    public static void register() {
        AutoPlacePhantomBlocks.LOGGER.info("Registering blocks for: " + AutoPlacePhantomBlocks.MOD_ID);
    }
}