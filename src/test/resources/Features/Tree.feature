Feature: Checking Tree Module

Background:
    Given User in on Home Page
    When User Clicks Sign in Link
    Then user enters username as "Testing@1234"
    And user enters password as "samplepwd"
    When user clicks Login button
    Then User can be logged in
    When User clicks Get Started button on Tree Module
    Then User redirects to Tree Page

@tag1
  Scenario: Checking overview of Tree page
    And User clicks Overview of Trees link
    Then User redirects to Overview of Trees Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed
    
@tag2
  Scenario: Checking Terminology page
    And User clicks Terminologies link
    Then User redirects to Terminologies Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed

@tag3
  Scenario: Checking Types of tree page
    And User clicks Types of tree link
    Then User redirects to Types of tree Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed

@tag4
  Scenario: Checking Tree Traversals page
    And User clicks Tree Traversals link
    Then User redirects to Tree Traversals Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed

@tag5
  Scenario: Checking Traversals-Illustration page
    And User clicks Traversals-Illustration link
    Then User redirects to Traversals-Illustration Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed
    
@tag6
  Scenario: Checking Binary Trees page
    And User clicks Binary Trees link
    Then User redirects to Binary Trees Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed
    
@tag7
  Scenario: Checking Types of Binary Trees page
    And User clicks Types of Binary Trees link
    Then User redirects to Types of Binary Trees Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed

@tag8
  Scenario: Checking Implementation in Python page
    And User clicks Implementation in Python link
    Then User redirects to Implementation in Python Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed    
    
@tag9
  Scenario: Checking Binary Tree Traversals page
    And User clicks Binary Tree Traversals link
    Then User redirects to Binary Tree Traversals Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed  
    
@tag10
  Scenario: Checking Implementation of Binary Trees page
    And User clicks Implementation of Binary Trees link
    Then User redirects to Implementation of Binary Trees Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed    
    
@tag11
  Scenario: Checking Applications of Binary trees page
    And User clicks Applications of Binary trees link
    Then User redirects to Applications of Binary trees Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed   
    
@tag12
  Scenario: Checking Binary Search Trees page
    And User clicks Binary Search Trees link
    Then User redirects to Binary Search Trees Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed       
    
@tag13
  Scenario: Checking Implementation Of BST page
    And User clicks Implementation Of BST link
    Then User redirects to Implementation Of BST Page
    When User clicks Try Here button
    Then User redirects to the Editor
    And User types correct python code
    When User clicks Run button
    Then That python Code will be displayed down
    And User types wrong python code
    When User clicks Run button
    Then Error Alert Message will be displayed                                                                                                                                               