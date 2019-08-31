package com.sakdd.logging;

import org.apache.log4j.Logger;

public class App 
{
	private static final Logger LOGGER = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	LOGGER.info("It is info");
    	LOGGER.error("It is error");
    	LOGGER.debug("It is debug");
    	LOGGER.fatal("It is fatal");
    	LOGGER.trace("It is trace");
    }
}
