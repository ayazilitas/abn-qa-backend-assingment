package Step_Defs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.Get_Issue_By_AssignedID;
import services.List_Issues;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetIssueByAssignedID {

    @Test
    @DisplayName("TC3: Get Issue By Assigned ID")
        public void listIssues(){

        //create an object from the Get Issue Class By AssignedID Class to call the methods
        Get_Issue_By_AssignedID getIssueByAssignedID=new Get_Issue_By_AssignedID();

        //call the request method
        getIssueByAssignedID.getAssignedID();

        //call the verification method
        getIssueByAssignedID.verification();

    }

}
