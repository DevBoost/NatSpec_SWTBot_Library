package de.monkeyworks.natspec.library.swtbot;

/*
 * #%MONKEY_WORKS_LICENSE
 * de.monkeyworks.movisa.test
 * %%
 * Copyright (C) 2013 MONKEY WORKS
 * %%
 * ============
 * CONFIDENTIAL
 * ============
 * 
 * All Rights Reserved.
 * 
 * NOTICE: All information contained herein is, and remains
 * the property of the Copyright holder and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to the Copyright holder and its
 * suppliers and may be covered by German and Foreign Patents,
 * patents in process, and are protected by trade secret or
 * copyright law. Dissemination of this information or
 * reproduction of this material is strictly forbidden unless
 * prior written permission is obtained from the Copyright
 * holder.
 * #MONKEY_WORKS_LICENSE%
 */

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.ui.internal.SaveableHelper;


public abstract class SWTBotTestCase {
	protected SWTWorkbenchBot bot = new SWTWorkbenchBot();

	public SWTBotTestCase() {
		// We need to give the SWTBot some time to find itself
		SWTBotPreferences.TIMEOUT = 10000;

		// Explicitly set the keyboard layout
		SWTBotPreferences.KEYBOARD_LAYOUT = "EN_US";

		// enable to close the editor even if a dialog pops up in order to
		// notify the user about unsaved changes
		SaveableHelper.testSetAutomatedResponse(1);
		
		// Wait a couple of seconds until the editor was fully loaded. The
		// waitUntil method does not work on the build server. It always
		// interrupts waiting for the menu to appear due to a timeout. Hence
		// just use this ordinary sleep method.
		getBot().sleep(3000);
	}

	public SWTBot getBot() {
		return bot;
	}
}
