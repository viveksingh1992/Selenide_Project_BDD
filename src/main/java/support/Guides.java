package support;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class Guides {


    public void ExpandAccordion(String accordionName){//a[text()="Next"]

        SelenideElement myAccordionContainer = $(By.xpath("//*[contains(text(), '" + accordionName + "')]"));
        myAccordionContainer.waitUntil(Condition.appears, 15000);
        String accordionStatus = myAccordionContainer.parent().$x("./i").getAttribute("class");
        if (accordionStatus.contains("isfontpack-collapse_top")) {
        }
        else {
            myAccordionContainer.$x("./span").click();
        }
    }


    public void DownloadGuide (String guideName) {
        SelenideElement Guide = $(By.xpath("//a[text()=\"" + guideName + "\"]"));
        Guide.click();
        Selenide.sleep(7500);
    }

    public void VerifyGuideWasDownloaded(String guideName) {
        File myPdf = new File("downloads/" + guideName + ".pdf");
        if (myPdf.exists()) {
            System.out.println("The file " + guideName + " does in fact exist");
            myPdf.delete();
        }
        else {
            throw new Error("The file was not found");
        }
    }
}
