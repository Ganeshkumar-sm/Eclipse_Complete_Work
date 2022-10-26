Feature: Test the registration and login functionality of Facebook

  Scenario: Test the login functionality
    Given user enter the URL
    When user enter the username and password
    And user click the login button
    Then user verifies the homepage