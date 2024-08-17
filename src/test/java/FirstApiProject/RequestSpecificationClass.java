package FirstApiProject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationClass {
    RequestSpecification requestSpecification;

    @BeforeClass
    public void setRequestSpecification()
    {
        requestSpecification = RestAssured
                .given()
                .baseUri("https://reqres.in/api/users")
                .contentType(ContentType.JSON);

    }

    @Test
    public void usingReqSpecForGet() {

        RestAssured
                .given()
                .log().all()
                .spec(requestSpecification)
                .when()
                .get("/3")
                .then()
                .statusCode(200)
                .log().all();


    }

    @Test
    public void usingReqSpecForPost() {

        String jsonString = "{\r\n" +
                "    \"name\": \"Monit\",\r\n" +
                "    \"job\": \"Test File Name\"\r\n" +
                "}";

        RestAssured
                .given()
                .log().all()
                .spec(requestSpecification)
                .body(jsonString)
                .when()
                .post()
                .then()
                .statusCode(201)
                .log().all();


    }
}
