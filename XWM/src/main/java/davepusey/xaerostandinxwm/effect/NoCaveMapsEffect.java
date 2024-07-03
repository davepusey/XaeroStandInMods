package davepusey.xaerostandinxwm.effect;

import net.minecraft.entity.effect.StatusEffectCategory;

public class NoCaveMapsEffect extends WorldMapStatusEffect {
  public NoCaveMapsEffect(StatusEffectCategory type) {
    super(type, -16777216, "no_cave_maps");
  }
}
