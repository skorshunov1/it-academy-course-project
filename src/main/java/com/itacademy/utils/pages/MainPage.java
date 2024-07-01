package com.itacademy.utils.pages;

import com.itacademy.utils.pages.waiters.Waiters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    private static final Logger LOGGER = LogManager.getLogger(MainPage.class);

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
    @FindBy(xpath = "//a[@aria-controls=\"desktop-menu-3\"]")
    private WebElement buttonEquipment;
    @FindBy(xpath = "//a[@href=\"/products/workout-rings-set\"][@class=\"product-item-meta__title\"]")
    private WebElement buttonRingsSet;
    @FindBy(xpath = "//b[text()=\"Workout Rings Set\"]")
    private WebElement getTextWtRiSe;
    @FindBy(xpath = "//button[@aria-label=\"Close dialog 3\"]")
    private WebElement closeDialogButton;
    @FindBy(xpath = "//button[@id=\"AddToCart\"]")
    private WebElement buttonToBasket;
    @FindBy(xpath = "//a[text()=\"Workout Rings Set\"]")
    private WebElement getTextproductRingSet;
    @FindBy(xpath = "//*[@class=\"header__icon-wrapper tap-area hidden-pocket hidden-lap \"]")
    private WebElement buttonSearch;
    @FindBy(xpath = "//input[@aria-label=\"Search\"]")
    private WebElement search;
    @FindBy(xpath = "//span[@class=\"product-item-meta__title text--small\"]")
    private WebElement buttonProduct;
    @FindBy(xpath = "//h1[text()=\"Premium Dip Bars\"]")
    private WebElement productDipBars;
    @FindBy(xpath = "//a[@aria-label=\"Decrease quantity\"]")
    private WebElement deleteProduct;
    @FindBy(xpath = "//p[text()=\"Your cart is empty\"]")
    private WebElement textEmptyBasket;

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
            LOGGER.info("Display is not");

        }

    }

    public void clickButtonAddToBasket() {
        Waiters.clickWebElement(buttonToBasket, driver);
        buttonToBasket.click();
    }

    public String getTextOneProductToBasket() {
        return getTextproductRingSet.getText();
    }

    public void clickButtonToSearch() {
        Waiters.clickWebElement(buttonSearch, driver);
        buttonSearch.click();
    }

    public void typeSearchInputField(String text) {
        search.sendKeys(text);
    }

    public void clickButtonProduct(){
        Waiters.clickWebElement(buttonProduct, driver);
        buttonProduct.click();
    }

    public String getTextProductPremiumDipBars(){
        return productDipBars.getText();
    }

    public void clickButtonDeleteProduct(){
        Waiters.clickWebElement(deleteProduct, driver);
        deleteProduct.click();
    }

    public String getTextEmptyBasket(){
        return textEmptyBasket.getText();
    }

}
