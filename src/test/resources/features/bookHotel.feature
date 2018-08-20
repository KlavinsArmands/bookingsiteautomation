
Feature: This feature is about booking hotel in a system

  Scenario: Successful booking
    Given I have opened homepage
    And I navigate to Signup page
    And I create new account
    When I select Home button in Navigation bar
    And I select book Hotels button
    And I enter Rendezvous Hotels hotel
    And I select hotel located in Singapore
    And I select 01.09.2018 as Check in date
    And I select 07.09.2018 as Check out date
    And I select 2 Adult and 2 Children
    And I select Search button
    And I select Junior Suites room
    And I select “Confirm this booking” button
    Then Unpaid invoice page is opened
