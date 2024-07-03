package davepusey.xaerostandinxwm.effect;

import net.minecraft.entity.effect.StatusEffectCategory;

public class NoWorldMapEffect extends WorldMapStatusEffect {
  public NoWorldMapEffect(StatusEffectCategory type) {
    super(type, -16777216, "no_world_map");
  }
}
