Feature: DSAlgo Home Page

  Scenario: Entering DSAlgo Home Page
    Given User launch Chrome Browser
    And User opens DSAlgo Portal
    When User click GetStarted button
    Then The DSAlgo Home Page opens

  Scenario: Only Registered User can access portal
    Given User on a DSAlgo Portal Home Page
    When User clicks Data Structures dropdown
    Then User can see six different data structure entries
    And User selects data structure from dropdown
    Then alert user with the message 'You are not Logged in'
    
  Scenario: Exploring Get Started button in Data Structure Topics
    Given User in on Home Page
    When User clicks Get Started button in Data Structure Topics
    Then alert user with the message 'You are not Logged in'
    
  Scenario: User clicks Register Link
    Given User on a DSAlgo Portal Home Page
    When User clicks Register Link
    Then User will redirect to Register Page
    
  Scenario: User Clicks Sign in Link
    Given User on a DSAlgo Portal Home Page
    When User Clicks Sign in Link
    Then User will redirect to login page        
