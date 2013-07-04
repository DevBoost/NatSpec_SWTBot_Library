package de.monkeyworks.natspec.library.swtbot.support;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.eclipse.swtbot.swt.finder.SWTBot;

import de.devboost.natspec.annotations.TextSyntax;

public class ScreenshotTestSupport {

	private static final String SCREENSHOTS_BASE_DIR = "." + File.separator
			+ "screens" + File.separator;
	private SWTBot bot;

	public ScreenshotTestSupport(SWTBot bot) {
		this.bot = bot;
	}

	@TextSyntax("Make a Screenshot called #1")
	public void makeAScreenshotCalledNewProjectWizard(String fileName) {
		assertTrue(bot.captureScreenshot(SCREENSHOTS_BASE_DIR + fileName));
	}
}
