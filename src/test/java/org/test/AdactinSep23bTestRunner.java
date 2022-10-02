package org.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\AdactinSep23b.feature",glue="org.step",
monochrome=true,plugin="pretty")
public class AdactinSep23bTestRunner {
}
