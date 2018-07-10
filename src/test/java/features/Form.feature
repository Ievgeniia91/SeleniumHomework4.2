Feature: As a user I want to login to login to the application, choose the product, complete the payment and shipping
  process and logout from the application


  Scenario Outline: Login, shopping and logout from the app
    Given user navigate to the app url
    When user fills email "<email>"
    And user fills password "<password>"
    And user clicks sign in
    And user clicks women
    And user chooses product
    And user clicks on 'Add to cart' button
    And user proceeds to checkout
    And user proceeds to next checkout
    And user proceeds to next step of checkout
    And user agrees with terms
    And user proceeds to final checkout
    And user chooses pay by check
    And user confirms order
    And user gets order confirmation
    And user goes back to orders
    And user checks total price
    And user logs out from the app
    Then user is logged out
    Examples:
      | email                   | password |
      | activeuser200@gmail.com | 12345    |
      | activeuser300@gmail.com | 67890    |
      | activeuser400@gmail.com | 98765    |









