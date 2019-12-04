package stepdef.StepDefenetions;

import cucumber.api.java.en.Given;
import transactions.forms.Dashboard;

public class Forms {

    Dashboard formsDashboard = new Dashboard();
    @Given("^The user verifies that the form \"([^\"]*)\" does exist inside the transaction$")
    public void verifyFormExist (String formName) {
        formsDashboard.VerifyFormExist(formName);
    }

    @Given("^The user deletes the form with the name \"([^\"]*)\" inside the transaction$")
    public void deleteForm (String formName) {
        formsDashboard.DeleteForm(formName);
    }
}
