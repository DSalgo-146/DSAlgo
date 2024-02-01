Feature: Checking Login Page

  Scenario: Checking Login Functionality
    Given User on a Login Page
    And User enters username
    And User enters password
    When User clicks Login button
    Then User can be logged in if details are correct

  Scenario Outline: Checking Login Functionality with different values
    Given User is on a Login Page
    And user enters username as "<uname>"
    And user enters password as "<pwd>"
    When user clicks Login button
    Then User can be logged in if details are correct

    Examples: 
      | uname  | pwd |
      | girija | 123456 |
      | Testing@1234 | samplepwd |

  Scenario: Checking Register Link in Login Page
    Given User on a Login Page
    When User clicking Register Link
    Then User should redirect to Register Page            