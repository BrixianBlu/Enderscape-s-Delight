package net.brixian.enderscapesdelight;

import net.brixian.enderscapesdelight.block.EnderscapesDelightBlocks;
import net.brixian.enderscapesdelight.item.EnderscapeDelightItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnderscapesDelight implements ModInitializer {
	public static final String MOD_ID = "enderscapes-delight";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Enderscape Delight");
		EnderscapeDelightItems.registerEDItems();
		EnderscapesDelightBlocks.registerEDBlocks();
	}
}