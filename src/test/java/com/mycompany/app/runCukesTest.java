package com.mycompany.app;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:cucumber"},
        plugin = {"pretty", "html:/tmp/Destination"})
        
public class runCukesTest {
	
  
  //This test is intentionally blank
  
  //See: 
  //  * src/test/resources for Gherkin Feature files
  //  * bank.Stepdefs for step definitions
	
	// 
	//
  
}