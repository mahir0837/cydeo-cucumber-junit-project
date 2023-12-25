@dataTable
Feature: Cucumber data tables implementation practice

  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |
  #Create a new scenario where we list the type of pets we love
  #Print out all the strings in the List
  Scenario: List of pet types I love
    Then I will share my favorites
      | Kangal           |
      | Husky            |
      | Golden Retriever |
      | Golden Doodle    |
      | Munchkin         |
      | Ragdoll cat      |
      | Siberian cat     |

  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jame          |
      | surname | Doe           |
      | age     | 29            |
      | address | somewhere     |
      | state   | CA            |
      | zipcode | 99999         |
      | phone   | 111-1111-1111 |