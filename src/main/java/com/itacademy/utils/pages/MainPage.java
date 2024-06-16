package com.itacademy.utils.pages;

import com.itacademy.utils.pages.waiters.Waiters;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






public class MainPage {
    private WebDriver driver;
    private JavascriptExecutor js;

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
    @FindBy(xpath = "//a[@aria-controls=\"desktop-menu-3\"]")
    private WebElement buttonEquipment;
    @FindBy(xpath = "//a[@href=\"/products/workout-rings-set\"][@class=\"product-item-meta__title\"]")
    private WebElement buttonRingsSet;
    @FindBy(xpath = "//b[text()=\"Workout Rings Set\"]")
    private WebElement getTextWtRiSe;
    @FindBy(xpath = "//button[@aria-label=\"Close dialog 3\"]")
    private WebElement closeDialogButton;
    @FindBy(xpath="//button[@id=\"AddToCart\"]")
    private WebElement buttonToBasket;
    @FindBy(xpath = "//a[text()=\"Workout Rings Set\"]")
    private WebElement productRingSet;


    private String url = "https://www.gornation.com/";


    public void openUrl() {
        driver.get("https://www.gornation.com/");
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAccountButton() {
        Waiters.clickWebElement(account, driver);
        account.click();
    }

    public void typeLogin(String text) {
       /* int length = 7;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);*/
        login.sendKeys(text);
    }

    public void clickButtonContinue() {
        Waiters.clickWebElement(buttonContinue, driver);
        buttonContinue.click();
    }

    public void typeCodeInputField(String text) {
        Waiters.clickWebElement(code, driver);
        code.sendKeys(text);
    }

    public void clickButtonSubmit() {
        Waiters.clickWebElement(buttonSubmit, driver);
        buttonSubmit.click();
    }

    public String getIsErrorPresent() {
        return getIsErrorPresent.getText();
    }

    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,950)");
    }

    public void clickButtonEquipment() {
        Waiters.clickWebElement(buttonEquipment, driver);
        buttonEquipment.click();
    }

    public void clickButtonRingsSet() {
        Waiters.clickWebElement(buttonRingsSet, driver);
        buttonRingsSet.click();
    }

    public String getTextWtRiSeT() {
        return getTextWtRiSe.getText();
    }

    public void clickButtonCloseDialog() {

        if (closeDialogButton.isDisplayed()) {
            closeDialogButton.click();
        } else {

        }

    }

    public void clickButtonAddToBasket(){
        Waiters.clickWebElement(buttonToBasket, driver);
        buttonToBasket.click();
    }

    public String getTextOneProductToBasket(){
        return productRingSet.getText();
    }
}
