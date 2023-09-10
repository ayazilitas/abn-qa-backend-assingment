package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Delete_Issue {

    //make the response global to use inside the class
    Response response;

    public void deleteIssue(){

        // send the request by using PUT method to DELETE.

        response= RestAssured.given().header("PRIVATE-TOKEN","glpat-fzUzvfMidUwg42fNYFhe")
                .log().all().when().delete("https://gitlab.com/api/v4/projects/49175301/issues/13").prettyPeek();


    }

    //Run the positive tests to make sure the end points are working as expected
    public void verification(){

        assertEquals(204, response.statusCode());
    }
}
