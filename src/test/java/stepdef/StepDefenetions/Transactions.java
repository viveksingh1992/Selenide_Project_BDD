package stepdef.StepDefenetions;

import cucumber.api.java.en.Then;
import transactions.CreateTransaction;
import transactions.TransactionDashboard;

public class Transactions {

    CreateTransaction createTransaction = new CreateTransaction();
    TransactionDashboard transactionDashboard = new TransactionDashboard();

    @Then("^The user navigates to the \"([^\"]*)\" section inside a transaction$")
    public void navigateInsideTransaction (String sectionName) {
        transactionDashboard.NavigateInsideTransaction(sectionName);
    }

    @Then("^The user verifies that the wizard is \"([^\"]*)\"$")
    public void verifyWizardStatus (String wizardStatus){
        transactionDashboard.VerifyWizardStatus(wizardStatus);
    }

    @Then("^The user creates a new transaction with the name \"([^\"]*)?\", template \"([^\"]*)?\", type \"([^\"]*)?\", import data source \"([^\"]*)?\", add me as the \"([^\"]*)?\" and with the wizard \"([^\"]*)?\"$")
    public void createTransaction(String name, String template, String type, String importData, String addMeAs, String useWizard) {
        createTransaction.CreateTransaction(name, template, type, importData, addMeAs,useWizard);
    }

    @Then("^The user opens the transaction with the name \"([^\"]*)\"$")
    public void openTransaction(String transactionName) {
        createTransaction.OpenTransaction(transactionName);
    }

    @Then("^The user deletes the transaction with the name \"([^\"]*)\"$")
    public void deleteTransaction(String transactionName) {
        createTransaction.DeleteTransaction(transactionName);
    }


}
