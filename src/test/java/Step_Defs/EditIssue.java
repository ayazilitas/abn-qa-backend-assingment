package Step_Defs;

import services.Edit_Issue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class EditIssue {


    @Test
    @DisplayName("TC3 : Edit Issue")
    public void editIssue(){

        Edit_Issue editIssue=new Edit_Issue();

        editIssue.updateIssue();
        editIssue.verification();

    }
}
