package stepdef.StepDefenetions;

import cucumber.api.java.en.Given;
import transactions.documents.Dashboard;

public class Documents {
    Dashboard documents = new Dashboard();
    @Given("^The user uploads the default document to the transaction$")
    public void UploadDocument(){
        documents.UploadDocument();
    }
}
