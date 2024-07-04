package com.itacademy.utils.pages.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    private static final Logger LOGGER = LogManager.getLogger(MainPage.class);

    private WebDriver driver;

    @FindBy(xpath = "//button[@aria-label=\"Close dialog 3\"]")
    private WebElement closeDialogButton;


    private String url = "https://www.gornation.com/";


    public void openUrl() {
        driver.get("https://www.gornation.com/");
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButtonCloseDialog() {

        if (closeDialogButton.isDisplayed()) {
            closeDialogButton.click();
        } else {
            LOGGER.info("Display is not");

        }

    }
}

