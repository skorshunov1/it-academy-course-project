package com.itacademy.utils.pages.pages;

import com.itacademy.utils.pages.utils.ScreenshotUtils;
import com.itacademy.utils.pages.waiters.Waiters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends MainPage{
    private static final Logger LOGGER = LogManager.getLogger(SearchPage.class);

    private WebDriver driver;

    @FindBy(xpath = "//*[@class=\"header__icon-wrapper tap-area hidden-pocket hidden-lap \"]")
    private WebElement buttonSearch;
    @FindBy(xpath = "//input[@aria-label=\"Search\"]")
    private WebElement search;
    @FindBy(xpath = "//span[@class=\"product-item-meta__title text--small\"]")
    private WebElement buttonProduct;
    @FindBy(xpath = "//h1[text()=\"Premium Dip Bars\"]")
    private WebElement productDipBars;


    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButtonToSearch() {
        Waiters.clickWebElement(buttonSearch, driver);
        buttonSearch.click();
    }
    public void typeSearchInputField(String text) {
        search.sendKeys(text);
        ScreenshotUtils.saveScreenshot(driver);
    }
    public void clickButtonProduct(){
        Waiters.clickWebElement(buttonProduct, driver);
        buttonProduct.click();
    }
    public String getTextProductPremiumDipBars(){
        return productDipBars.getText();
    }
}
