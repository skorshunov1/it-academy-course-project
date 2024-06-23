package com.itacademy;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import io.restassured.response.Response;
import io.restassured.module.jsv.JsonSchemaValidator;

import com.itacademy.testngexample.LoggerTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;


public class TestApi {
    private static final Logger LOGGER = LogManager.getLogger(LoggerTest.class);


    @Test
    public void getTest() {
        given().log().all()
                .when().get("https://www.21vek.by/special_offers/promo.html?discountTypes=sale")
                .then().log().all().statusCode(200);
    }

    @Test
    public void postTest(){
        given().log().all()
                .header("Cookie", "21vek=fca38344-78ef-490e-92c1-6dc958006ae8")
                .header("content-type", "application/json")
                .body("{\"User\":{\"email\":\"dfg@gmail.com\",\"password\":\"fdg15d33\"}}")
                .when().post("https://www.21vek.by/users/action/login/")
                .then().log().all().statusCode(200);
    }

}
