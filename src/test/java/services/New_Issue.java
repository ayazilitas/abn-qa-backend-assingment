package services;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class New_Issue {

    //make the response global to use inside the class
    Response response;

    public void newIssue(){

        // send the request by using POST method to CREATE.
        response = RestAssured.given().header("PRIVATE-TOKEN", "glpat-fzUzvfMidUwg42fNYFhe")
                .queryParam("title", "Issues%20with%20auth")
                .queryParam("labels", "ABN-AMSTERDAM_ROTTERDAM")
                .log().all().when().post("https://gitlab.com/api/v4/projects/49175301/issues?title=ABN_AMRO_TEST=ABN_AMRO").prettyPeek();

        JsonPath jsonPath=response.jsonPath();
        System.out.println("jsonPath.getList(\"labels\").get(0) = " + jsonPath.getList("labels").get(0));


    }

    //Run the positive tests to make sure the end points are working as expected
    public void verification(){

        assertEquals(201, response.statusCode());

        JsonPath jsonPath=response.jsonPath();

       assertEquals("ABN-AMSTERDAM_ROTTERDAM",jsonPath.getList("labels").get(0));





    }
}
