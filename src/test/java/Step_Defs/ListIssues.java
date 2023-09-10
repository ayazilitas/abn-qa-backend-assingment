package Step_Defs;


import services.List_Issues;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class ListIssues {

    @Test
    @DisplayName("TC2: List Issues")
    public void listIssues(){

        //create an object from the List_Issues Class to call the methods
        List_Issues lIstIssues=new List_Issues();

       lIstIssues.listIssues();
       lIstIssues.Verification();

    }

}
