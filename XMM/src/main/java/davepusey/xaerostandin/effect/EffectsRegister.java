package davepusey.xaerostandin.effect;

import java.util.function.Function;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;

public class EffectsRegister {
  public void registerEffects(Function<MinimapStatusEffect, RegistryEntry<StatusEffect>> registrar) {
    Effects.init();
    Effects.NO_MINIMAP = registrar.apply((MinimapStatusEffect)Effects.NO_MINIMAP_UNHELD);
    Effects.NO_MINIMAP_HARMFUL = registrar.apply((MinimapStatusEffect)Effects.NO_MINIMAP_HARMFUL_UNHELD);
    Effects.NO_RADAR = registrar.apply((MinimapStatusEffect)Effects.NO_RADAR_UNHELD);
    Effects.NO_RADAR_HARMFUL = registrar.apply((MinimapStatusEffect)Effects.NO_RADAR_HARMFUL_UNHELD);
    Effects.NO_WAYPOINTS = registrar.apply((MinimapStatusEffect)Effects.NO_WAYPOINTS_UNHELD);
    Effects.NO_WAYPOINTS_HARMFUL = registrar.apply((MinimapStatusEffect)Effects.NO_WAYPOINTS_HARMFUL_UNHELD);
    Effects.NO_CAVE_MAPS = registrar.apply((MinimapStatusEffect)Effects.NO_CAVE_MAPS_UNHELD);
    Effects.NO_CAVE_MAPS_HARMFUL = registrar.apply((MinimapStatusEffect)Effects.NO_CAVE_MAPS_HARMFUL_UNHELD);
  }
}
