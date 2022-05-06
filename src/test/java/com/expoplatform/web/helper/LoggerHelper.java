package com.expoplatform.web.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Logger Helper
 * 
 * @author Bhargav Chirumamilla , Created by Bhargav Chirumamilla on 05/05/2022
 *         Copyright (c) 2022 ExpoPlatform . All rights reserved.
 *
 */
public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}

	public static void main(String[] args) {
		Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		log.info("I am test");

	}
}
