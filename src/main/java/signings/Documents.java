package signings;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.io.File;

public class Documents {


    resources.locators.Authentisign.Documents locators = new resources.locators.Authentisign.Documents();
    public void uploadDocument() {
        locators.showHideSectionThree.waitUntil(Condition.appears, 15000);
        String documentsSectionStatus = locators.showHideSectionThree.getAttribute("title");
        if(documentsSectionStatus.equals("close")){

        }
        else {
            locators.showHideSectionThree.click();
        }
        Selenide.sleep(1000);
        boolean addDocumentPromptStatus = locators.selectFromForms.isDisplayed();
        if (!addDocumentPromptStatus){
            locators.addNewDocumentButton.click();
        }
        locators.uploadAFile.waitUntil(Condition.appears, 15000);
        Selenide.sleep(1000);
        locators.uploadInputElement.uploadFile(new File("zzzzzzz.pdf"));
        Selenide.sleep(5000);
    }
}
