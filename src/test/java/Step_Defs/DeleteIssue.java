package Step_Defs;

import services.Delete_Issue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeleteIssue {

    @Test
    @DisplayName("TC4 : Delete Issue")

    public void deleteIssue(){

        Delete_Issue deleteIssue=new Delete_Issue();

        deleteIssue.deleteIssue();
        deleteIssue.verification();


    }
}
