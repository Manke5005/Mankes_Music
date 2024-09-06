package net.zane.mankesmusic.sound;

import net.zane.mankesmusic.MankesMusic;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

	// My Modded Discs -->
	public static SoundEvent MUSIC_RENAISSANCE = registerSoundEvent("music_disc_renaissance");
	public static SoundEvent MUSIC_WOODEN_LOVE = registerSoundEvent("music_disc_wooden_love");
	public static SoundEvent MUSIC_WINGS = registerSoundEvent("music_disc_wings");
	public static SoundEvent MUSIC_ALPHA = registerSoundEvent("music_disc_alpha");
	public static SoundEvent MUSIC_MATCH_CUT = registerSoundEvent("music_disc_match_cut");
	public static SoundEvent MUSIC_DISTRICTS = registerSoundEvent("music_disc_districts");
	public static SoundEvent MUSIC_FLOW = registerSoundEvent("music_disc_flow");
	public static SoundEvent MUSIC_ARIA_MATH = registerSoundEvent("music_disc_aria_math");


	// NO NEED TO TOUCH -->
		private static SoundEvent registerSoundEvent(String name) {
			Identifier id = new Identifier(MankesMusic.MOD_ID, name);
			return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
		}
}