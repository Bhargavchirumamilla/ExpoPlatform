package com.expoplatform.web.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.expoplatform.web.helper.LoggerHelper;
import com.expoplatform.web.launcher.TestHarness;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Service Hooks
 * 
 * @author Bhargav Chirumamilla , Created by Bhargav Chirumamilla on 05/05/2022
 *         Copyright (c) 2022 ExpoPlatform . All rights reserved.
 * 
 */
public class ServiceHooks extends TestHarness {
	private static final String testStart = "Test Execution started:";
	private static final String star = "************";
	private static final String testComplete = "Test Execution completed for Test:";
	Logger log = LoggerHelper.getLogger(ServiceHooks.class);
	//Logger log = LoggerHelper.getLogger(Logger.class);
	

	@After
	public void afterMethod(Scenario scenario) throws IOException {

		File srcPath = ((TakesScreenshot) testdriver).getScreenshotAs(OutputType.FILE);
		String dest = null;
		if (scenario.isFailed()) {
			log.info(scenario.getName() + " is Failed");
			dest = System.getProperty("user.dir") + "/screenshotsFailedTests/" + scenario + getCurrentTime() + ".jpg";
			File finalDestination = new File(dest);
			FileUtils.copyFile(srcPath, finalDestination);
			Reporter.addScreenCaptureFromPath(dest.toString());
			log.error("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + scenario.getName()
					+ " has Failed ~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		} else {
			log.info(scenario.getName() + " is Passed");
			dest = System.getProperty("user.dir") + "/Screenshots/" + scenario + getCurrentTime() + ".jpg";
			File finalDestination = new File(dest);
			FileUtils.copyFile(srcPath, finalDestination);
			Reporter.addScreenCaptureFromPath(dest.toString());
			log.info(scenario.getName() + " ---------->has Passed");
		}
		log.info(star + testComplete + scenario.getName() + star + "\n");

	}

	@Before()
	public void setUp(Scenario scenario) {

		Reporter.assignAuthor("Bhargav Chirumamilla");
		log.info(star + testStart + scenario.getName() + star + "\n");

	}

}
