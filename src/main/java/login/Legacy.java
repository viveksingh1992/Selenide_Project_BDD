package login;

import com.codeborne.selenide.Condition;
import resources.locators.LegacyLogin;

import static com.codeborne.selenide.Selenide.open;


public class Legacy {

    LegacyLogin locators = new LegacyLogin();
    public void LoginLegacy(){
        open(System.getProperty("baseUrl"));
        locators.firstName.waitUntil(Condition.appears, 45000);
        locators.firstName.sendKeys("Automation");
        locators.lastName.sendKeys("basic");
        locators.password.sendKeys("AB28061");
        locators.loginButton.click();
    }
}
