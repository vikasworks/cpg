package com.etl.aapi.springframework;

import org.springframework.context.ApplicationContext;

public class ApplicationContextProvider {
	private static ApplicationContext applicationContext;

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		ApplicationContextProvider.applicationContext = applicationContext;
	}
	
	
	
}
