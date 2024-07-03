package davepusey.xaerostandinxwm.effect;

import java.util.function.Function;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;

public class EffectsRegister {
  public void registerEffects(Function<WorldMapStatusEffect, RegistryEntry<StatusEffect>> registry) {
    Effects.init();
    Effects.NO_WORLD_MAP = registry.apply(Effects.NO_WORLD_MAP_UNHELD);
    Effects.NO_WORLD_MAP_HARMFUL = registry.apply(Effects.NO_WORLD_MAP_HARMFUL_UNHELD);
    Effects.NO_CAVE_MAPS = registry.apply(Effects.NO_CAVE_MAPS_UNHELD);
    Effects.NO_CAVE_MAPS_HARMFUL = registry.apply(Effects.NO_CAVE_MAPS_HARMFUL_UNHELD);
  }
}
