package resources.locators.Authentisign;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard {

    public SelenideElement searchBar = $(By.xpath("//*[@placeholder=\"Search\"]"));
    public SelenideElement addButton = $(By.xpath("//*[@tooltip=\"Create Authentisign\"]"));
    public SelenideElement signingName = $(By.xpath("//*[@name=\"name\"]"));
    public SelenideElement transactionOptional = $(By.xpath("//*[@is-options=\"transactions\"]/select"));
    public SelenideElement goToNewSigning = $(By.xpath("/html/body/div[8]/div/div/div/form/div/div[2]/div[3]/div/label/span"));
    public SelenideElement saveButton = $(By.xpath("//*[@ng-click=\"isPositiveAction()\"]"));


    public String singleSigningMenuButton = "./div[3]/dr-super-menu/button/i";
    public String singleSigningDeleteButton = "./div[3]/dr-super-menu/ul/li[*]/h4/dr-delete/a";
    public SelenideElement deletePromptYesButton = $(By.xpath("//*[@data-ng-click=\"modalOptions.ok();\"]"));
}
