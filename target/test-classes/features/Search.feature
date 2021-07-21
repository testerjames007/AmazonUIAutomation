Feature: Search feature
  As an authenticated user
  I want to use search functionality
  So that I should be able search a product

  @Smoke
  Scenario: SearchProduct
    Given user is on a login page
    And user has provided valid credentials
    When user search for the product "Blouse"
    Then user should see the products for "Blouse"