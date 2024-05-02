@search-car
Feature: to validate search car functionality

  Scenario: validate search car functionality
    Given i go to home page of "https://www.carsguide.com.au/" url
    When i mouse over the buy+sell option
    And I click on "new" car menu
    And select "BMW" as maker from makersdropdown
    And select "3 series" model from modeldropdown
    And click on "show new vehical" button
    Then I should see list of the cars
    And Page title should be "New BMW 3 series for sale"
