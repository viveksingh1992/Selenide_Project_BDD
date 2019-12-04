package resources.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Zip {

    //login page
    public SelenideElement username = $(By.id("login-usr"));
    public SelenideElement password = $(By.id("login-pwd"));
    public SelenideElement loginButton = $(By.id("loginSignin"));

    // new transaction prompt
    public SelenideElement newTransactionButton = $(By.id("new-transaction"));
    public SelenideElement newListing = $(By.xpath("//*[@data-lang=\"opy_New_Listing\"]"));
    public SelenideElement transactionName = $(By.id("transName"));
    public SelenideElement propertyTypeResidential = $(By.xpath("//*[@id=\"transaction-property-type\"]/table/tbody/tr/td/div[1]/label[1]"));
    public SelenideElement transactionComments = $(By.id("transComments"));
    public SelenideElement newTransactionSave = $(By.id("createTransSave"));


    // transaction details
    public SelenideElement streetAddress = $(By.id("mlsNumber"));
    public SelenideElement mlsNumber = $(By.id("D401"));
    public SelenideElement unitNumber = $(By.id("D25226"));
    public SelenideElement city = $(By.id("D402"));
    public SelenideElement county = $(By.id("D404"));
    public SelenideElement state = $(By.id("D405"));
    public SelenideElement zip = $(By.id("D406"));
    public SelenideElement save = $(By.xpath("//*[@data-target=\"#propertySummaryPanelBody\"]/div[1]/button[2]"));
    public SelenideElement backToList = $(By.xpath("//*[@data-action=\"back\"]"));


    // transactions dashboard
    public SelenideElement searchBar = $(By.id("search"));
    public SelenideElement notificationBar = $(By.className("toast-message"));
    public SelenideElement transactionBlock = $(By.xpath("//*[@id=\"TransactionListView\"]/ul/li[1]/div[1]"));
    public SelenideElement moreActionButton = $(By.xpath("//*[@title=\"More Actions\"]"));
    public SelenideElement deleteTransaction = $(By.xpath("//*[@id=\"transaction-actions\"]/li[6]"));
    public SelenideElement confirmDelete = $(By.xpath("//*[@class=\"modal bootstrap-dialog type-default fade size-normal in\"]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]"));


}
