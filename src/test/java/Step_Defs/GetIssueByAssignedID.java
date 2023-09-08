package Step_Defs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.Get_Issue_By_AssignedID;
import services.List_Issues;

public class GetIssueByAssignedID {

    @Test
    @DisplayName("TC1: List Issues")
    public void listIssues(){

        Get_Issue_By_AssignedID getIssueByAssignedID=new Get_Issue_By_AssignedID();

        getIssueByAssignedID.getAssignedID();

    }
}
