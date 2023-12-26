@WebTableOrder
Feature: Some of the general functionality verifications


  Scenario: Dropdowns options verifications
    Given user is already logged in to the Web Table app
    When user is on the Order page
    Then user sees bellow options under product dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |