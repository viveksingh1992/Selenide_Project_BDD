package resources.locators.Authentisign;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Documents {
    public SelenideElement showHideSectionThree = $(By.id("imgShowSectionThree"));
    public SelenideElement selectFromForms = $(By.id("AddDocumentOptions1_lblAddFromForms"));
    public SelenideElement addNewDocumentButton = $(By.id("btnAddDocument_lblText"));
    public SelenideElement uploadAFile = $(By.id("AddDocumentOptions1_lblUploadAFile"));
    public SelenideElement uploadInputElement = $(By.xpath("//*[@id=\"HtmlTag\"]/body/div[2]/input"));

}
