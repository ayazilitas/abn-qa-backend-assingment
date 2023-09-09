package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Get_Issue_By_AssignedID {


    Response response;
    public void getAssignedID(){

        response= RestAssured.given().header("PRIVATE-TOKEN","glpat-fzUzvfMidUwg42fNYFhe")
                .log().all().when().get("https://gitlab.com/api/v4/projects/49175301/issues?assignee_id=15764690").prettyPeek();


    }

    public void verification(){

        assertEquals(200, response.statusCode());

    }

}
