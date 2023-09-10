package Step_Defs;

import services.Delete_Issue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeleteIssue {

    @Test
    @DisplayName("TC5 : Delete Issue")

    public void deleteIssue(){

        //create an object from the Delete_Issue Class to call the methods
        Delete_Issue deleteIssue=new Delete_Issue();

        deleteIssue.deleteIssue();
        deleteIssue.verification();


    }
}
