
Feature: Register or sign in to sell a car
  As a user
  I want the ability to register
  So I can sell my car

  Background:
    Given a user is on Motors homepage
    And user accepts all cookies
@regression
  Scenario Outline: Customer is directed to register when they want to sell a car

    When a user clicks on Sell
    And user enters valid "<Email>"
    And user clicks on the signUp button
    Then the sign in page is displayed

  Examples:
  |Email|
  |titi@mailinator.com|




