package com.expoplatform.web.runner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;
import com.expoplatform.web.config.config;
import com.expoplatform.web.launcher.TestHarness;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * Cucumber Runner
 * 
 * 
 * @author Bhargav Chirumamilla , Created by Bhargav Chirumamilla on 05/05/2022
 *         Copyright (c) 2022 ExpoPlatform . All rights reserved.
 * 
 */

@CucumberOptions(features = { "src/test/java/com/expoplatform/web/Feature" },

		glue = { "com.expoplatform.web.stepdefinition" },

		/*
		 * format = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
		 * "json:target/cucumber-reports/CucumberTestReport.json",
		 * "rerun:target/cucumber-reports/re-run.txt" },
		 */
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:TestResults/cucumber-reports/TestAutomation.html",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" }, monochrome = true, dryRun = false, tags = { "@RegressionTest" })

public class CucumberTest extends TestHarness {

	private static TestNGCucumberRunner testRunner;

	@Before
	public void beforeScenario(Scenario scenario) {
		Reporter.assignAuthor("Bhargav Chirumamilla");
	}

	@BeforeClass
	private void launchTest() {

		testRunner = new TestNGCucumberRunner(CucumberTest.class);

	}

	@Test(description = "Apps", dataProvider = "Feature")
	public void login(CucumberFeatureWrapper cFeature) {
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	@DataProvider(name = "Feature")
	public Object[][] getFeatures() {
		return testRunner.provideFeatures();
	}

	@AfterClass
	public static void report() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extentconfig.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", System.getProperty("os.name"));
		Reporter.setSystemInfo("Country", config.getCountry());
		Reporter.setSystemInfo("Platform", config.getPlatform());
		Reporter.setSystemInfo("Language", config.getLanguage());
		testRunner.finish();
	}

}
