Feature: Feature to test queue module

  Scenario: opening a Queue page
    Given user is in Dsalgo homepage
    When user click signin button it should be directed to login page
    And user enter Username and password
    When user clicks loginbutton it should redirected to Dsalgohomepage
    Then user clicks Getstarted button on queue

  Scenario: User is accessing the implementation of queue in python in topic covered title
    Given User is on Dsalgo Queue page
    When User clicks Implementation of queue in Python link
    And User Clicks TryHere button
    Then The user should be directed to a page having an tryEditor with a Run button to test
    When user  enters a code in tryEditor as a valid program
    And User Clicks Run button to run a program and  redirected to implementation of queue in python page and click Try here button
    When user  enters a code in tryEditor as a invalid program
    And User Clicks Run button to run implementation of queue in python program

  Scenario: User is accessing the implementation using collections.deque in topic covered title
    Given User is in Dsalgo Queue page
    When User clicks Implementation using collections.deque link
    And User going to Click TryHere button
    Then The user having an tryEditor with a Run button to test
    When user  enters a code  of collections.deque in tryEditor as a valid program
    And User Click Run button and redirected to implementation using collection .deque page and click Try here button
    When user  enters a code in tryEditor as a invalid program of collections.deque
    And User Clicks Run button to run collections.deque program

  Scenario: User is accessing the implementation using array in topic covered title
    Given User is directed to Dsalgo Queue page
    When User clicks Implementation using array link
    And User Click TryHere button in array
    Then The user is on  the page having an tryEditor with a Run button to test
    When user  enters a code in tryEditor as a valid program of array
    And User Clicks Run button to run a  array program and redirected to implementation using array page and click Try here button
    When user  enters a code in tryEditor as a invalid program of array
    And User Clicks Run button to run implementation using array program

  Scenario: User is accessing the Queue operations in topic covered title
    Given User is Dsalgo Queue page for queue operations
    When User clicks Queue operations link
    And User Clicks TryHere button in queue operations
    Then The user should be directed to a page having an tryEditor with a Run button
    When user  enters a code in tryEditor as a valid program of Queue operations
    And User Clicks Run button to run a queue operations program and redirected to implementation using Queue operations page and click Try here button
    When user  enters a code in tryEditor as a invalid program of Queue operations
    And User Clicks Run button to run Queue operations program
