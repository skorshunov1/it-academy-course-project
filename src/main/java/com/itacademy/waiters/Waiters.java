package com.itacademy.waiters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;

public class Waiters {
    protected WebDriver driver;
    public static WebElement clickWebElement(WebElement webElement,WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(webElement));
        return webElement;
    }
    public static WebElement waitElementClickable(WebElement element, WebDriver driver){
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(element));
        return element;


    }


}
