@wip_wikipedia
Feature: Wikipedia search functionality
  User Story : As a user, when I am on the wikipedia search page
  I should be able to search anything and see relevant results

  Background:
    Given user is in the Wikipedia home page
    When user types Steve Jobs in the wiki search box
    And user clicks wiki search button


  Scenario:
    Then user sees Steve Jobs is in the wiki title

  Scenario: Header Verification
    Then User sees Steve Jobs is in the main header

  Scenario:
    Then User sees Steve Jobs is in the image header