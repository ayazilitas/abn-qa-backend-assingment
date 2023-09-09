package services;

import LIstIssue_POJO.Assignee;
import LIstIssue_POJO.Datum;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.google.gson.Gson;


import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class List_Issues {


    Response response;
    public void listIssues() {

        response = RestAssured.given().header("PRIVATE-TOKEN", "glpat-fzUzvfMidUwg42fNYFhe")
                .log().all().when().get("https://gitlab.com/api/v4/projects/49175301/issues");


//        String responseData= response.asPrettyString();
//        Gson gson=new Gson();
//        Datum[]datum=gson.fromJson(responseData,Datum[].class);
//
//
//        for (Datum data: datum){
//
//            System.out.println("data.getAuthor().getName() = " + data.getAuthor().getName());
//            System.out.println("data.getAuthor().getId() = " + data.getAuthor().getId());
//            System.out.println("data.getAssignee().getUsername() = " + data.getAssignee().getUsername());
//            System.out.println("data.getIssueType() = " + data.getIssueType());
//            System.out.println("data.getTitle() = " + data.getTitle());
//            System.out.println("data.getAssignee()..getWebUrl() = " + data.getAssignee().getWebUrl());
//            System.out.println("data.getLabels() = " + data.getLabels());
//            System.out.println("data.getMilestone() = " + data.getMilestone());
//            System.out.println("data.getMilestone().getIid() = " + data.getMilestone().getIid());
//            System.out.println("data.getLinks().getProject() = " + data.getLinks().getNotes());
//
//        }


        JsonPath jsonPath=response.jsonPath();

       List<Integer>iid=jsonPath.getList("iid");
        System.out.println("iid = " + iid);

        List<Integer>issuID=response.path("id");
        System.out.println("issuID = " + issuID);

        List<Integer>projectID=response.path("project_id");
        System.out.println("projectID = " + projectID);

        List<String>labels=jsonPath.getList("labels");
        System.out.println("labels = " + labels);

        List<Map<String,Object>>closedBy= response.path("closed_by");
        System.out.println("closedBy.get(0).get(\"avatar_url\") = " + closedBy.get(0).get("avatar_url"));

        List<Map<String,Object>>links= response.path("_links");
        System.out.println("links.get(0).get(\"self\") = " + links.get(0).get("self"));
    }


    public void verification(){

        String responseData= response.asPrettyString();
        Gson gson=new Gson();
        Datum[]datum=gson.fromJson(responseData,Datum[].class);


        for (Datum data: datum){

            assertEquals("AHMET YAZILITAŞ",data.getAuthor().getName());
            assertEquals(15764690,data.getAuthor().getId());

        }


        assertEquals(200, response.statusCode());


    }



}
