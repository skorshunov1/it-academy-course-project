package com.itacademy.tests;

import static io.restassured.RestAssured.given;

import com.itacademy.listeners.TestListeners;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import java.io.File;

@Listeners(TestListeners.class)
public class TestApi {
    private static final Logger LOGGER = LogManager.getLogger(TestApi.class);


    @Test
    public void postLoginRequest(){
        given().log().all()
                .header("content-type", "application/json")
                .body("{ 'login': 'stkorshunov^@gmail.com', 'password': 'qSCNd89sd^@'}")
                .when().post("https://catalog.onliner.by/sdapi/user.api/login")
                .then().log().all().statusCode(400);

    }

    @Test
    public void getRequest() {
        given().log().all()
                .when().get("https://catalog.onliner.by/sdapi/catalog.api/products/majorivbtblk?include=schema")
                .then().log().all().statusCode(200);
    }

    @Test
    public void postRequest(){
       File file = new File("src/test/resources/json/body.json");
        given().log().all()
                .header("Cookie", "stid=bf438997757c3170faa282ebf68d23c08a2a6ca16bea67f835dc8f31a17b111f")
                .header("content-type", "application/json")
                .body(file)
                .when().post("https://catalog.onliner.by/sdapi/cart.api/detached-cart/1affd58a-3528-11ef-9174-0242567289e1/add/")
                .then().log().all().statusCode(200);
    }


    @Test
    public void deleteRequest(){
        given().log().all()
                .header("Cookie", "stid=bf438997757c3170faa282ebf68d23c08a2a6ca16bea67f835dc8f31a17b111f")
                .header("content-type", "application/json")
                .body("{\n" +
                        "  \"positions\": [\n" +
                        "   {\n" +
                        "   \"position_id\": \"6498:859088\",\n" +
                        "   \"shop_id\": 6498,\n" +
                        "   \"product_id\": 2202506\n" +
                        "   }\n" +
                        "   ]\n" +
                        "}")
                .when().delete("https://cart.onliner.by/sdapi/cart.api/detached-cart/1affd58a-3528-11ef-9174-0242567289e1")
                .then().log().all().statusCode(204);

    }
}
