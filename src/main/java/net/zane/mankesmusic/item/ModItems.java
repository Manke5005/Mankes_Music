package net.zane.mankesmusic.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.zane.mankesmusic.MankesMusic;
import net.zane.mankesmusic.item.custom.RecordDiscItem;
import net.zane.mankesmusic.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

	// My Modded Discs -->
	public static final Item RECORD_RENAISSANCE = registerItem("music_disc_night_walker", new RecordDiscItem(7, ModSounds.MUSIC_NIGHT_WALKER, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_WOODEN_LOVE = registerItem("music_disc_anti", new RecordDiscItem(7, ModSounds.MUSIC_ANTI, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_WINGS = registerItem("music_disc_wings", new RecordDiscItem(7, ModSounds.MUSIC_WINGS, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_MATCH_CUT = registerItem("music_disc_work_life_imbalance", new RecordDiscItem(7, ModSounds.MUSIC_WORK_LIFE_IMBALANCE, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_DISTRICTS = registerItem("music_disc_districts", new RecordDiscItem(7, ModSounds.MUSIC_DISTRICTS, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_ALPHA = registerItem("music_disc_alpha", new RecordDiscItem(7, ModSounds.MUSIC_ALPHA, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_FLOW = registerItem("music_disc_flow", new RecordDiscItem(7, ModSounds.MUSIC_FLOW, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));
	public static final Item RECORD_ARIA_MATH = registerItem("music_disc_aria_math", new RecordDiscItem(7, ModSounds.MUSIC_ARIA_MATH, new FabricItemSettings().rarity(Rarity.RARE).group(ItemGroup.MISC).maxCount(1)));


	// NO NEED TO TOUCH -->
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(MankesMusic.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		MankesMusic.LOGGER.info("Registering Items for " + MankesMusic.MOD_ID);
    }
}