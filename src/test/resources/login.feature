@login
Feature: Login

  @positive-case
  Scenario: Login using valid username and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @negative-case
  Scenario: Login using empty password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Password is required"

  @boundary-case
  Scenario: Login with a maximum password length
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce1233456789"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"
