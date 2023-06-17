

Feature: Add Product To Cart
  Background:
    Given Navigate to Amazon
    When Enter username and Password and click login button
    Then User should login successfuly
  @SmokeTest
  Scenario: Add Product
    And Navigate Departments
    When Select Department Find Product Add
    And Add product to cart
    When Go to cart and delete product
    Then Success message should be displayed






