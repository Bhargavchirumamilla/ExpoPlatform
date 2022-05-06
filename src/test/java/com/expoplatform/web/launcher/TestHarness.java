
package com.expoplatform.web.launcher;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.expoplatform.web.config.config;
import com.expoplatform.web.helper.LoggerHelper;

public class TestHarness {

	/**
	 * Web TestHarness for Chrome and FireFox
	 * 
	 * @author Bhargav Chirumamilla , Created by Bhargav Chirumamilla
	 *         on 05/05/2022 Copyright (c) 2022 ExpoPlatform . All rights reserved.
	 * 
	 */

	WebDriverInstance deviceSetup;

	protected static WebDriver testdriver;
	public static Properties configProperties;
	
	static String Createdreport;
	Document testReportObject;
	LoadConfigurations load;
	String path;
	String name;
	
	public static ExtentReports extent;
	private static ExtentHtmlReporter htmlReporter;
	Logger log = LoggerHelper.getLogger(TestHarness.class);
	private static SimpleDateFormat calendarDate;
	
	DesiredCapabilities capabilities;

	

	/**
	 * @param configFileName to pass web App configuration properties
	 * @return Web driver instance
	 * @throws InterruptedException
	 * @throws IOException
	 * 
	 * 
	 */

	@BeforeSuite

	@Parameters({ "configFileName" })
	public WebDriver setupDriver(String configFileName) throws IOException, InterruptedException {
		
		loadconfigurations(configFileName);
		
		deleteScreenshots("Screenshots");
		deleteScreenshots("screenshotsFailedTests");

		if (config.getPlatform().equalsIgnoreCase("Chrome")) {

			testdriver = WebDriverInstance.startChrome();

		} else if (config.getPlatform().equalsIgnoreCase("HeadLess Chrome")) {

			testdriver = WebDriverInstance.startChromeHeadLess();

		} else if (config.getPlatform().equalsIgnoreCase("FireFox")) {

			testdriver = WebDriverInstance.startFireFox();

		}
		return testdriver;

	}

	/**
	 * @param fileName to create file for test results
	 * 
	 */
	public static ExtentReports createTestResult(String fileName) {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/TestResults/" + fileName);

		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(fileName);
		htmlReporter.start();
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extentconfig.xml");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		return extent;

	}

	public static ExtentReports createReport() {
		calendarDate = new SimpleDateFormat("yyyy.MMMMM.dd hh:mm:aaa");
		Createdreport = config.getPlatform() + " " + config.getCountry() + " " + config.getConcept() + " "
				+ "TestAutomation" + calendarDate.format(new Date()) + ".html";
		return TestHarness.createTestResult(Createdreport);
	}

	private void loadconfigurations(String configFileName) {

		log.info("Method called for loading config file.");
		load = new LoadConfigurations();
		load.LoadConfigurationsProperties(configFileName);

	}

	@AfterSuite
	public void stopTest(ITestContext context) throws InterruptedException {
		String reportPath = System.getProperty("user.dir") + "/TestResults/cucumber-reports/" + "TestAutomation.html";
		log.info("Report Path Location:  " + reportPath);
		testdriver.quit();

	}

	public static Timestamp getCurrentTime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Current timestamp is: " + timestamp);
		return timestamp;
	}

	public void deleteScreenshots(String fileName) throws IOException {

		File file = new File(System.getProperty("user.dir") + "/" + fileName + "/");
		String[] myFiles;
		if (file.isDirectory()) {
			myFiles = file.list();
			for (int i = 0; i < myFiles.length; i++) {
				File myFile = new File(file, myFiles[i]);
				myFile.delete();
			}

		}

	}
}
