package com.redhat.tdd;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TDDResourceTest {
    @Test
    public void getAll() {
        given()
          .when().get("/tdd")
          .then()
          .statusCode(200)
          .body(
            "$.size()", is(1),
            "[0].id", is(1),
            "[0].message", is("Hello")
          );
    }
}
