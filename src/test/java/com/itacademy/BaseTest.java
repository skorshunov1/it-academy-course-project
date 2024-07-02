package com.itacademy;

import com.itacademy.utils.pages.listeners.TestListeners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

@Listeners(TestListeners.class)
public class BaseTest {
    static WebDriver driver;


    @BeforeMethod
    public void choiceBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stkor\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }

    @AfterMethod
    public void end() {
        driver.quit();
    }
}
