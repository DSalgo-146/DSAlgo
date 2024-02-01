Feature: Checking Register Page

  Scenario: Clicking Register Link
    Given User on a Register Page
    When user enters username
    And user enters password
    And user enters password confirmation
    Then user clicks Register button
    And user will be registered
    
 
  Scenario Outline: Checking Register Page with different values
    Given User enters username as "<username>"
    When User enters password as "<password>" 
    Then User enters password confirmation as "<passwordconfirm>" 
    Then User should click Register button
 

    Examples: 
      | username  | password | passwordconfirm  | 
      | girija |     123456 | 123456 |
      | saranya |     12345678 | 123456    |
      |  |     12345678 | 123456    |
      | priya |  | 123456    |
      | shami | 123456 |  |
      | Sangeetha |     testpwd | testpwd |
      | Testing@1234 | samplepwd | samplepwd |

  @logintag 
  Scenario: Checking Login Link in Register Page
    Given User on Register Page
    When User clicking Login Link
    Then User should redirect to Login Page      