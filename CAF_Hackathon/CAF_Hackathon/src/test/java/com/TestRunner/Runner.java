package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)	
@CucumberOptions(features=".\\Features\\BitfinexAPI.feature",glue={"com.api.bitfinex.tests"}
,strict = false , 
dryRun = false,
monochrome = true, 
snippets = SnippetType.CAMELCASE,
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"})

						
public class Runner 				
{		

}
