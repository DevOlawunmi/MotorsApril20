@ready
Feature: Search cars for sale
  As a customer
  I want to be able to search cars for sale
  So I can get more details about the car

  Background:
    Given a user is on Motors homepage
    And user accepts all cookies
@regression
  Scenario Outline: Customer can search cars for sale
    And user enters "<Postcode>"
    And user selects "<Make>" from the vehicle make options
    And user selects "<MinPrice>" from the minimum price list
    And user selects "<MaxPrice>" from the maximum price list
    And user clicks on the search button
    Then a list of vehicle "<Make>" in "<Postcode>" is displayed
    And user clicks on one of the result links

    Examples:
      |Postcode|Make|MinPrice|MaxPrice|
      |M400GE|Audi|£3,000|£12,500|
#      |AB166UP|Ford|£2,000|£10,000|
#      |ST47DW|Citroen|£5,000|£20,000|
#@ignore
#  Scenario: Customer cannot search cars for sale without entering valid postcode
#    And user clicks on the search button
#    Then user is prompted to enter a valid postcode
