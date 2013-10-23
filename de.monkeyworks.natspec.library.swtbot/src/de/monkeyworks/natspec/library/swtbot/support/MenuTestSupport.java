package de.monkeyworks.natspec.library.swtbot.support;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.waits.ICondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;

import de.devboost.natspec.annotations.TextSyntax;

public class MenuTestSupport {

	private static final String PATH_SEPARATOR = ">";
	private SWTBot bot;

	public MenuTestSupport(SWTBot bot) {
		this.bot = bot;
	}

	@TextSyntax("Click menu entry in main menu #1")
	public void clickMenuEntry(List<String> path) {
		clickMenuEntry((Collection<String>) path);
	}

	public void clickMenuEntry(Collection<String> path) {
		SWTBotMenu latestEntry = null;
		for (final String entry : path) {
			if (entry.equals(PATH_SEPARATOR)) {
				continue;
			}
			waitUntilMenuEntryAppearsOrTimeout(entry);
			latestEntry = bot.menu(entry);
		}

		latestEntry.click();
	}

	public void clickMenuEntry(String... path) {
		clickMenuEntry(Arrays.asList(path));
	}

	private void waitUntilMenuEntryAppearsOrTimeout(final String entry) {
		bot.waitUntil(new ICondition() {
			@Override
			public boolean test() throws Exception {
				SWTBotMenu candidate = bot.menu(entry);
				return candidate.isVisible() && candidate.isEnabled();
			}

			@Override
			public void init(SWTBot bot) {
			}

			@Override
			public String getFailureMessage() {
				return "Menu '" + entry + "' did not appear.";
			}
		});
	}

}
