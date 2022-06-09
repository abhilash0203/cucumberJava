Feature: Test login functionality

  Scenario: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters the username and password
    And user clicks on login
    Then user is navigated to the home page of Bigpicture
