package com.expoplatform.web.launcher;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.expoplatform.web.config.config;

public class LoadConfigurations {

	/**
	 * Load Configurations
	 * 
	 * @author Bhargav Chirumamilla , Created by Bhargav Chirumamilla
	 *         on 05/05/2022 Copyright (c) 2022 ExpoPlatform . All rights reserved.
	 * 
	 */

	Properties configproperties;
	Properties configpropertieslang;
	config runTimeConfigurations;

	protected static Logger log = LogManager.getLogger(Logger.class.getName());

	private Properties loadConfigProperties(String configFileName) {

		return configproperties = loadProperties(System.getProperty("user.dir") + "/Resources/" + configFileName);
	}

	private Properties loadProperties(String propertyFileName) {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			log.info("Reading of config file started");
			input = new FileInputStream(propertyFileName);
			prop.load(input);
			prop.load(new InputStreamReader(input, "UTF-8"));
		} catch (IOException e) {
			log.error("Reading the config file failed because of IOException." + propertyFileName);
		}

		return prop;

	}

	public void LoadConfigurationsProperties(String configFileName) {

		loadConfigProperties(configFileName);
		config.setPlatform(configproperties.getProperty("platform"));
		log.info(config.getPlatform());
		config.setCountry(configproperties.getProperty("country"));
		config.setLanguage(configproperties.getProperty("language"));
		config.setAuthenticationURL(configproperties.getProperty("UAT_URL_BASIC_AUTH"));
		config.setBuildVersion(configproperties.getProperty("buildVersion"));

	}

	public Properties loadL18nProperties(String configFileName) {
		return loadConfigProperties(configFileName);
	}
}
