Feature:Google Search functionality
  Agile story: As a user, when I am on the google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default verification
    When user is on the Google search page
    Then user should see title is Google

  @wip
  Scenario: Search result title verification
    Given user is on the Google search page
    When user searches for apple
    Then user should see apple in the title
#    And user sees 3 apples