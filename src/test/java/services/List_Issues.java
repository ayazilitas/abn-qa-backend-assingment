package services;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


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

        //Verify the status code
        assertEquals(200, response.statusCode());

        //verify that iid not to be null
        List<Integer>iid=jsonPath.getList("iid");
        assertNotNull(iid.get(0));

        //verify that id not to be null
        List<Integer>issuID=jsonPath.getList("id");
        assertNotNull(issuID.get(0));

        //Verify that every issue has to project id
        List<Integer>projectID=jsonPath.getList("project_id");
        assertNotNull(projectID.get(0));

        //Verify that issue closed by ayazilitas
        List<String>closedBy= jsonPath.getList("closed_by.username");
        assertEquals("ayazilitas",closedBy.get(0));

        //verify that links has to be a self item
        List<Map<String,Object>>links= jsonPath.getList("_links");
        assertNotNull(links.get(0).get("self"));

        //##########  For the Negative Tests  ##############
    //    assertEquals(202, response.statusCode());

//        List<Map<String, Object>>name1=jsonPath.getList("author.name");
//        assertEquals("RAHMET YAZILITAŞ",name1.get(0));



    }


    }





