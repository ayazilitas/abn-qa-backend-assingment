package Step_Defs;

import services.New_Issue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NewIssue {

    @Test
    @DisplayName("TC1: New Issue")
    public void newIssue(){

        //create an object from the New_Issue Class to call the methods
        New_Issue newIssue=new New_Issue();

        //call the request method
        newIssue.newIssue();

        //call the verification method
        newIssue.verification();

    }
}
