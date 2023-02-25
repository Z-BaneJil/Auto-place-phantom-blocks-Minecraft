package org.subtoqz.autoplacephantomblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.subtoqz.autoplacephantomblocks.AutoPlacePhantomBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHROMAKEY_CANVAS = registerItem("chromakey_canvas", new Item(new FabricItemSettings()), ModItemGroups.CHROMAKEY_GROUP);

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AutoPlacePhantomBlocks.MOD_ID, id), item);
    }

    public static Item registerItem(String id, Item item, ItemGroup itemGroup) {
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(AutoPlacePhantomBlocks.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));

        return returnItem;
    }

    public static void register() {
        AutoPlacePhantomBlocks.LOGGER.info("Registering blocks for: " + AutoPlacePhantomBlocks.MOD_ID);
    }
}
