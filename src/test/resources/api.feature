Feature: Test Automation Rest API For Get Method

  @api
  Scenario: Get user data with valid ID
    Given I set GET method to "ClientURL"
    When I send the request
    Then I should recieve a 200 status code
    Then I should validate response body for single user
    Then I should validate response json with JSONSchema "get_single_user.json"

  @api
  Scenario: Get user data with invalid ID
    Given I have an invalid user ID "getInvalidID"
    When I send the request
    Then I should recieve a 404 status code