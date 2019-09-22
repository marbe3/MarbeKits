package pl.c9f.marbekits.util;

public final class IntUtil {
	
	private IntUtil() {		
	}
	
	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException ex) {}
		return false;
	}
}
