package resources.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TransactionDeskDashboard {

    public SelenideElement addButton = $(By.xpath("//*[@id=\"intro-tx-create\"]/dr-new-transaction/button"));
    public SelenideElement newTransactionName = $(By.name("name"));
    public SelenideElement template = $(By.name("txtemplate"));
    public SelenideElement type = $(By.name("txtype"));
    public SelenideElement addMeAsThe = $(By.name("whoareyou"));
    public SelenideElement importData = $(By.xpath("//*[@id=\"divImportForm\"]/div/div/dr-super-list/select"));
    public SelenideElement newTransactionCreateButton = $(By.xpath("//*[@ng-click=\"isPositiveAction()\"]"));
    public SelenideElement showWizard = $(By.xpath("//*[@ng-show=\"model.showUseWizard\"]/label/span"));
    public SelenideElement searchBar = $(By.xpath("//*[@placeholder=\"Search\"]"));
    public SelenideElement basket = $(By.xpath("//*[@is-modal-controller=\"transactionsBasketCtrl\"]/div[1]"));
    public SelenideElement trashButton = $(By.xpath("//*[@is-listing-transactions=\"isListingTransactions\"]/button[1]"));
    public SelenideElement deletePromptYes = $(By.xpath("//*[@data-ng-click=\"modalOptions.ok();\"]"));

}

