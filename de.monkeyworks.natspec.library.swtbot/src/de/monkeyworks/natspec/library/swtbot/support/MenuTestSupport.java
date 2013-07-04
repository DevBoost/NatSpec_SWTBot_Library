package de.monkeyworks.natspec.library.swtbot.support;

import java.util.List;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;

import de.devboost.natspec.annotations.TextSyntax;

public class MenuTestSupport {

	private static final String PATH_SEPARATOR = ">";
	private SWTBot bot;

	public MenuTestSupport(SWTBot bot) {
		this.bot = bot;
	}

	@TextSyntax("Click menu entry in main menu #1")
	public void clickInMainMenuFileNewProject(List<String> path) {
		SWTBotMenu latestEntry = null;
		for (String entry : path) {
			if (entry.equals(PATH_SEPARATOR)) {
				continue;
			}
			latestEntry = bot.menu(entry);
		}
		latestEntry.click();
	}
}
