package signings;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard {

    resources.locators.Authentisign.Dashboard locators = new resources.locators.Authentisign.Dashboard();

    public void CreateNewSigning(String signingName, String optionalTransaction, String goToSigning) {
        locators.addButton.click();
        locators.signingName.setValue(signingName);
        if (optionalTransaction != null) {
            locators.transactionOptional.sendKeys(optionalTransaction);
        }
        String lowerGoToSigning = goToSigning.toLowerCase().trim();
        switch (lowerGoToSigning){
            case("enabled"):
                break;
            case("disabled"):
                locators.goToNewSigning.click();
                break;
            default:
                throw new Error("The user was trying to use an invalid go to signing selection");
        }
        locators.saveButton.click();
    }

    public void DeleteSigning(String signingName){
        locators.searchBar.waitUntil(Condition.appears, 15000);
        locators.searchBar.setValue(signingName);
        Selenide.sleep(2500);
        SelenideElement mySigning = $(By.xpath("//a[text()=\"" + signingName +"\"]"));
        SelenideElement mySigningBlock = mySigning.parent().parent().parent().parent();
        mySigningBlock.$x(locators.singleSigningMenuButton).click();
        mySigningBlock.$x(locators.singleSigningDeleteButton).click();
        locators.deletePromptYesButton.click();
    }
}
