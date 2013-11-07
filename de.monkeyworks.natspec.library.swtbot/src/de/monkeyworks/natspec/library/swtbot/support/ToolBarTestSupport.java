package de.monkeyworks.natspec.library.swtbot.support;

import java.util.List;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarButton;

import de.devboost.natspec.annotations.TextSyntax;
import de.monkeyworks.natspec.library.swtbot.util.SWTBotUtils;

public class ToolBarTestSupport {

	private SWTBot bot;

	public ToolBarTestSupport(SWTBot bot) {
		this.bot = bot;
	}
	
	@TextSyntax("Click toolbar button with tooltip #1")
	public void clickToolBarButtonWithTooltip(List<String> tooltipSentence) {
		String tooltip = SWTBotUtils.asString(tooltipSentence);
		clickToolBarButtonWithTooltip(tooltip);
	}

//	@TextSyntax("Click toolbar button with tooltip #1")
	public void clickToolBarButtonWithTooltip(String tooltip) {
		SWTBotToolbarButton button = bot.toolbarButtonWithTooltip(tooltip);
		button.click();
	}
}
