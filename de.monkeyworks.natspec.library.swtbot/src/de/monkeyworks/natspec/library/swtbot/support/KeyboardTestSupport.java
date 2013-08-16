package de.monkeyworks.natspec.library.swtbot.support;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.swtbot.swt.finder.keyboard.Keyboard;
import org.eclipse.swtbot.swt.finder.keyboard.KeyboardFactory;

public class KeyboardTestSupport {

	public static void pressKey(char key) {
		Keyboard k = KeyboardFactory.getSWTKeyboard();
		k.pressShortcut(KeyStroke.getInstance(key, 0));
	}
}
