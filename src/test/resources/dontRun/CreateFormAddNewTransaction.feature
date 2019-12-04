Feature: Create a new transaction from a form, delete the form and the transaction

  Scenario: Create a form and a new transaction
    Given The user initializes a browser session
    Given The user navigate to TD and login
    Then The user navigate to the "instanetforms" section
    Then The user navigate to the "       GAMLS Forms" folder
    Then The user navigate to the "       Acreage and Farms (AF) Input Sheet - (Rev. 03/17)" folder
    Then The user create a new form and a transaction with the name "This is a transaction created from form"

  Scenario: Verify that the form was added to the transaction
    Then The user navigate to the "TransactionDesk" section
    And The user opens the transaction with the name "This is a transaction created from form"
    Then The user navigates to the "forms" section inside a transaction
    And The user verifies that the form "Acreage and Farms (AF) Input Sheet - (Rev. 03/17)" does exist inside the transaction
    Then The user deletes the form with the name "Acreage and Farms (AF) Input Sheet - (Rev. 03/17)" inside the transaction


    Scenario: Delete the transaction
    Then The user navigate to the "transactiondesk" section
    And The user deletes the transaction with the name "This is a transaction created from form"