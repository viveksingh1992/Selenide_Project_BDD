package transactions.documents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import resources.locators.transactionDesk.Documents;

import java.io.File;

import static com.codeborne.selenide.Selenide.$$;

public class Dashboard {

    Documents locators = new Documents();

    public void UploadDocument () {
        locators.add.waitUntil(Condition.appears, 15000);
        locators.add.click();
        locators.addNewDocument.waitUntil(Condition.appears, 15000);
        locators.addNewDocument.click();
        ElementsCollection upload = $$(By.className("dz-hidden-input"));
        upload.last().uploadFile(new File("zzzzzzz.pdf"));
        Selenide.sleep(5000);
    }
}
