Feature:Bing Search functionality
  Agile story: As a user, when I am on the google search page
  I should be able to search anything and see relevant results

  @wip_orange
  Scenario: Search result title verification
    Given user is on the bing search page
    When user enters orange in the Bing search box
    Then user should see orange in the title

  @wip_orange
  Scenario: Search result title verification
    Given user is on the bing search page
    When user enters "orange" in the Bing search box
    Then user should see "orange" in the title
