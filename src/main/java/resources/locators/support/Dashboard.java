package resources.locators.support;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard {

    public SelenideElement guides = $(By.xpath("//*[@ng-click=\"Guides()\"]"));
}
