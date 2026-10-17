package com.qa.automation.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.greaterThan;

public class UserApiTests {

    private static final String BASE_URI =
            "https://jsonplaceholder.typicode.com";

    @Test
    public void verifyExistingUserId() {

        given()
            .baseUri(BASE_URI)
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1));
    }

    @Test
    public void verifyUserDetails() {

        given()
            .baseUri(BASE_URI)
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("name", equalTo("Leanne Graham"))
            .body("username", equalTo("Bret"))
            .body("email", equalTo("Sincere@april.biz"));
    }

    @Test
    public void verifyUserList() {

        given()
            .baseUri(BASE_URI)
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .body("size()", greaterThan(0))
            .body("[0].id", equalTo(1))
            .body("[0].username", notNullValue());
    }

    @Test
    public void verifyResponseContentType() {

        given()
            .baseUri(BASE_URI)
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .header("Content-Type", org.hamcrest.Matchers.containsString("application/json"));
    }

    @Test
    public void verifyDifferentUser() {

        given()
            .baseUri(BASE_URI)
        .when()
            .get("/users/2")
        .then()
            .statusCode(200)
            .body("id", equalTo(2))
            .body("username", equalTo("Antonette"));
    }
}
