@Etsy
Feature: Etsy search functionality
  Agile Story: User should be able to type any keyword and see relevant information

  Scenario: Etsy Title verification
    Given user is on the etsy page
    Then user sees title is as excepted

  Scenario: Etsy search functionality title verification
    Given user is on the etsy page
    When user types Wooden Spoon in the search box
    And user clicks search button
    Then user sees Wooden spoon is in the title

  Scenario: Etsy search functionality title verification
    Given user is on the etsy page
    When user types "Wooden Spoon" in the search box
    And user clicks search button
    Then user sees "Wooden spoon" is in the title