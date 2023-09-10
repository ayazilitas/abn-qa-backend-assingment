package Step_Defs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.Edit_Issue;

public class EditIssue {

    @Test
    @DisplayName("TC4 : Edit Issue")

    public void editIssue(){

        //create an object from the Edit_Issue Class to call the methods
        Edit_Issue editIssue=new Edit_Issue();

        editIssue.updateIssue();
        editIssue.verification();
    }
}
