package com.itacademy.pages;

import com.itacademy.waiters.Waiters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends MainPage {
    private static final Logger LOGGER = LogManager.getLogger(ProductPage.class);

    private WebDriver driver;

    @FindBy(xpath = "//a[@aria-controls=\"desktop-menu-3\"]")
    private WebElement buttonEquipment;
    @FindBy(xpath = "//a[@href=\"/products/workout-rings-set\"][@class=\"product-item-meta__title\"]")
    private WebElement buttonRingsSet;
    @FindBy(xpath = "//b[text()=\"Workout Rings Set\"]")
    private WebElement getTextWtRiSe;
    @FindBy(xpath = "//button[@id=\"AddToCart\"]")
    private WebElement buttonToBasket;
    @FindBy(xpath = "//a[text()=\"Workout Rings Set\"]")
    private WebElement getTextproductRingSet;
    @FindBy(xpath = "//a[@aria-label=\"Decrease quantity\"]")
    private WebElement deleteProduct;
    @FindBy(xpath = "//p[text()=\"Your cart is empty\"]")
    private WebElement textEmptyBasket;


    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
        Waiters.clickWebElement(getTextWtRiSe, driver);
        return getTextWtRiSe.getText();
    }
    public void clickButtonAddToBasket() {
        Waiters.clickWebElement(buttonToBasket, driver);
        buttonToBasket.click();
    }

    public String getTextOneProductToBasket() {
        return getTextproductRingSet.getText();
    }

    public void clickButtonDeleteProduct(){
        Waiters.clickWebElement(deleteProduct, driver);
        deleteProduct.click();
    }

    public String getTextEmptyBasket(){
        return textEmptyBasket.getText();
    }

}

