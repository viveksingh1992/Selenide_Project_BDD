package signings;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class Participants {

    resources.locators.Authentisign.Participants locators = new resources.locators.Authentisign.Participants();
    public void AddNewParticipant(){
        locators.showHideSectionTwo.waitUntil(Condition.appears, 15000);
        String participantsSectionStatus = locators.showHideSectionTwo.getAttribute("title");
        if (participantsSectionStatus.equals("closed")){
        }
        else {
            locators.showHideSectionTwo.click();
        }
        boolean addParticipantsPromptStatus = locators.addYourself.isDisplayed();
        if(addParticipantsPromptStatus) {
            locators.participantsAddButton.click();
        }
        locators.addNewParticipants.waitUntil(Condition.appears, 15000);
        System.out.println("it is visible");
        Selenide.sleep(1000);
        locators.addNewParticipants.click();
        locators.addNewParticipantFirstName.setValue("first");
        locators.addNewParticipantLastName.setValue("last");
        locators.addNewParticipantEmail.setValue("test@test.apps.lwolf.com");
        locators.addNewParticipantRole.setValue("Buyer");
        locators.addNewParticipantAddButton.click();
    }
}
