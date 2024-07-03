package davepusey.xaerostandin.effect;

import net.minecraft.entity.effect.StatusEffectCategory;

public class NoMinimapEffect extends MinimapStatusEffect {
  public NoMinimapEffect(StatusEffectCategory type) {
    super(type, -16777216, "no_minimap");
  }
}
