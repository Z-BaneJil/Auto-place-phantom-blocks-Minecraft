package org.subtoqz.autoplacephantomblocks.item;

import net.minecraft.util.registry.Registry;
import org.subtoqz.autoplacephantomblocks.AutoPlacePhantomBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHROMAKEY_CANVAS = registerItem("chromakey_canvas", new Item(new FabricItemSettings().group(ModItemGroups.CHROMAKEY_GROUP)));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AutoPlacePhantomBlocks.MOD_ID, id), item);
    }

    public static void register() {
        AutoPlacePhantomBlocks.LOGGER.info("Registering blocks for: " + AutoPlacePhantomBlocks.MOD_ID);
    }
}
