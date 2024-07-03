package davepusey.xaerostandin.effect;

import net.minecraft.entity.effect.StatusEffectCategory;

public class NoRadarEffect extends MinimapStatusEffect {
  public NoRadarEffect(StatusEffectCategory type) {
    super(type, -16777216, "no_entity_radar");
  }
}
