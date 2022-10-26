Feature: Test the registration and login functionality of orangeHRM

  Scenario: check the login functionality
    Given user enter the valid url
    When user enter the username and password
    And user click the login button
    Then user verifies the homepage
