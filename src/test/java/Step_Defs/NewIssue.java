package Step_Defs;

import services.New_Issue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NewIssue {



    @Test
    @DisplayName("TC1: New Issue")

    public void newissue(){
        New_Issue newIssue=new New_Issue();
        newIssue.newIssue();

    }
}
