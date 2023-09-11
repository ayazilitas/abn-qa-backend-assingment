package services;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.google.gson.Gson;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class List_Issues {

    //make the response global to use inside the class
    Response response;

    public void listIssues() {

        //send the request by using GET method to READ.

        response = RestAssured.given().header("PRIVATE-TOKEN", "glpat-fzUzvfMidUwg42fNYFhe")
                .log().all().when().get("https://gitlab.com/api/v4/projects/49175301/issues").prettyPeek();

    }

     //Run the positive tests to make sure the end points are working as expected

    public void Verification(){

        JsonPath jsonPath=response.jsonPath();

        assertEquals(200, response.statusCode());

        List<Integer>iid=jsonPath.getList("iid");
        assertNotNull(iid.get(0));

        List<Integer>issuID=jsonPath.getList("id");
        assertNotNull(issuID.get(0));

        List<Integer>projectID=jsonPath.getList("project_id");
        assertNotNull(projectID.get(0));

        List<String>closedBy= jsonPath.getList("closed_by.username");
        assertEquals("ayazilitas",closedBy.get(0));

        List<Map<String,Object>>links= jsonPath.getList("_links");
        assertNotNull(links.get(0).get("self"));

        List<Map<String, Object>>name=jsonPath.getList("author.name");
        assertEquals("AHMET YAZILITAŞ",name.get(0));


    }


    }





