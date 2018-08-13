Feature: This feature is about logging in into the system

  Scenario: Successful login
    Given I have opened homepage
    And I navigate to Signup page
    And I create new account
    And I select User Account button
    And I select logout
    When I select My account menu
    And I select Login button
    And I enter login Email address
    And I enter login Password
    And I select final Login button
    Then user account page is opened

