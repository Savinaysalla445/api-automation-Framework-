
package com.qa.automation.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetApiTest {

    @Test
    public void verifyUserDetails() {

        given()
            .baseUri("https://jsonplaceholder.typicode.com")

        .when()
            .get("/users/1")

        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("username", equalTo("Bret"));
    }
}
