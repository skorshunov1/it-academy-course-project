package com.itacademy.utils.pages.pages;

import com.itacademy.utils.pages.utils.ScreenshotUtils;
import com.itacademy.utils.pages.waiters.Waiters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends MainPage{
    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class);

    private WebDriver driver;

    @FindBy(xpath = "//a[@aria-label=\"Login\"]")
    private WebElement account;
    @FindBy(xpath = "//input[@type=\"email\"][@autocomplete=\"username\"]")
    private WebElement login;
    @FindBy(css = "[class*='login-button']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//input[@required=\"required\"]")
    private WebElement code;
    @FindBy(css = "[class*='primary ui-button']")
    private WebElement buttonSubmit;
    @FindBy(xpath = "//h3[@class='ui-subheading ui-subheading--subdued']")
    private WebElement getIsErrorPresent;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAccountButton() {
        Waiters.clickWebElement(account, driver);
        account.click();
    }

    public void typeLogin(String text) {
        login.sendKeys(text);
        ScreenshotUtils.saveScreenshot(driver);
    }

    public void clickButtonContinue() {
        Waiters.clickWebElement(buttonContinue, driver);
        buttonContinue.click();
    }

    public void typeCodeInputField(String text) {
        Waiters.clickWebElement(code, driver);
        code.sendKeys(text);
        ScreenshotUtils.saveScreenshot(driver);
    }

    public void clickButtonSubmit() {
        Waiters.clickWebElement(buttonSubmit, driver);
        buttonSubmit.click();
    }

    public String getIsErrorPresent() {
        return getIsErrorPresent.getText();
    }
}
