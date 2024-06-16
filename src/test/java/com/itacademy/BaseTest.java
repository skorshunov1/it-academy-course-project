package com.itacademy.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class DriverManager {
    protected WebDriver driver;


    @BeforeMethod
    public void choiceBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stkor\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod
    public void end() {
        driver.quit();
    }
}
