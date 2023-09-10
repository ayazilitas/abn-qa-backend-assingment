package services;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Edit_Issue {

    //make the response global to use inside the class
    Response response;

    public void updateIssue() {

        // send the request by using PUT method to UPDATE.

        response = RestAssured.given().header("PRIVATE-TOKEN", "glpat-fzUzvfMidUwg42fNYFhe")
                .queryParam("state_event", "close").log().all().
                with().put("https://gitlab.com/api/v4/projects/49175301/issues/12?state_event=close").prettyPeek();


    }
    //Run the positive tests to make sure the end points are working as expected


    public void verification() {

        assertEquals(200, response.statusCode());

    }
}