package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Delete_Issue {

    Response response;
    public void deleteIssue(){

        response= RestAssured.given().header("PRIVATE-TOKEN","glpat-fzUzvfMidUwg42fNYFhe")
                .log().all().when().delete("https://gitlab.com/api/v4/projects/49175301/issues/5").prettyPeek();


    }


}
