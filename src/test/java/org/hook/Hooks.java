package org.hook;

import org.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void beforeEachScenario() {
		browserConfig();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
	}
	@After
	public void afterEachScenario() {
		close();
	}
}
