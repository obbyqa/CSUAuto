Feature: Login

  @login @smoke @test1
  Scenario: Login with valid email and password
    Given I am at CSU homepage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    When I click on "Sign In" button from login page
    Then I should be able to successfully login

 @login @smoke @test2
  Scenario: Login with invalid email and valid password
   Given I am at CSU homepage
   And I click on the "Sign in here" linktext the top nav
   And I enter my invalid email address
   And I enter my valid password
   When I click on "Sign In" button from login page
   Then I should not be able to successfully login

  @login @smoke @test3
  Scenario: Login with valid email and invalid password
    Given I am at CSU homepage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my invalid password
    When I click on "Sign In" button from login page
    Then I should not be able to successfully login