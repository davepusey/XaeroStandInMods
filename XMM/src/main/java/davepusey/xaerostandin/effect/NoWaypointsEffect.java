package davepusey.xaerostandin.effect;

import net.minecraft.entity.effect.StatusEffectCategory;

public class NoWaypointsEffect extends MinimapStatusEffect {
  public NoWaypointsEffect(StatusEffectCategory type) {
    super(type, -16777216, "no_waypoints");
  }
}
