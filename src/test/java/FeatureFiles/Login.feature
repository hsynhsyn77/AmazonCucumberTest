

Feature: Login Functionality
  @SmokeTest
  Scenario: Login with valid username  and password

    Given Navigate to Amazon
    When Enter username and Password and click login button
    Then User should login successfuly