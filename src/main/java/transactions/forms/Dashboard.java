package transactions.forms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import resources.locators.transactionDesk.Forms;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard {
        Forms locators = new Forms();
    public void VerifyFormExist (String formName){
        SelenideElement TheForm = $(By.xpath("//a[text()=\"" + formName + "\"]"));
        locators.searchBar.clear();
        locators.searchBar.sendKeys(formName);
        Selenide.sleep(2000);
//        if(TheForm.isDisplayed()){
//            System.out.println("The form with the name " + formName + " was verified to exist inside the transaction");
//        }
//
//        else{
//            throw new Error("The form with the name " + formName + " was NOT verified to exist inside the transaction and caused an error");
//        }
        TheForm.should(Condition.exist);
    }

    public void DeleteForm (String formName){
        SelenideElement TheForm = $(By.xpath("//a[text()=\"" + formName + "\"]"));
        locators.searchBar.clear();
        locators.searchBar.sendKeys(formName);
        TheForm.waitUntil(Condition.appears, 10000);
        SelenideElement TheFormBlock = TheForm.parent().parent().parent().parent();
        TheFormBlock.$x(locators.singleFormInListMenuButton).click();
        TheFormBlock.$x(locators.singleFormInListDeleteButton).click();
        locators.deletePromptYes.click();
    }
}