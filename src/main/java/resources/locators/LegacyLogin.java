package resources.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LegacyLogin {

    public SelenideElement firstName = $(By.name("firstname"));
    public SelenideElement lastName = $(By.name("lastname"));
    public SelenideElement password = $(By.name("password"));
    public SelenideElement loginButton = $(By.xpath("//*[contains(text(),'Sign in')]"));
    public SelenideElement clickHere = $(By.xpath("//*[contains(text(),'Click Here')]"));
}
