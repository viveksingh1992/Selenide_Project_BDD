package signings;

import com.codeborne.selenide.Condition;

public class Invitations {

    resources.locators.Authentisign.Invitations locators = new resources.locators.Authentisign.Invitations();

    public void SendInvites() {
        locators.sendInvitationsButton.waitUntil(Condition.appears, 15000);
        locators.sendInvitationsButton.click();
        locators.invitationsSentPromptOkButton.click();
    }
}
