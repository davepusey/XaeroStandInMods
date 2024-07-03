package davepusey.xaerostandin;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import davepusey.xaerostandin.effect.EffectsRegister;

public class XMM implements ModInitializer
{
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("xaero-stand-in-xmm");

	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		(new EffectsRegister()).registerEffects(effect -> Registry.registerReference(Registries.STATUS_EFFECT, effect.getRegistryName(), effect));
	}
}
