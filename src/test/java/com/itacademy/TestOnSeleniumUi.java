package com.itacademy;

import com.itacademy.testngexample.LoggerTest;
import com.itacademy.utils.pages.MainPage;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestOnSeleniumUi extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(LoggerTest.class);


    @Test
    public void firstTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickAccountButton();
        mainPage.typeLogin("st.korshunov88@gmail.com");
        mainPage.clickButtonContinue();
        mainPage.typeCodeInputField("564895");
        Thread.sleep(10000);
        mainPage.clickButtonSubmit();
        Thread.sleep(10000);
        String string = mainPage.getIsErrorPresent();
        Assert.assertEquals(mainPage.getIsErrorPresent(), "Sent to st.korshunov88@gmail.com");
        LOGGER.info("info");
    }

    @Test
    public void secondTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickButtonCloseDialog();
        mainPage.clickButtonEquipment();
        mainPage.scrollPage();
        String str = mainPage.getTextWtRiSeT();
        Thread.sleep(5000);
        mainPage.clickButtonRingsSet();
        mainPage.clickButtonAddToBasket();
        String str2 = mainPage.getTextOneProductToBasket();
        Assert.assertEquals(str,str2,"Workout Rings Set");
        LOGGER.info("info");
    }
}
