Feature: Create Transaction Wizard disabled

  Scenario: Create Automated Test Wizard disabled Transaction and verify the status
    Given The user initializes a browser session
    Given The user navigate to TD and login
    And The user navigate to the "transactionDesk" section
    And The user creates a new transaction with the name "Automated Test Wizard disabled", template "", type "Condo Sale", import data source "", add me as the "Seller" and with the wizard "disabled"
    Then The user verifies that the wizard is "disabled"

  Scenario: Delete The Automated Test Wizard disabled Transaction
    Given The user navigate to the "transactionDesk" section
    Then The user deletes the transaction with the name "Automated Test Wizard disabled"