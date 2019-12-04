package zip;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

public class Zip {
    resources.locators.Zip locators = new resources.locators.Zip();
    public void Zip (){

        // login
        open("https://r.zipformplus.com/");
        locators.username.waitUntil(Condition.appears, 15000);
        locators.username.sendKeys("test.b");
        locators.password.sendKeys("password");
        locators.loginButton.click();


        // Create Transaction
        locators.newTransactionButton.waitUntil(Condition.appears, 15000);
        Selenide.sleep(1000);
        locators.newTransactionButton.click();
        locators.newListing.waitUntil(Condition.appears, 15000);
        locators.newListing.click();
        locators.transactionName.waitUntil(Condition.appears, 15000);
        locators.transactionName.sendKeys("This is a new automated transaction");
        locators.propertyTypeResidential.click();
        locators.transactionComments.sendKeys("No Comments for this transaction");
        locators.newTransactionSave.click();


        // add details
        locators.streetAddress.waitUntil(Condition.appears, 15000);
        locators.mlsNumber.sendKeys("26361613");
        locators.streetAddress.sendKeys("121 test st");
        locators.unitNumber.sendKeys("112");
        locators.city.sendKeys("test city");
        locators.county.sendKeys("test county");
        locators.state.sendKeys("VV");
        locators.zip.sendKeys("12412");
        locators.save.click();
        locators.backToList.click();


        // delete the transaction
        locators.searchBar.waitUntil(Condition.appears, 15000);
        locators.searchBar.sendKeys("This is a new");
        locators.notificationBar.waitUntil(Condition.appears, 15000);
        locators.transactionBlock.hover();
        locators.moreActionButton.waitUntil(Condition.appears, 15000);
        Selenide.sleep(1500);
        locators.moreActionButton.click();
        locators.deleteTransaction.waitUntil(Condition.appears, 15000);
        locators.deleteTransaction.click();
        locators.confirmDelete.waitUntil(Condition.appears, 15000);
        locators.confirmDelete.click();
        Selenide.sleep(5000);
    }
}
