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
public class HelloWorldExample extends SWTBotTestCase {

	MenuTestSupport menuTestSupport;
	ScreenshotTestSupport screenshotTestSupport;
	@Test
	public void executeScript() throws Exception {
		// The code in this method is generated from: /de.monkeyworks.natspec.library.swtbot.tests/src/de/monkeyworks/natspec/library/swtbot/tests/HelloWorldExample.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		
		// Click menu entry in main menu File > New > Example...
		menuTestSupport.clickMenuEntry(java.util.Arrays.asList(new java.lang.String[] {"File", ">", "New", ">", "Example..."}));
		// Make a Screenshot called New_Examples_Wizard.jpg
		screenshotTestSupport.makeAScreenshotCalledNewProjectWizard("New_Examples_Wizard.jpg");
		
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