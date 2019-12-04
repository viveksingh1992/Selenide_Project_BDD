package resources.locators.Authentisign;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Design {

    public SelenideElement showHideDesignSection = $(By.id("imgShowSectionFour"));
    public SelenideElement backButton = $(By.id("SignToolbarBack_lblText"));
    public SelenideElement dragAndDrop = $(By.id("lblDragAndDrop"));
    public SelenideElement signHereDAD = $(By.xpath("//*[@id=\"dnd_items\"]/img[1]"));
    public SelenideElement nextButton = $(By.id("SignToolbarNext_lblText"));

}
