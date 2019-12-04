package navigation;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import resources.locators.Dashboard;
import resources.locators.GAMLS;

import static com.codeborne.selenide.Selenide.$;

public class DashboardNavigation {

    Dashboard locators = new Dashboard();
    GAMLS gamls = new GAMLS();

    public void NavigateToSection (String sectionName) {
        locators.expandButton.waitUntil(Condition.appears, 15000);
        locators.expandButton.click();
        Selenide.sleep(3000);
        String lowerSectionName = sectionName.toLowerCase().trim();
        switch (lowerSectionName) {
            case ("transactiondesk"):
                locators.transactionDesk.waitUntil(Condition.appears, 15000);
                Selenide.sleep(1000);
                locators.transactionDesk.click();
                break;
            case ("instanetforms"):
                locators.instanetForms.waitUntil(Condition.appears, 15000);
                Selenide.sleep(1000);
                locators.instanetForms.click();
                break;
            case ("support"):
                locators.support.waitUntil(Condition.appears, 15000);
                Selenide.sleep(1000);
                locators.support.click();
                break;
            case ("authentisign"):
                locators.authentiSign.waitUntil(Condition.appears, 15000);
                Selenide.sleep(1000);
                locators.authentiSign.click();
                break;
            default:
                throw new Error("The user was attempting to navigate to an invalid section");
        }
    }

    public void NavigateToFolder(String folderName) {
        SelenideElement folder = $(By.xpath("//h3[text()=\"" + folderName + "\"]"));
        folder.waitUntil(Condition.appears, 5000);
        folder.click();
    }

    public void CreateTransactionAndSave(String transactionName) {
        Selenide.sleep(5000);
        if (gamls.add.isDisplayed()) {
            gamls.add.click();
        }
        Selenide.sleep(2000);
        gamls.createNewFormStartNewTransaction.waitUntil(Condition.appears, 10000);
        gamls.createNewFormStartNewTransaction.click();
        gamls.transactionName.waitUntil(Condition.appears, 10000);
        gamls.transactionName.sendKeys(transactionName);
        gamls.createButton.click();
        gamls.streetNumber.waitUntil(Condition.appears, 10000);
        gamls.streetNumber.sendKeys("124");
        gamls.streetName.sendKeys("test");
        gamls.city.sendKeys("test City");
        gamls.listDate.sendKeys("05/05/2019");
        gamls.file.hover();
        gamls.save.waitUntil(Condition.appears, 10000);
        gamls.save.hover();
        gamls.saveSave.waitUntil(Condition.appears, 10000);
        gamls.saveSave.click();
        gamls.file.hover();
        gamls.exit.waitUntil(Condition.appears, 10000);
        gamls.exit.click();

    }
}
