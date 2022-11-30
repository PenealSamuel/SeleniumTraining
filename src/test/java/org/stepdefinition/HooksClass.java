package org.stepdefinition;

import org.bas.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before
	private void precondition() {
		launchBrowser();
		windowMaximize();

	}

	@After
	private void postCondition() {
		closeEntireBrowser();
	}

}
