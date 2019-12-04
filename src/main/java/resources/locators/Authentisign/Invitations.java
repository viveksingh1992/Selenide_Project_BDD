package resources.locators.Authentisign;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Invitations {

    public SelenideElement sendInvitationsButton = $(By.id("FinalizeSigning1_btnFinalizeSigning_lblText"));
    public SelenideElement invitationsSentPromptText = $(By.id("PopupAlertConfirm1_lblMessage"));
    public SelenideElement invitationsSentPromptOkButton = $(By.id("PopupAlertConfirm1_btnOK_spnBtnOuter"));

}
