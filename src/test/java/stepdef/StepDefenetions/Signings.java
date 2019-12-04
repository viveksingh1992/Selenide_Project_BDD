package stepdef.StepDefenetions;

import cucumber.api.java.en.Then;
import signings.*;
import signings.Documents;

public class Signings {

    Dashboard dashboard = new Dashboard();
    Participants participants = new Participants();
    Documents documents = new Documents();
    Design design = new Design();
    Invitations invitations = new Invitations();

    @Then("^The user creates a new signing with the name \"([^\"]*)\" related to the transaction \"([^\"]*)\" with the go to signing button \"([^\"]*)\"$")
    public void CreateSigning(String signingName, String optionalTransactionName, String goToSigningStatus) {
        dashboard.CreateNewSigning(signingName, optionalTransactionName, goToSigningStatus);
    }

    @Then("^The user uploads the default document to the signing$")
    public void UploadDocument() {
        documents.uploadDocument();
    }


    @Then("^The user adds the default participant to the signing$")
    public void AddParticipants() {
        participants.AddNewParticipant();
    }

    @Then("^The user applies the simple design to the signing$")
    public void ApplyDesign() {
        design.AddDesign();
    }

    @Then("^The user sends the default invites to the signing$")
    public void SendInvites() {
        invitations.SendInvites();
    }

    @Then("^The user deletes the signing \"([^\"]*)\"$")
    public void DeleteSigning(String signingName) {
        dashboard.DeleteSigning(signingName);
    }
}
