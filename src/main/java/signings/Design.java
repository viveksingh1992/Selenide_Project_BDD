package signings;

import com.codeborne.selenide.Condition;

public class Design {

    resources.locators.Authentisign.Design locators = new resources.locators.Authentisign.Design();

    public void AddDesign() {
        locators.showHideDesignSection.waitUntil(Condition.appears, 15000);
        locators.showHideDesignSection.click();
        locators.backButton.waitUntil(Condition.appears, 15000);
        locators.dragAndDrop.click();
        locators.signHereDAD.waitUntil(Condition.appears, 15000);
        locators.signHereDAD.click();
        locators.nextButton.click();
    }
}
