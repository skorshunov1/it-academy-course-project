package com.itacademy;

import com.itacademy.pages.LoginPage;
import com.itacademy.pages.MainPage;
import com.itacademy.pages.ProductPage;
import com.itacademy.pages.SearchPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestUi extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(TestUi.class);


    @Test(retryAnalyzer = RetryTest.class)
    public void firstTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickButtonCloseDialog();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickAccountButton();
        loginPage.typeLogin("st.korshunov88@gmail.com");
        loginPage.clickButtonContinue();
        loginPage.typeCodeInputField("564895");
        loginPage.clickButtonSubmit();
        String string = loginPage.getIsErrorPresent();
        Assert.assertEquals(loginPage.getIsErrorPresent(), "Sent to st.korshunov88@gmail.com");
    }

    @Test
    public void secondTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickButtonCloseDialog();
        ProductPage productPage = new ProductPage(driver);
        productPage.clickButtonEquipment();
        productPage.scrollPage();
        String str = productPage.getTextWtRiSeT();
        productPage.clickButtonRingsSet();
        productPage.clickButtonAddToBasket();
        String str2 = productPage.getTextOneProductToBasket();
        Assert.assertEquals(str, str2, "Workout Rings Set");
    }


    @Test
    public void thirdTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickButtonCloseDialog();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickButtonToSearch();
        searchPage.typeSearchInputField("Dip bars");
        searchPage.clickButtonProduct();
        String str = searchPage.getTextProductPremiumDipBars();
        Assert.assertEquals(str, "Premium Dip Bars");
    }

    @Test
    public void fourTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickButtonCloseDialog();
        ProductPage productPage = new ProductPage(driver);
        productPage.clickButtonEquipment();
        productPage.scrollPage();
        productPage.clickButtonRingsSet();
        productPage.clickButtonAddToBasket();
        productPage.clickButtonDeleteProduct();
        String str = productPage.getTextEmptyBasket();
        Assert.assertEquals(str, "Your cart is empty");
    }
}
