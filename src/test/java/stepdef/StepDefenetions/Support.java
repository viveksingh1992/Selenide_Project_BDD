package stepdef.StepDefenetions;

import cucumber.api.java.en.Then;
import support.Dashboard;
import support.Guides;

public class Support {

    Dashboard dashboard = new Dashboard();
    Guides guides = new Guides();

    @Then("^The user navigates to the \"([^\"]*)\" section inside support$")
    public void NavigateToSection(String sectionName) {
        dashboard.NavigateToSection(sectionName);
    }

    @Then("^The user expands the accordion \"([^\"]*)\" inside the guides section$")
    public void ExpandAccordion(String accordionName) {
        guides.ExpandAccordion(accordionName);
    }

    @Then("^The user downloads the guide \"([^\"]*)\" from the guides dashboard$")
    public void DownloadGuide(String guideName) {
        guides.DownloadGuide(guideName);
    }

    @Then("^The user verifies that the guide \"([^\"]*)\" was downloaded successfully$")
    public void VerifyGuideWasDownloaded(String guideName) {
        guides.VerifyGuideWasDownloaded(guideName);
    }
}
