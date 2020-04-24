Feature: Value My Car
  As a user
  I want to know the value of my car
  So I can know the going rate

  Background:
  Given a user is on Motors homepage
  And user accepts all cookies

  Scenario Outline:
    When user clicks on the valuation tab
    And user enters "<Car Reg>" of the car
    And user enters "<Postcode>"
    And user enters value of car "<Mileage>"
    And user clicks on Value Your Car button
    Then the Car Valuation page is displayed
    And user clicks on Value my car
    And confirmation page is displayed
    And user clicks on This is my vehicle
    And vehicle worth is displayed
    Examples:
      | Car Reg | Postcode | Mileage |

