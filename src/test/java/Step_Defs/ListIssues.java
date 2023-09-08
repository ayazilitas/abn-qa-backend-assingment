package Step_Defs;


import services.List_Issues;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class ListIssues {

    @Test
    @DisplayName("TC1: List Issues")
    public void listIssues(){

        List_Issues lIstIssues=new List_Issues();
        lIstIssues.listIssues();

    }

}
