Feature: Download a sample guide and verify that the guide exist, then delete it, 2

  Scenario: Download the About the Lone Wolf Link Integration with brokerWOLF Guide
    Given The user initializes a browser session
    And The user navigate to TD and login
    Then The user navigate to the "support" section
    Then The user navigates to the "guides" section inside support
    And The user expands the accordion "Introduction to TransactionDesk" inside the guides section
    And The user downloads the guide "About the Lone Wolf Link Integration with brokerWOLF" from the guides dashboard

  Scenario: Verify About the Lone Wolf Link Integration with brokerWOLF guide was downloaded, then delete it
    Then The user verifies that the guide "About the Lone Wolf Link Integration with brokerWOLF" was downloaded successfully
