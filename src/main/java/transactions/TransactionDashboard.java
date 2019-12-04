package transactions;

import com.codeborne.selenide.Condition;
import resources.locators.TransactionPage;

public class TransactionDashboard {

    TransactionPage locators = new TransactionPage();
    public void NavigateInsideTransaction (String sectionName) {
        String lowerSectionName = sectionName.toLowerCase().trim();
        switch (lowerSectionName) {
            case("forms"):
                locators.forms.click();
                break;
            case("documents"):
                locators.documents.click();
                break;
        }
    }

    public void VerifyWizardStatus (String wizardStatus) {
        String lowerWizardStatus = wizardStatus.toLowerCase().trim();
        locators.streetNumber.waitUntil(Condition.appears, 15000);
        boolean actualWizardStatus = locators.wizardNextButton.isDisplayed();
        switch (lowerWizardStatus){
            case("enabled"):
                if (actualWizardStatus) {
                    System.out.println("The wizard was in fact enabled");
                }
                else {
                    throw new Error("The wizard was expected to be enabled but it was not and caused an error");
                }
                break;
            case("disabled"):
                if (actualWizardStatus) {
                    throw new Error("The wizard was expected to be disabled but it was not and caused an error");
                }
                else {
                    System.out.println("The wizard was in fact disabled");
                }
                break;
        }
    }
}
