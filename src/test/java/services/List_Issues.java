package services;
import LIstIssue_POJO.Assignee;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class List_Issues {

    int id;
    Response response;
    public void listIssues(){

        response= RestAssured.given().header("PRIVATE-TOKEN","glpat-fzUzvfMidUwg42fNYFhe")
                .log().all().when().get("https://gitlab.com/api/v4/projects/49175301/issues").prettyPeek();
        assertEquals(200,response.statusCode());

        Assignee assignee=response.as(Assignee.class);

        System.out.println("assignee.getName() = " + assignee.getName());

    }


}
