package com.itacademy;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

    int initCount = 0;
    int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (initCount < maxRetryCount) {
            initCount++;
            return true;
        }
        return false;
    }

}
