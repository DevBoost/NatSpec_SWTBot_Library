package de.monkeyworks.natspec.library.swtbot.tests;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.monkeyworks.natspec.library.swtbot.SWTBotTestCase;
import de.monkeyworks.natspec.library.swtbot.support.MenuTestSupport;
import de.monkeyworks.natspec.library.swtbot.support.ScreenshotTestSupport;

@RunWith(SWTBotJunit4ClassRunner.class)
public class _NatSpecTemplate extends SWTBotTestCase {

	MenuTestSupport menuTestSupport;
	ScreenshotTestSupport screenshotTestSupport;
	@Test
	public void executeScript() throws Exception {
		/* @MethodBody */
	}

	@Before
	public void setUp() {
		menuTestSupport = new MenuTestSupport(getBot());
		screenshotTestSupport = new ScreenshotTestSupport(getBot());
	}

	@After
	public void shutdown() {
	}
}