package services;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Get_Issue_By_AssignedID {

    //make the response global to use inside the class
    Response response;
    public void getAssignedID(){

        //send the request by using GET method to READ.

        response= RestAssured.given().header("PRIVATE-TOKEN","glpat-fzUzvfMidUwg42fNYFhe")
                .log().all().when().get("https://gitlab.com/api/v4/projects/49175301/issues?assignee_id=15764690").prettyPeek();


    }

    //Run the positive tests to make sure the end points are working as expected

    public void verification(){

        assertEquals(200, response.statusCode());

        JsonPath jsonPath=response.jsonPath();

        List<String> username=jsonPath.getList("assignees.username[1]");
        assertEquals("ayazilitas",username.get(0));

        List<Integer>webUrl=jsonPath.getList("author.web_url");
        assertEquals("https://gitlab.com/ayazilitas",webUrl.get(0));

    }

}
