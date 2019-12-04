package resources.locators.transactionDesk;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Forms {

    public SelenideElement searchBar = $(By.xpath("//*[@placeholder=\"Search\"]"));
    public SelenideElement basket = $(By.xpath("//*[@is-modal-controller=\"transactionFormsBasketCtrl\"]/button[1]"));
    public String singleFormInListMenuButton = "./div[3]/ul/li[2]/dr-super-menu/button[1]/i";
    public String singleFormInListDeleteButton = "./div[3]/ul/li[2]/dr-super-menu/ul/li[3]/h4/dr-delete/a";
    public SelenideElement deletePromptYes = $(By.xpath("//*[@data-ng-click=\"modalOptions.ok();\"]"));

}
