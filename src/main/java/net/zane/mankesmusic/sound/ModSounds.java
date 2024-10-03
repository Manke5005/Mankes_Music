package net.zane.mankesmusic.sound;

import net.zane.mankesmusic.MankesMusic;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

	// My Modded Discs -->
	public static SoundEvent MUSIC_NIGHT_WALKER = registerSoundEvent("music_disc_night_walker");
	public static SoundEvent MUSIC_ANTI = registerSoundEvent("music_disc_anti");
	public static SoundEvent MUSIC_WINGS = registerSoundEvent("music_disc_wings");
	public static SoundEvent MUSIC_ALPHA = registerSoundEvent("music_disc_alpha");
	public static SoundEvent MUSIC_WORK_LIFE_IMBALANCE = registerSoundEvent("music_disc_work_life_imbalance");
	public static SoundEvent MUSIC_DISTRICTS = registerSoundEvent("music_disc_districts");
	public static SoundEvent MUSIC_FLOW = registerSoundEvent("music_disc_flow");
	public static SoundEvent MUSIC_ARIA_MATH = registerSoundEvent("music_disc_aria_math");

	// NO NEED TO TOUCH -->
		private static SoundEvent registerSoundEvent(String name) {
			Identifier id = new Identifier(MankesMusic.MOD_ID, name);
			return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
		}
}