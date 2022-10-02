package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import reportsSep25a.Sep27aJVMReport;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Sep27a.feature",glue="org.step",
plugin="json:C:\\Users\\Achyutha\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Sep27a\\Sep27a.json")

public class Sep27aTestRunner{
	@AfterClass
	public static void afterClass() {
		Sep27aJVMReport.cucumberReport("src\\test\\resources\\Sep27a\\Sep27a.json");
	}

}
