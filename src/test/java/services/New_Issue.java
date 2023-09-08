package services;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class New_Issue {

    Response response;

    public void newIssue(){
        response = RestAssured.given().header("PRIVATE-TOKEN", "glpat-fzUzvfMidUwg42fNYFhe")
                .queryParam("title", "Issues%20with%20auth")
                .queryParam("labels", "ABN")
                .log().all().when().post("https://gitlab.com/api/v4/projects/49175301/issues?title=ABN_AMRO_TEST=ABN_AMRO").prettyPeek();

        assertEquals(201, response.statusCode());
    }


}
