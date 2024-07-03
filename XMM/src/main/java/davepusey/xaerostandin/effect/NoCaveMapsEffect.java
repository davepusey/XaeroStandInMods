package davepusey.xaerostandin.effect;

import net.minecraft.entity.effect.StatusEffectCategory;

public class NoCaveMapsEffect extends MinimapStatusEffect {
  public NoCaveMapsEffect(StatusEffectCategory type) {
    super(type, -16777216, "no_cave_maps");
  }
}
