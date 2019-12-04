Feature: Create Transaction Wizard Enabled

  Scenario: Create Automated Test Wizard Enabled Transaction and verify the status
    Given The user initializes a browser session
    Given The user navigate to TD and login
    And The user navigate to the "transactionDesk" section
    And The user creates a new transaction with the name "Automated Test Wizard Enabled", template "", type "Condo Sale", import data source "", add me as the "Seller" and with the wizard "enabled"
    Then The user verifies that the wizard is "enabled"
    And The user navigates to the "documents" section inside a transaction
    Then The user uploads the default document to the transaction


  Scenario: Delete The Automated Test Wizard Enabled Transaction
    Given The user navigate to the "transactionDesk" section
    Then The user deletes the transaction with the name "Automated Test Wizard Enabled"


