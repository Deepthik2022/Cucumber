package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Sep23a.feature",glue="org.step",
monochrome=true,plugin="usage",dryRun=true,snippets=SnippetType.CAMELCASE,strict=true)
public class Sep23aTestRunner {

}
 