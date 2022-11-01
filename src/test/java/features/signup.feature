Feature: Login

  Background:
    Given I am at CSU homepage

  @signup @smoke @test4
  Scenario: Signup with valid email and password
    And I click on the "Sign in here" linktext the top nav
    And I click on the "Create an Account" linktext
    And I enter a valid first name
    And I enter a valid last name
    And I enter a valid phone number
    And I enter a valid email address
    And I enter a valid password
    And I enter a valid confirm password
    And I click on the "Next" button
    And I enter a valid address
    And I enter a valid city
    And I select a state
    And I enter a valid zip code
    And I click on the "Next" button on the Address page
    When I click on the "Use this address as entered"

    Then I should be able to successfully login
