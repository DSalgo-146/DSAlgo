@tag
Feature: Array Page Navigation

  Background: User is logged into the application
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks login button
    Then user should redirect to dsalgo home page

  @tag1
  Scenario: Get into Array page
    Given user is on home Page
    When user clicks Get started button
    Then user redirects to array page
    When user clicks on Arrays in Python link
    Then user should be redirected to Arrays in python page
    When user clicks Try here button
    Then user should be navigated to next page
    When user enters correct python code in the Text editor with "print 'hello'"
    And clicks Run button
    Then Result should be displayed in console
    When user enters incorrect python code in the Text editor with "Testing"
    And clicks Run button
    Then Error alert should be displayed in console

  @tag2
  Scenario: Successful Navigation to Array Using List page
    Given user is on home Page
    When user clicks on Get started button under Array section
    Then user redirects to array page
    When User Clicks on Array Using List link
    Then User Should be redirected to Array Using List page
    When user clicks Try here button
    Then user should be navigated to next page
    When user enters correct python code in the Text editor with "print 'hello'"
    And clicks Run button
    Then Result should be displayed in console

  @tag3
  Scenario: Successful navigation to Basic Operations in List
    Given user is on home Page
    When user clicks on Get started button under Array section
    Then user redirects to array page
    When User Clicks on Basic Operations in List link
    Then User Should be redirected to Basic Operations in List page
    When user clicks Try here button
    Then user should be navigated to next page
    When user enters correct python code in the Text editor with "print 'hello'"
    And clicks Run button
    Then Result should be displayed in console

  @tag4
  Scenario: Exploring Applications Of Array Page
    Given user is on home Page
    When user clicks on Get started button under Array section
    Then user redirects to array page
    When User Clicks on Applications Of Array link
    Then User Should be redirected to Applications Of Array page
    When user clicks Try here button
    Then user should be navigated to next page
    When user enters correct python code in the Text editor with "print 'hello'"
    And clicks Run button
    Then Result should be displayed in console

  @tag5
  Scenario: Exploring practice Questions page
    Given User is on 'Arrays in Python' Page
    When User clicks Practice Questions Link
    Then User Should be redirected to Questions Page
    When User clicks 'Search the Array' Link
    Then user redirected to the corresponding question page
    When User enters the Python code in the Text Editor
    And User Clicks the run button
    Then Result Should be displayed in the console
    When User is on Practice questions Page
    And User clicks Max Consecutive Ones link
    Then User should be redirected to the corresponding question page
    When user enters python code in the Text editor
    And Clicks run button
    Then Result should be displayed in console
    When User is on Practice questions Page
    And User clicks 'Find Numbers with Even Number of Digits' link
    Then User should be redirected to the corresponding question page
    When user enters python code in the Text editor
    And Clicks run button
    Then Result should be displayed in console
    When User is on Practice questions Page
    And User clicks Squares of a Sorted Array link
    Then User should be redirected to the corresponding question page
    When user enters python code in the Text editor
    And Clicks run button
    Then Result should be displayed in console
