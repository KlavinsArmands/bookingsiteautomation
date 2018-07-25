Feature: This feature is about logging in into the system

  Scenario: Successful login
    Given I have opened homepage
    When I select My account menu
    And I select Login button
    And I enter login Email address
    And I enter login Password
    And I select final Login button
    Then user account page is opened

  Scenario: Unsuccessful login
    Given I have opened homepage
    When I select My account menu
    And I select Login button
    And I select final Login button
    Then user account page is opened