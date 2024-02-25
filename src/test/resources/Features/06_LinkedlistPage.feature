Feature: Learning and Practicing Linked List Operations

  Background: 
    Given I am logged in with valid credentials
    And I navigate to the Linked List overview page from the homepage 
  @tag1 
  Scenario: Navigating to Introduction of Linked List and Testing Program Execution
    When I click on the Introduction link 
 
    Then I get navigated to the Introduction page with details and a Try Here option
    And I click Try here button
    When I test a program in the text area section
    Then I should see  executed results for the valid program
    When I give the invalid program
    And  I should get the error popup for the invalid program

  Scenario: Navigating to Creating Linked List and Testing Program Execution
    When I click  the Creating Linked List link
    Then I navigate to  the Creating Linked List link page with details and a 'Try Here' option
    And  I  by using Try here button i navigate to program page
    When I test run a program in the Creating Linked List section program page
    Then I should  be seeing the result  execution for the valid program
    When I give invalid program and click Run 
    And  I should  be getting the error popup for the invalid program 

 
 Scenario: Navigating to Types of Linked List and Testing Program Execution
    When I navigate to the Types of linked list link page by clicking the link
    Then I should see the Types of linked list page with details and a Try Here option
    When I click on Try here
    And I test run the program in the Types of linked list section
    And I give the valid program and click the run button
    Then I  get the test executed   
    When i give the invalid program in the text area and run  
    Then  I should see the error popup for the invalid program
    
    
    
  Scenario: Navigating to Traversal and Testing Program Execution
    When I click through Traversal link to get navigated to the 
    Then I should see the Traversal page with details and a Try Here option
    When I click on the Try here button 
    And I test a program  on text area by clicking the Run button
    Then I should see  executed result for the valid program 
    When I give invalid text and run 
    And  I should get the error that popup for the invalid program
    
    
    Scenario: Navigating to Insertion and Testing Program Execution
    When I navigate to the Insertion link page through the link
    Then I see the Insertion page with details and a Try Here  option
    When I click the Try here button
    When I test a program in the program section and click the run button
    Then I  see  executed results for the valid program
    When I give invalid content in text area and run 
    When I give invalid text and run 
    Then  I should get the error that popup for the invalid program
    
   
    Scenario:  Understanding Linked List Deletion
    When I navigate through Deletion link to the respective page
    Then I should  be seeing the Deletion page with details and a Try Here option
    When I click on the Try here button in Deletion page
    When I test the program in the program section and click the run button
    Then I will be seeing  the results getting executed for the valid program
    When I click the run by giving invalid program
    And  I will be getting the error popup for the invalid program
    
    
    
     Scenario: Accessing Practical Questions on Linked List
    Given I am on the linkedlist introduction page
    When I click on the link for Practice Questions link
    Then I am navigated to the Practice Questions page
    
    