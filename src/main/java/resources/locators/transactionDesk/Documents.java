package resources.locators.transactionDesk;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Documents {

    public SelenideElement add = $(By.xpath("//*[@tooltip=\"Add Documents/Folders\"]"));
    public SelenideElement uploadDocumentInput = $(By.className("dz-hidden-input"));
    public SelenideElement addNewDocument = $(By.xpath("//*[@is-text=\"Add new document\"]"));


}
