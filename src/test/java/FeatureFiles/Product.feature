

Feature: Add Product To Cart
  Background:
    Given Navigate to Amazon
    When Enter username and Password and click login button
    Then User should login successfuly
  Scenario: Add Product
    And Navigate Departments
    When Select Department Find Product Add
    Then Success message should be displayed



