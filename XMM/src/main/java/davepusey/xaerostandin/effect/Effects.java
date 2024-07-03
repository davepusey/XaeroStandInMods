package davepusey.xaerostandin.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.entry.RegistryEntry;

public class Effects {
  public static StatusEffect NO_MINIMAP_UNHELD = null;
  
  public static StatusEffect NO_MINIMAP_HARMFUL_UNHELD = null;
  
  public static StatusEffect NO_RADAR_UNHELD = null;
  
  public static StatusEffect NO_RADAR_HARMFUL_UNHELD = null;
  
  public static StatusEffect NO_WAYPOINTS_UNHELD = null;
  
  public static StatusEffect NO_WAYPOINTS_HARMFUL_UNHELD = null;
  
  public static StatusEffect NO_CAVE_MAPS_UNHELD = null;
  
  public static StatusEffect NO_CAVE_MAPS_HARMFUL_UNHELD = null;
  
  public static RegistryEntry<StatusEffect> NO_MINIMAP = null;
  
  public static RegistryEntry<StatusEffect> NO_MINIMAP_HARMFUL = null;
  
  public static RegistryEntry<StatusEffect> NO_RADAR = null;
  
  public static RegistryEntry<StatusEffect> NO_RADAR_HARMFUL = null;
  
  public static RegistryEntry<StatusEffect> NO_WAYPOINTS = null;
  
  public static RegistryEntry<StatusEffect> NO_WAYPOINTS_HARMFUL = null;
  
  public static RegistryEntry<StatusEffect> NO_CAVE_MAPS = null;
  
  public static RegistryEntry<StatusEffect> NO_CAVE_MAPS_HARMFUL = null;
  
  public static void init() {
    if (NO_MINIMAP != null)
      return; 
    NO_MINIMAP_UNHELD = new NoMinimapEffect(StatusEffectCategory.NEUTRAL);
    NO_MINIMAP_HARMFUL_UNHELD = new NoMinimapEffect(StatusEffectCategory.HARMFUL);
    NO_RADAR_UNHELD = new NoRadarEffect(StatusEffectCategory.NEUTRAL);
    NO_RADAR_HARMFUL_UNHELD = new NoRadarEffect(StatusEffectCategory.HARMFUL);
    NO_WAYPOINTS_UNHELD = new NoWaypointsEffect(StatusEffectCategory.NEUTRAL);
    NO_WAYPOINTS_HARMFUL_UNHELD = new NoWaypointsEffect(StatusEffectCategory.HARMFUL);
    NO_CAVE_MAPS_UNHELD = new NoCaveMapsEffect(StatusEffectCategory.NEUTRAL);
    NO_CAVE_MAPS_HARMFUL_UNHELD = new NoCaveMapsEffect(StatusEffectCategory.HARMFUL);
  }
}
