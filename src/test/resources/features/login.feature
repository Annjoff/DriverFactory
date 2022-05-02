Feature: login to nop commerce
  inorder to login to application
  As a valid user
  I should use valid email and password.
  Scenario:
    Verify login with valid credentials
    Given I navigated to url "https://demo.nopcommerce.com/"
    Then I should be navigated to the homepage
    When i click on the login link from nav bar
    Then I should be navigated to the login page
    When I enter email as "user124@nop.com"
    And I entered password as "tester12"
    And  I click on login button
    Then I should be logged in successfully