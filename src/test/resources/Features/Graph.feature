Feature: Graph Data Structure Exploration

  Background: User is logged in and on the Graph Overview page
    Given I am on the login page
    When I enter my credentials and click on the login button
    Then I am redirected to the Data Structure home page
    When I click on the Get Started link
    Then I navigate to the Graph Overview page
@tag1
  Scenario: Navigate to Graph Page
    When I click on the Graph topic link
    Then I navigate to the Graph Introduction page
    Then I see the description and a Try Here button
    When I enter a valid program into the text area and click Run
    Then I get the result output
    When I enter an invalid program into the text area and click "Run"
    Then I get an error popup message
@tag2
  Scenario: Navigate to Graph Representations Program Page
    Given I am on the Graph Overview page
    When I click on the Graph Representations link and then on Try Here
    Then I navigate to the Graph Representations program page
    When I enter a valid program into the program page textarea and click Run
    Then I get the program  validoutput
    When I enter an invalid program into the program page textarea and click Run
    Then I get an alert popup message
    
Scenario: Accessing Practical Questions on Linked List
    Given I am on the Graph introduction page
    When I click on the  Practice Questions link
    Then I  navigate to the Practice Questions page