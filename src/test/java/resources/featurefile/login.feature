Feature: Login Test
  As user I want to login into saucedemo website

  @sanity @regression
  Scenario:  User should login successfully with valid credentials
    Given  I am on homepage
    When   I Enter username "standard_user"
    And    I Enter password "secret_sauce"
    And    I click on Login Button
    Then   I should login successfully
    And    I should see text "Products"

  @smoke @regression
  Scenario: Verify that six products are displayed on page
    Given  I am on homepage
    When   I Enter username "standard_user"
    And    I Enter password "secret_sauce"
    And    I click on Login Button
    Then   I should login successfully
    And     Verify that six products are displayed on page
