package davepusey.xaerostandinxwm.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.entry.RegistryEntry;

public class Effects {
  public static WorldMapStatusEffect NO_WORLD_MAP_UNHELD = null;
  
  public static WorldMapStatusEffect NO_WORLD_MAP_HARMFUL_UNHELD = null;
  
  public static WorldMapStatusEffect NO_CAVE_MAPS_UNHELD = null;
  
  public static WorldMapStatusEffect NO_CAVE_MAPS_HARMFUL_UNHELD = null;
  
  public static RegistryEntry<StatusEffect> NO_WORLD_MAP = null;
  
  public static RegistryEntry<StatusEffect> NO_WORLD_MAP_HARMFUL = null;
  
  public static RegistryEntry<StatusEffect> NO_CAVE_MAPS = null;
  
  public static RegistryEntry<StatusEffect> NO_CAVE_MAPS_HARMFUL = null;
  
  public static void init() {
    if (NO_WORLD_MAP != null)
      return; 
    NO_WORLD_MAP_UNHELD = new NoWorldMapEffect(StatusEffectCategory.NEUTRAL);
    NO_WORLD_MAP_HARMFUL_UNHELD = new NoWorldMapEffect(StatusEffectCategory.HARMFUL);
    NO_CAVE_MAPS_UNHELD = new NoCaveMapsEffect(StatusEffectCategory.NEUTRAL);
    NO_CAVE_MAPS_HARMFUL_UNHELD = new NoCaveMapsEffect(StatusEffectCategory.HARMFUL);
  }
}
