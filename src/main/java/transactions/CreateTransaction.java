package transactions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import resources.locators.TransactionDeskDashboard;

import static com.codeborne.selenide.Selenide.$;

public class CreateTransaction {

    TransactionDeskDashboard locators = new TransactionDeskDashboard();

    public void CreateTransaction (String name, String template, String type, String importData, String addMeAs,String useWizard) {
        locators.addButton.waitUntil(Condition.appears, 15000);
        locators.addButton.click();
        locators.newTransactionName.waitUntil(Condition.appears, 15000);
        locators.newTransactionName.sendKeys(name);

        if ( template != null) {
            locators.template.sendKeys(template);
        }

        if (type != null) {
            locators.type.sendKeys(type);
        }

        if (importData != null) {
            locators.importData.sendKeys(importData);
        }

        if (addMeAs != null) {
            locators.addMeAsThe.sendKeys(addMeAs);
        }
        String lowerUseWizard = useWizard.toLowerCase().trim();
        switch (lowerUseWizard) {
            case("enabled"):
                break;
            case("disabled"):
                locators.showWizard.click();
                break;
        }
        locators.newTransactionCreateButton.click();
    }

    public void OpenTransaction (String transactionName) {
        locators.searchBar.waitUntil(Condition.appears, 5000);
        locators.searchBar.clear();
        locators.searchBar.sendKeys(transactionName);
        Selenide.sleep(2000);
        SelenideElement transaction = $(By.xpath("//a[text()=\"" + transactionName + "\"]"));
        transaction.waitUntil(Condition.appears, 5000);
        transaction.click();
    }


    public void DeleteTransaction (String transactionName) {
        locators.searchBar.waitUntil(Condition.appears, 5000);
        locators.searchBar.clear();
        locators.searchBar.sendKeys(transactionName);
        Selenide.sleep(2000);
        SelenideElement transaction = $(By.xpath("//a[text()=\"" + transactionName + "\"]"));
        transaction.waitUntil(Condition.appears, 5000);
        SelenideElement transactionBlock = transaction.parent().parent().parent();
        transactionBlock.$x("./div[5]/ul/li[1]/div[1]/button[1]/i").click();
        locators.basket.click();
        locators.trashButton.click();
        locators.deletePromptYes.click();
    }

}
