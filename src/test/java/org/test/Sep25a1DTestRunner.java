package org.test;

//import org.apache.commons.lang.math.JVMRandom;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import reportsSep25a.ReportsSep25a;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Sep25a1D.feature",glue="org.step",monochrome=true,plugin= {"pretty",
		"html:src\\test\\resources\\Sep25a","json:src\\test\\resources\\Sep25a\\sep25a.json","junit:src\\test\\resources\\Sep25a\\sep25a.xml"})
public class Sep25a1DTestRunner {
@AfterClass
public static void afterClass() {
	ReportsSep25a.cucumberReports("src\\test\\resources\\Sep25a\\sep25a.json");
}
}
 