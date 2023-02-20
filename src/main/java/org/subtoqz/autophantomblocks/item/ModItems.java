package org.subtoqz.autophantomblocks.item;

import net.minecraft.util.registry.Registry;
import org.subtoqz.autophantomblocks.AutoPhantomBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FIRST_ITEM = registerItem("phantom_item", new Item(new FabricItemSettings().group(ModItemGroups.FIRST_GROUP)));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registry.REGISTRIES.ITEM, new Identifier(AutoPhantomBlocks.MOD_ID, id), item);
    }

    public static void register() {
        AutoPhantomBlocks.LOGGER.debug("Registering blocks for: " + AutoPhantomBlocks.MOD_ID);
    }
}
