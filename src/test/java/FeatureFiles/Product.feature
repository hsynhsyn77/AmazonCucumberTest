

Feature: Add Product To Cart
  Scenario: Add Product
    Given Navigate to Amazon
    When Enter username and Password and click login button
    Then User should login successfuly
    And Navigate Departments
    When Select Department Find Product Add
    Then Success message should be displayed


