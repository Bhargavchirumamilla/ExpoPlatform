package com.expoplatform.web.config;



/**
 * Web Config
 * 
 * @author Bhargav Chirumamilla , Created by Bhargav Chirumamilla on 05/05/2022
 *         Copyright (c) 2022 ExpoPlatform . All rights reserved.
 * 
 */

public class config {

	private static String platform;
	private static String concept;
	private static String country;
	private static String language;
	private static String buildVersion;
	private static String authenticationURL;

	public static String getBuildVersion() {
		return buildVersion;
	}

	public static void setBuildVersion(String buildVersion) {
		config.buildVersion = buildVersion;
	}

	public static String getPlatform() {
		return platform;
	}

	public static void setPlatform(String platform) {
		config.platform = platform;
	}

	public static String getConcept() {
		return concept;
	}

	public static void setConcept(String concept) {
		config.concept = concept;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		config.country = country;
	}

	public static String getLanguage() {
		return language;
	}

	public static void setLanguage(String language) {
		config.language = language;
	}

	public static void setAuthenticationURL(String authenticationURL) {
		config.authenticationURL = authenticationURL;
	}

	public static String getAuthenticationURL() {
		return authenticationURL;
	}

}
