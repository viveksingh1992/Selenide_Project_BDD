Feature: Download a sample guide and verify that the guide exist, then delete it, 1

  Scenario: Initialize browser for AG111
    Given The user initializes a browser session

  Scenario: Download the About TransactionDesk Guide
    And The user navigate to TD and login
    Then The user navigate to the "support" section
    Then The user navigates to the "guides" section inside support
    And The user expands the accordion "Introduction to TransactionDesk" inside the guides section
    And The user downloads the guide "About TransactionDesk" from the guides dashboard

  Scenario: Verify About TransactionDesk guide was downloaded, then delete it
    Then The user verifies that the guide "About TransactionDesk" was downloaded successfully