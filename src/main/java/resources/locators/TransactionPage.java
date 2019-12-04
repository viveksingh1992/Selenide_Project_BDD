package resources.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TransactionPage {

    // navigation locators
    public SelenideElement documents = $(By.xpath("//*[@id=\"dTabs\"]/ul/li[8]/a"));
    public SelenideElement forms = $(By.xpath("//*[@id=\"dTabs\"]/ul/li[6]/a"));


    //tdp locators
    public SelenideElement streetNumber = $(By.xpath("//*[@field=\"propertyData.Address.StreetNumber\"]/input"));
    public SelenideElement wizardNextButton = $(By.xpath("//a[text()=\"Next\"]"));
    public SelenideElement wizardPrevButton = $(By.xpath("//a[text()=\"Prev\"]"));

}
