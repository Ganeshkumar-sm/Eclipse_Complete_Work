Feature: Test the registration and login functionality of orangeHRM

  Scenario: check the login functionality
    Given user enter the valid url
    When user gives the username and password
    And user tap the login button
    Then user enters the homepage
    
   