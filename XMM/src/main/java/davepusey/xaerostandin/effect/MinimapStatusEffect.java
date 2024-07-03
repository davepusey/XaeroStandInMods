package davepusey.xaerostandin.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class MinimapStatusEffect extends StatusEffect {
  private Identifier id;
  
  protected MinimapStatusEffect(StatusEffectCategory type, int color, String idPrefix) {
    super(type, color);
    String suffix = (type == StatusEffectCategory.HARMFUL) ? "_harmful" : ((type == StatusEffectCategory.BENEFICIAL) ? "_beneficial" : "");
    setRegistryName(Identifier.of("xaerominimap", idPrefix + suffix));
  }
  
  protected void setRegistryName(Identifier id) {
    this.id = id;
  }
  
  public Identifier getRegistryName() {
    return this.id;
  }
}
