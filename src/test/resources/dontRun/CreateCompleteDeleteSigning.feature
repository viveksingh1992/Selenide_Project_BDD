Feature: Create a new signing, complete all the steps and go back and delete the signing
  
  Scenario: Initialize browser for Creating a signing
    Given The user initializes a browser session
    
    Scenario: Create the signing, complete all the required steps to send invites
      Given The user navigate to TD and login
      And The user navigate to the "AuthentiSign" section
      Then The user creates a new signing with the name "Test Signing Java" related to the transaction "" with the go to signing button "enabled"
      Then The user adds the default participant to the signing
      And The user uploads the default document to the signing
      Then The user applies the simple design to the signing
      And The user sends the default invites to the signing

    Scenario: Delete the signing
      And The user navigate to the "AuthentiSign" section
      Then The user deletes the signing "Test Signing Java"