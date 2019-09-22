package pl.c9f.marbekits.util;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.enchantments.Enchantment;
   
public final class Enchantments {
	private static final Map<String, Enchantment> ENCHANTMENTS = new HashMap<>();
	private static Map<String, Enchantment> ALIASES_ENCHANTMENTS = new HashMap<>();
	
	
	public Enchantments(){
		ENCHANTMENTS.put("alldamage", Enchantment.DAMAGE_ALL);
		ENCHANTMENTS.put("sharpness", Enchantment.DAMAGE_ALL);
		ALIASES_ENCHANTMENTS.put("alldmg", Enchantment.DAMAGE_ALL);
		ALIASES_ENCHANTMENTS.put("sharp", Enchantment.DAMAGE_ALL);
		ALIASES_ENCHANTMENTS.put("dal", Enchantment.DAMAGE_ALL);
		ENCHANTMENTS.put("ardmg", Enchantment.DAMAGE_ARTHROPODS);
		ENCHANTMENTS.put("baneofarthropods", Enchantment.DAMAGE_ARTHROPODS);
		ALIASES_ENCHANTMENTS.put("baneofarthropod", Enchantment.DAMAGE_ARTHROPODS);
		ALIASES_ENCHANTMENTS.put("arthropod", Enchantment.DAMAGE_ARTHROPODS);
		ALIASES_ENCHANTMENTS.put("dar", Enchantment.DAMAGE_ARTHROPODS);
		ENCHANTMENTS.put("undeaddamage", Enchantment.DAMAGE_UNDEAD);
		ENCHANTMENTS.put("smite", Enchantment.DAMAGE_UNDEAD);
		ALIASES_ENCHANTMENTS.put("du", Enchantment.DAMAGE_UNDEAD);
		ENCHANTMENTS.put("digspeed", Enchantment.DIG_SPEED);
		ENCHANTMENTS.put("efficiency", Enchantment.DIG_SPEED);
		ALIASES_ENCHANTMENTS.put("minespeed", Enchantment.DIG_SPEED);
		ALIASES_ENCHANTMENTS.put("cutspeed", Enchantment.DIG_SPEED);
		ALIASES_ENCHANTMENTS.put("ds", Enchantment.DIG_SPEED);
		ALIASES_ENCHANTMENTS.put("eff", Enchantment.DIG_SPEED);
		ENCHANTMENTS.put("durability", Enchantment.DURABILITY);
		ALIASES_ENCHANTMENTS.put("dura", Enchantment.DURABILITY);
		ENCHANTMENTS.put("unbreaking", Enchantment.DURABILITY);
		ALIASES_ENCHANTMENTS.put("d", Enchantment.DURABILITY);
		ALIASES_ENCHANTMENTS.put("unb", Enchantment.DURABILITY);
		ALIASES_ENCHANTMENTS.put("ub", Enchantment.DURABILITY);
		ENCHANTMENTS.put("thorns", Enchantment.THORNS);
		ENCHANTMENTS.put("highcrit", Enchantment.THORNS);
		ALIASES_ENCHANTMENTS.put("thorn", Enchantment.THORNS);
		ALIASES_ENCHANTMENTS.put("highercrit", Enchantment.THORNS);
		ALIASES_ENCHANTMENTS.put("t", Enchantment.THORNS);
		ENCHANTMENTS.put("fireaspect", Enchantment.FIRE_ASPECT);
		ENCHANTMENTS.put("fire", Enchantment.FIRE_ASPECT);
		ALIASES_ENCHANTMENTS.put("meleefire", Enchantment.FIRE_ASPECT);
		ALIASES_ENCHANTMENTS.put("meleeflame", Enchantment.FIRE_ASPECT);
		ALIASES_ENCHANTMENTS.put("fa", Enchantment.FIRE_ASPECT);
		ENCHANTMENTS.put("knockback", Enchantment.KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("kback", Enchantment.KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("kb", Enchantment.KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("knock", Enchantment.KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("k", Enchantment.KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("blockslootbonus", Enchantment.LOOT_BONUS_BLOCKS);
		ENCHANTMENTS.put("fortune", Enchantment.LOOT_BONUS_BLOCKS);
		ALIASES_ENCHANTMENTS.put("fort", Enchantment.LOOT_BONUS_BLOCKS);
		ALIASES_ENCHANTMENTS.put("lbb", Enchantment.LOOT_BONUS_BLOCKS);
		ALIASES_ENCHANTMENTS.put("mobslootbonus", Enchantment.LOOT_BONUS_MOBS);
		ENCHANTMENTS.put("mobloot", Enchantment.LOOT_BONUS_MOBS);
		ENCHANTMENTS.put("looting", Enchantment.LOOT_BONUS_MOBS);
		ALIASES_ENCHANTMENTS.put("lbm", Enchantment.LOOT_BONUS_MOBS);
		ALIASES_ENCHANTMENTS.put("oxygen", Enchantment.OXYGEN);
		ENCHANTMENTS.put("respiration", Enchantment.OXYGEN);
		ALIASES_ENCHANTMENTS.put("breathing", Enchantment.OXYGEN);
		ENCHANTMENTS.put("breath", Enchantment.OXYGEN);
		ALIASES_ENCHANTMENTS.put("o", Enchantment.OXYGEN);
		ENCHANTMENTS.put("protection", Enchantment.PROTECTION_ENVIRONMENTAL);
		ALIASES_ENCHANTMENTS.put("prot", Enchantment.PROTECTION_ENVIRONMENTAL);
		ENCHANTMENTS.put("protect", Enchantment.PROTECTION_ENVIRONMENTAL);
		ALIASES_ENCHANTMENTS.put("p", Enchantment.PROTECTION_ENVIRONMENTAL);
		ALIASES_ENCHANTMENTS.put("explosionsprotection", Enchantment.PROTECTION_EXPLOSIONS);
		ALIASES_ENCHANTMENTS.put("explosionprotection", Enchantment.PROTECTION_EXPLOSIONS);
		ALIASES_ENCHANTMENTS.put("expprot", Enchantment.PROTECTION_EXPLOSIONS);
		ALIASES_ENCHANTMENTS.put("blastprotection", Enchantment.PROTECTION_EXPLOSIONS);
		ENCHANTMENTS.put("blastprotect", Enchantment.PROTECTION_EXPLOSIONS);
		ALIASES_ENCHANTMENTS.put("pe", Enchantment.PROTECTION_EXPLOSIONS);
		ALIASES_ENCHANTMENTS.put("fallprotection", Enchantment.PROTECTION_FALL);
		ENCHANTMENTS.put("fallprot", Enchantment.PROTECTION_FALL);
		ENCHANTMENTS.put("featherfall", Enchantment.PROTECTION_FALL);
		ALIASES_ENCHANTMENTS.put("featherfalling", Enchantment.PROTECTION_FALL);
		ALIASES_ENCHANTMENTS.put("pfa", Enchantment.PROTECTION_FALL);
		ALIASES_ENCHANTMENTS.put("fireprotection", Enchantment.PROTECTION_FIRE);
		ALIASES_ENCHANTMENTS.put("flameprotection", Enchantment.PROTECTION_FIRE);
		ENCHANTMENTS.put("fireprotect", Enchantment.PROTECTION_FIRE);
		ALIASES_ENCHANTMENTS.put("flameprotect", Enchantment.PROTECTION_FIRE);
		ENCHANTMENTS.put("fireprot", Enchantment.PROTECTION_FIRE);
		ALIASES_ENCHANTMENTS.put("flameprot", Enchantment.PROTECTION_FIRE);
		ALIASES_ENCHANTMENTS.put("pf", Enchantment.PROTECTION_FIRE);
		ENCHANTMENTS.put("projectileprotection", Enchantment.PROTECTION_PROJECTILE);
		ENCHANTMENTS.put("projprot", Enchantment.PROTECTION_PROJECTILE);
		ALIASES_ENCHANTMENTS.put("pp", Enchantment.PROTECTION_PROJECTILE);
		ENCHANTMENTS.put("silktouch", Enchantment.SILK_TOUCH);
		ALIASES_ENCHANTMENTS.put("softtouch", Enchantment.SILK_TOUCH);
		ALIASES_ENCHANTMENTS.put("st", Enchantment.SILK_TOUCH);
		ENCHANTMENTS.put("waterworker", Enchantment.WATER_WORKER);
		ENCHANTMENTS.put("aquaaffinity", Enchantment.WATER_WORKER);
		ALIASES_ENCHANTMENTS.put("watermine", Enchantment.WATER_WORKER);
		ALIASES_ENCHANTMENTS.put("ww", Enchantment.WATER_WORKER);
		ALIASES_ENCHANTMENTS.put("firearrow", Enchantment.ARROW_FIRE);
		ENCHANTMENTS.put("flame", Enchantment.ARROW_FIRE);
		ENCHANTMENTS.put("flamearrow", Enchantment.ARROW_FIRE);
		ALIASES_ENCHANTMENTS.put("af", Enchantment.ARROW_FIRE);
		ENCHANTMENTS.put("arrowdamage", Enchantment.ARROW_DAMAGE);
		ENCHANTMENTS.put("power", Enchantment.ARROW_DAMAGE);
		ALIASES_ENCHANTMENTS.put("arrowpower", Enchantment.ARROW_DAMAGE);
		ALIASES_ENCHANTMENTS.put("ad", Enchantment.ARROW_DAMAGE);
		ENCHANTMENTS.put("arrowknockback", Enchantment.ARROW_KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("arrowkb", Enchantment.ARROW_KNOCKBACK);
		ENCHANTMENTS.put("punch", Enchantment.ARROW_KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("arrowpunch", Enchantment.ARROW_KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("ak", Enchantment.ARROW_KNOCKBACK);
		ALIASES_ENCHANTMENTS.put("infinitearrows", Enchantment.ARROW_INFINITE);
		ENCHANTMENTS.put("infarrows", Enchantment.ARROW_INFINITE);
		ENCHANTMENTS.put("infinity", Enchantment.ARROW_INFINITE);
		ALIASES_ENCHANTMENTS.put("infinite", Enchantment.ARROW_INFINITE);
		ALIASES_ENCHANTMENTS.put("unlimited", Enchantment.ARROW_INFINITE);
		ALIASES_ENCHANTMENTS.put("unlimitedarrows", Enchantment.ARROW_INFINITE);
		ALIASES_ENCHANTMENTS.put("ai", Enchantment.ARROW_INFINITE);
	}  
	
	public static Enchantment getEnchantment(String string) {
		String enchantmentName = string.toLowerCase();
		if (ENCHANTMENTS.get(enchantmentName) != null) {
			return (Enchantment)ENCHANTMENTS.get(enchantmentName);
		}
		if (ALIASES_ENCHANTMENTS.get(enchantmentName) != null) {
			return (Enchantment)ALIASES_ENCHANTMENTS.get(enchantmentName);
		}
		return null;
	}
}

