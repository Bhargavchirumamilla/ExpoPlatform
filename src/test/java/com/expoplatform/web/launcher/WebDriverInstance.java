
package com.expoplatform.web.launcher;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.expoplatform.web.config.config;


/**
 * Web SetUp for Chrome and FireFox
 * 
 * @author Bhargav Chirumamilla , Created by Bhargav Chirumamilla
 *         on 05/05/2022 Copyright (c) 2022 ExpoPlatform . All rights reserved.
 * 
 */
public class WebDriverInstance {

	private static WebDriver driver;
	static DesiredCapabilities capabilities;
	protected static Logger log = LogManager.getLogger(Logger.class.getName());
	
	public static WebDriver startChrome() throws MalformedURLException, InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.merge(getChromeDriverCapabilites());
		driver = new ChromeDriver(chromeOptions);
		driver.get(config.getAuthenticationURL());
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(1410, 1100));
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriver startChromeHeadLess() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1200x600");
		driver = new ChromeDriver(options);
		driver.get(config.getAuthenticationURL());
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(1410, 1100));
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		return driver;
	}

	public static WebDriver startFireFox() throws MalformedURLException, InterruptedException {
		FirefoxOptions ffOptions = new FirefoxOptions();
		ffOptions.merge(getFireFoxDriverCapabilites());
		driver = new FirefoxDriver(ffOptions);
		driver.get(config.getAuthenticationURL());
		driver.manage().window().maximize();
		return driver;
	}

	public static DesiredCapabilities getChromeDriverCapabilites() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("AUTOMATION NAME", "Expo Platform  Web Automation");
		capabilities.setJavascriptEnabled(true);
		log.info("Launching: " + capabilities.getCapability("AUTOMATION NAME"));
		capabilities.setPlatform(Platform.MAC);
		log.info("The platform is " + "MAC");
		log.info("Running tests on Browser: " + capabilities.getBrowserName());
		log.info(capabilities.getVersion());
		return capabilities;
	}

	public static DesiredCapabilities getFireFoxDriverCapabilites() {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("AUTOMATION NAME", "LandmarkShops Web Automation");
		capabilities.setCapability("marionette", true);
		capabilities.setJavascriptEnabled(true);
		log.info("Launching: " + capabilities.getCapability("AUTOMATION NAME"));
		log.info("The platform is " + capabilities.getPlatform());
		log.info("Running tests on Browser: " + capabilities.getBrowserName());
		log.info(capabilities.getVersion());
		log.info(capabilities.getCapability("profile"));
		return capabilities;
	}

}
