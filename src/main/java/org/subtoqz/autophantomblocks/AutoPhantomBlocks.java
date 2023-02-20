package org.subtoqz.autophantomblocks;

import net.fabricmc.api.ModInitializer;
import org.subtoqz.autophantomblocks.block.ModBlocks;
import org.subtoqz.autophantomblocks.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.subtoqz.autophantomblocks.keybind.ModKeyBindings;

public class AutoPhantomBlocks implements ModInitializer {
	public static final String MOD_ID = "autophantomblocks";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("It's working? ;)");
		ModKeyBindings.register();
		ModItems.register();
		ModBlocks.register();
	}
}
