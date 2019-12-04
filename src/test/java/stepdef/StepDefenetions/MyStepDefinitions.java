package stepdef.StepDefenetions;

import cucumber.api.java.en.Then;
import initializeBrowser.InitializeBrowser;
import login.Legacy;
import navigation.DashboardNavigation;
import zip.Zip;


public class MyStepDefinitions {

    Legacy login = new Legacy();
    DashboardNavigation navigation = new DashboardNavigation();
    InitializeBrowser initializeBrowser = new InitializeBrowser();
    Zip zip = new Zip();

    @Then("^The user tests ziplogix$")
    public void testZip() {
        zip.Zip();
    }

    @Then("^The user initializes a browser session$")
    public void initializeBrowser() {
        initializeBrowser.InitializeBrowserSession();
    }

    @Then("^The user navigate to TD and login$")
    public void login() {
        login.LoginLegacy();
    }

    @Then("^The user navigate to the \"([^\"]*)\" section$")
    public void navigateTo(String sectionName) {
        navigation.NavigateToSection(sectionName);
    }

    @Then("^The user navigate to the \"([^\"]*)\" folder$")
    public void navigateToFolder(String sectionName) {
        navigation.NavigateToFolder(sectionName);
    }

    @Then("^The user create a new form and a transaction with the name \"([^\"]*)\"$")
    public void createNewForm(String transactionName) {
        navigation.CreateTransactionAndSave(transactionName);
    }
}
