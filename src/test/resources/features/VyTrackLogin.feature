Feature: User should be able to login
  User Story :
  As a user, I should be able to login with correct credentials to different accounts.
  Accounts are : driver, sales manager, store manager

  @wip_vytrack
  Scenario Outline: Login with different user
    Given user is on the vyTrack login page
    When the user login with valid credentials "<SheetName>" and <RowNumber>
    Then the user should be able to log in and see their name
    Examples:
      | SheetName    | RowNumber |
      | VytrackUsers | 1         |
      | VytrackUsers | 2         |
      | VytrackUsers | 3         |
      | VytrackUsers | 4         |
      | VytrackUsers | 5         |
      | VytrackUsers | 6         |