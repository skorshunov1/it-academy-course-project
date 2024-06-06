package com.itacademy.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\stkor\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://workoutshop.ru/");
    }
}
