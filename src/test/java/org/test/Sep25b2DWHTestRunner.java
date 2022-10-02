package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import reportsSep25a.Sep25b2DWHReports;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Sep25b2DWH.feature",glue="org.step",
snippets=SnippetType.CAMELCASE,monochrome=true,plugin="json:src\\test\\resources\\Sep25b2DWH\\Sep25b2DWH.json")
public class Sep25b2DWHTestRunner {
@AfterClass
public static void afterClass() {
Sep25b2DWHReports.cucumberReports("src\\test\\resources\\Sep25b2DWH\\Sep25b2DWH.json");
	}
}
