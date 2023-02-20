package org.subtoqz.autoplacephantomblocks;

import net.fabricmc.api.ModInitializer;
import org.subtoqz.autoplacephantomblocks.block.ModBlocks;
import org.subtoqz.autoplacephantomblocks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.subtoqz.autoplacephantomblocks.keybind.ModKeyBindings;

public class AutoPlacePhantomBlocks implements ModInitializer {
	public static final String MOD_ID = "autoplacephantomblocks";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_ID + " successfully initialized!");
		ModKeyBindings.register();
		ModItems.register();
		ModBlocks.register();
	}
}
