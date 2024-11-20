package net.michele.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.michele.tutorialmod.block.ModBlocks;
import net.michele.tutorialmod.item.ModItems;
import net.michele.tutorialmod.item.ModItemsCreativeTab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric wolrd!");
		ModItemsCreativeTab.registerItemTabs();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}