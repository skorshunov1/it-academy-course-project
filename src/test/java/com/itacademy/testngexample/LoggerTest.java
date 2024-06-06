package com.itacademy.testngexample;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerTest {
    private static final Logger LOGGER = LogManager.getLogger(LoggerTest.class);

    @Test
    public void loggerTest(){
        LOGGER.debug("debug");
        LOGGER.info("info");

    }
}
