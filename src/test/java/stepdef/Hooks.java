package stepdef;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

public class Hooks {

    int i = 1;
    @Before
    public static void before() {
        File downloads = new File("downloads");
        if (downloads.exists()){

        }
        else {
            downloads.mkdir();
        }
    }

    @After
    public static void after() {
//        File downloads = new File("downloads");
//
//        if (downloads.exists()) {
//
//            String[] entries = downloads.list();
//            for (String s : entries) {
//                File currentFile = new File(downloads.getPath(), s);
//                currentFile.delete();
//            }
//            downloads.delete();
//            System.out.println("This is an after hook");
//        }
//
//        else {
//
//        }
    }

    @BeforeStep
    public void beforeStep () {
        try {
            SelenideElement waitingLogo = $(By.xpath("//*[@id=\"mask\"]/div[2]/div"));
            while(waitingLogo.isDisplayed()) {
                Selenide.sleep(2500);
            }
        }
        catch (Exception e) {
        }


    }

    @AfterStep
    public void AfterStep(Scenario scenario) {
        screenshot(scenario.getName() +" step " + this.i);
        this.i++;
    }
}
