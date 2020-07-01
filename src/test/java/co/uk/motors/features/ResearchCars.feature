Feature: Research Cars
  As a customer
  I want to be able to read car reviews
  So I can have more information

  Background:
    Given a user is on Motors homepage
    And user accepts all cookies

  Scenario Outline: Customer can read car reviews
    And user clicks on Reviews
    And user selects "<Make>" from the vehicle make options
    And user clicks on the View Review button
    Then available reviews are displayed for "<Make>"


    Examples:
    |Make |
    |Buick |
#    |Ferrari|
