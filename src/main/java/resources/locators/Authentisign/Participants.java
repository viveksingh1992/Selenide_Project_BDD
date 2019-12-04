package resources.locators.Authentisign;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Participants {
    public SelenideElement showHideSectionTwo = $(By.id("imgShowSectionTwo"));
    public SelenideElement addYourself = $(By.id("AddParticipantOptions1_lblAddYourself"));
    public SelenideElement participantsAddButton = $(By.id("btnAddParticipant_spnBtnOuter"));
    public SelenideElement addNewParticipants = $(By.xpath("//span[text()=\"Add New Participant\"]"));
    public SelenideElement addNewParticipantFirstName = $(By.id("AddParticipantOptions1_AddNewParticipant1_txtFirstName"));
    public SelenideElement addNewParticipantLastName = $(By.id("AddParticipantOptions1_AddNewParticipant1_txtLastName"));
    public SelenideElement addNewParticipantEmail = $(By.id("AddParticipantOptions1_AddNewParticipant1_txtEmail"));
    public SelenideElement addNewParticipantRole = $(By.id("AddParticipantOptions1_AddNewParticipant1_cmbRole_cmbRole_TextBox"));
    public SelenideElement addNewParticipantAddButton = $(By.id("AddParticipantOptions1_AddNewParticipant1_btnSave_lblText"));
}
