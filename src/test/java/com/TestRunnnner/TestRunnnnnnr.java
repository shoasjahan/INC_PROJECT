package com.TestRunnnner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utiliti.Perent_Base;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/insFeatures"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDep", tags= {"@Sprint92"})

public class TestRunnnnnnr extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void launchURL() {
		Perent_Base test = new Perent_Base();
		test.brinit();
		
		
	}
	
	@AfterTest
	public void closeURL() {
		Perent_Base close = new Perent_Base();
		close.driver.quit();
		
	}

}
