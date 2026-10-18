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
