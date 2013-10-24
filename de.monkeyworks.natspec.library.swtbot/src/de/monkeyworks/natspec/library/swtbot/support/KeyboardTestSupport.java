package de.monkeyworks.natspec.library.swtbot.support;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.swt.SWT;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;

public class KeyboardTestSupport {

	private static Keyboard keyboard;
	
	static {
		keyboard = KeyboardFactory.getSWTKeyboard();
	}
	
	public static void pressKey(char key) {
		keyboard.pressShortcut(KeyStroke.getInstance(key, 0));
	}
	
	public static void pressKey(KeyStroke keystroke) {
		keyboard.pressShortcut(keystroke);
	}
	
	public static void pressKey(KeyStroke... keys) {
		keyboard.pressShortcut(keys);
	}
	
	public static void pressEnter() {
		keyboard.pressShortcut(SWT.CR, SWT.LF);
	}
}
