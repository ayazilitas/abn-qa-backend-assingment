package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Edit_Issue {

    Response response;
    public void updateIssue(){

        response= RestAssured.given().header("PRIVATE-TOKEN","glpat-fzUzvfMidUwg42fNYFhe")
                .queryParam("state_event","close").log().all().
                with().put("https://gitlab.com/api/v4/projects/49175301/issues/5?state_event=close").prettyPeek();
    }

}
