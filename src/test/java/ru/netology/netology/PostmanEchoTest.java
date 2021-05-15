package ru.netology.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldTestPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Test test")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Test test"))
        ;
    }
}
