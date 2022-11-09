Feature: Garage

  Background:
    Given I am at CSU homepage

  @smoke @mygarage @test8
  Scenario: Saved Deals functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    And I click on the Recently Viewed Vehicles button
    When I click on the Saved Deals button
    Then I should see my Saved Deals

  @smoke @mygarage @test9
  Scenario: Recently Viewed Vehicles functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the Recently Viewed Vehicles button
    Then I should see my Recently Viewed Vehicles

  @smoke @mygarage @test10
  Scenario: My Appointments functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the My Appointments button
    Then I should see My Appointments

  @smoke @mygarage @test11
  Scenario: My Trades functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the My Trades button
    Then I should see My Trades

  @smoke @mygarage @test12
  Scenario: My Account functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the My Account button
    Then I should see My Account

  @smoke @mygarage @test13
  Scenario: My Address functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the My Address button
    Then I should see My Address

  @smoke @mygarage @test14
  Scenario: My Password functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the My Password button
    Then I should see My Password

  @smoke @mygarage @test15
  Scenario: My Documents functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the My Documents button
    Then I should see My Documents

  @smoke @mygarage @test16
  Scenario: Sign Out functionality from My Garage
    And I click on the "Sign in here" linktext the top nav
    And I enter my valid email address
    And I enter my valid password
    And I click on "Sign In" button from login page
    And I should be able to successfully login
    And I click on the Go to My Garage button
    When I click on the Sign Out button
    Then I should successfully sign out