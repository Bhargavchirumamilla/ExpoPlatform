/**
 * BaseDeviceElement
 * 
 *@author Bhargav Chirumamilla , Created by Bhargav Chirumamilla on 05/05/2022
 *         Copyright (c) 2022 ExpoPlatform . All rights reserved.
 * 
 */

package com.expoplatform.web.utilities;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.expoplatform.web.helper.LoggerHelper;
import com.expoplatform.web.launcher.TestHarness;

public abstract class BaseBrowserView extends TestHarness {
	protected Object elementSelector;
	protected static Logger log = LoggerHelper.getLogger(BaseBrowserView.class);

	public boolean verify_element_Enabled(WebElement element) {
		boolean res = element.isEnabled();
		log.info("User found  element in screen is available : " + res);
		return res;
	}

	public String verify_element(WebElement element) throws InterruptedException {
		String ele = element.getText().trim();
		return ele;
	}

	public boolean verify_element_Present(WebElement element) {
		boolean res = element.isDisplayed();
		log.info("User found  element is Displayed in screen is available : " + res);
		return res;
	}

	public void tap(WebElement element) {
		element.click();
		log.info("User Tap Web Element is  : " + element);

	}

	public void clearTextBoxWithTip(WebElement element) {
		element.clear();
		log.info("User Clear Text Box With Tip is  : " + element);
	}

	public BaseBrowserView(WebDriver testdriver) {

	}

}