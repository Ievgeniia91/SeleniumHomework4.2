Feature: Form automation
  As a user I want to fill up the form and submit it.

  Scenario Outline: Form filling and submission
    Given user navigate to the app url
    When user fills first name with value "<name1>"
    And user fills last name text with value "<name2>"
    And user chooses gender
    And user fills date of birth
    And user fills address "<address>"
    And user fills email "<email>"
    And user fills password "<password>"
    And user fills company name "<compName>"
    And user chooses role
    And user chooses job expectations
    And user chooses ways of development
    And user fills comment "<comment>"
    And user clicks submit button
    Then form is submitted
   
    Examples:
      | name1 | name2   | address  | email            | password | compName | comment   |
      | David | Wilson  | Address1 | email1@gmail.com | 12345    | Brut     | Nice      |
      | Jane  | Donovan | Address2 | email2@gmail.com | 54321    | Dice     | Great     |
      | Olga  | Koshan  | Address3 | email3@gmail.com | 67890    | Forte    | Excellent |










