Feature: Hamburger

  Background:
    Given I am at CSU homepage

  @smoke @test5
  Scenario: Hamburger functionality signed out
    When I click on the "Hamburger" menu
    Then I should see two options

  @smoke @test6
  Scenario: Hamburger functionality signed out Home option
    And I click on the "Hamburger" menu
    When I click on the "Home" button
    Then I should redirect to the CSU homepage

  @smoke @test7
  Scenario: Hamburger functionality signed out Lifetime Warranty option
    And I click on the "Hamburger" menu
    When I click on the "Lifetime Warranty" button
    Then I should redirect to the warranty page