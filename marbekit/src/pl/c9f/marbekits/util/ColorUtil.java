package pl.c9f.marbekits.util;

import java.util.List;
import java.util.stream.Collectors;

import org.bukkit.ChatColor;

public final class ColorUtil {
	
	private ColorUtil() {
	}
	
	public static String fixColor(String string){
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
	public static List<String> colored(List<String> strings) {
		return strings.stream()
				.map(ColorUtil::fixColor)
				.collect(Collectors.toList());
	}
}
