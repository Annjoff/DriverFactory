#use of Background

Feature: Register new user
  Background: Navigate to url and click register link
    Given I navigated to url "https://demo.nopcommerce.com/"
    Then I should be navigated to the homepage
    When i click on the register link from nav bar

  Scenario: Verify registration by providing data in all mandatory fields
    When I click on gender as male
    And I enter firstName lastName email password confirmPassword
      |firstName|lastName |email         |password|confirmPassword|
      |Peter    |George   |user07@nop.com|tester1|tester1         |
    And I click on register button
    Then I should be registered successfully

  # Scenario: Add  a product to cart
   #  When I enter my product "laptop" to search text box in the second navigation bar
   #  And I click on the search button
   #  Then I should be navigated to the product page
   #  When I click add to cart button of the first laptop listed
   #  Then the product is added successfully to the cart