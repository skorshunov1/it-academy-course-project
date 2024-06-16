package com.itacademy.utils.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {
    protected WebDriver driver;

    public Waiters(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement clickWebElement(WebElement webElement) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }


}
