package de.monkeyworks.natspec.library.swtbot.util;

import java.util.List;

public class SWTBotUtils {

	public static String asString(List<String> list) {
		return asString(list, " ");
	}

	public static String asString(List<String> list, String separator) {
		StringBuffer buf = new StringBuffer();
		for (String s : list) {
			if (!(buf.length() == 0)) {
				buf.append(separator);
			}
			buf.append(s);
		}
		return buf.toString();
	}
	
}
