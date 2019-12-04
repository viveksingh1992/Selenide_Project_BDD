package resources.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class Dashboard {

    public SelenideElement expandButton = $(By.xpath("//*[@id=\"leftMenuButton\"]/span[2]"));
    public SelenideElement transactionDesk = $(By.xpath("//*[@title=\"TransactionDesk\"]/a"));
    public SelenideElement instanetForms =$(By.xpath("//*[@title=\"InstanetForms\"]/a"));
    public SelenideElement support = $(By.xpath("//*[@title=\"Support\"]/a"));
    public SelenideElement authentiSign = $(By.xpath("//*[@title=\"Authentisign\"]/a"));

}
