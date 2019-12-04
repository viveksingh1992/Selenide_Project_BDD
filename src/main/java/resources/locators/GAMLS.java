package resources.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GAMLS {

    public SelenideElement add = $(By.xpath("//*[@tooltip=\"Add\"]"));
    public SelenideElement createNewForm = $(By.xpath("//*[@is-broadcast-name=\"form.standalone.created\"]"));
    public SelenideElement createNewFormStartNewTransaction = $(By.xpath("//a[text()=\"Create new Form, start a new transaction\"]"));
    public SelenideElement transactionName = $(By.xpath("//*[@name=\"name\"]"));
    public SelenideElement createButton = $(By.xpath("//button[text()=\"Create\"]"));
    public SelenideElement streetNumber = $(By.xpath("//*[@name=\"txtp_streetnum\"]"));
    public SelenideElement streetName = $(By.xpath("//*[@name=\"txtp_street\"]"));
    public SelenideElement city = $(By.xpath("//*[@name=\"txtp_city\"]"));
    public SelenideElement listDate = $(By.xpath("//*[@name=\"txtp_listdate\"]"));
    public SelenideElement file = $(By.xpath("//*[@tooltip=\"File\"]"));
    public SelenideElement save = $(By.xpath("//*[@ng-if=\"vm.showSave || vm.showSavePDF\"]"));
    public SelenideElement saveSave = $(By.xpath("//*[@ng-click=\"vm.save(true)\"]"));
    public SelenideElement exit = $(By.xpath("//*[@tooltip=\"Exit\"]"));

}
