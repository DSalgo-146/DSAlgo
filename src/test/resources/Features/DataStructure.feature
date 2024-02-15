Feature: Checking Data Structure Intro Module

Background:
    Given User in on Home Page
    When User Clicks Sign in Link
    Then user enters username as "Testing@1234"
    And user enters password as "samplepwd"
    When user clicks Login button
    Then User can be logged in
    When User clicks Get Started button
    Then User redirects to Data Structure Intro Page

@tag1
  Scenario: Checking Time Complexity Page with correct python code
    And User clicks Time Complexity link
    Then User redirects to Time Complexity Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed

@tag2
Scenario: Checking Practical Questions Page
    And User clicks Time Complexity link
    Then User redirects to Time Complexity Page
    When User clicks Practical Questions Link
    Then User redirects to Practical Questions Page
