package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)	
@CucumberOptions(features=".\\Features\\BitfinexAPI.feature",glue={"com.api.bitfinex.test"}
,strict = false , 
dryRun = false,
monochrome = true, 
//snippets = SnippetType.CAMELCASE,
plugin = {"pretty" ,"html:target/Cucumber-reprots"})

						
public class Runner 				
{		

}
