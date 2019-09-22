package pl.c9f.marbekits.util;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class MapUtil {
	
	private MapUtil() {
	}
	  
	public static String mapToString(Map<String, Integer> wordsByKey) {
	    String mapAsString = wordsByKey.keySet().stream()
	      .map(key -> key + "=" + wordsByKey.get(key))
	      .collect(Collectors.joining(", ", "{", "}"));
	    return mapAsString;
	}
	
	public static Map<String, String> stringToMap(String mapAsString) {
	    Map<String, String> map = Arrays.stream(mapAsString.split(","))
	      .map(entry -> entry.split("="))
	      .collect(Collectors.toMap(entry -> entry[0], entry -> entry[1]));
	    return map;
	}
	public static String getValueFromMap(Map<String, String> map, String s) {
		final String s1 = " " + s;
		final String s2 = "{" + s;
		if(map.get(s1) != null) {
			return map.get(s1).replace("}", "").replace("{", "");
		}
		if(map.get(s2) != null) {
			return map.get(s2).replace("}", "").replace("{", "");
		}
		if(map.get(s) != null) {
			return map.get(s).replace("}", "").replace("{", "");
		}
		return null;
		
	}
}
