package StepDefinition;

import PageObject.linkedlistpage;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.BaseclassforDriver;
import io.cucumber.java.en.*;


public class linkedlistpagesteps {
 	
	WebDriver driver;
 WebDriverWait wait;
    public linkedlistpagesteps() {
     this.driver = BaseclassforDriver.getdriver();
       
   }
   public static  linkedlistpage linkedlist;

	@Given("I am logged in with valid credentials")
	public void i_am_logged_in_with_valid_credentials() throws InterruptedException {
		 linkedlist = new linkedlistpage(driver);
		 linkedlist.get("https://dsportalapp.herokuapp.com/login");
		 linkedlist.login("Dsalgo@146","Gpss@146");
		 linkedlist.clickloginButton();
		 //Thread.sleep(3000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		 linkedlist.Linkedlistgetstarted();
		 //Thread.sleep(3000); 
		 
	}

	@Given("I navigate to the Linked List overview page from the homepage")
	public void i_navigate_to_the_linked_list_overview_page_from_the_homepage() {
	    
	}

	@When("I click on the Introduction link")
	public void i_click_on_the_introduction_link() throws InterruptedException {
		linkedlist.Introduction(); 
	   // Thread.sleep(6000);  
	}

	@Then("I get navigated to the Introduction page with details and a Try Here option")
	public void i_get_navigated_to_the_introduction_page_with_details_and_a_try_here_option() {
	   
	}

	@Then("I click Try here button")
	public void i_click_try_here_button() {
	  linkedlist.Tryhere();
	}

	@When("I test a program in the text area section")
	public void i_test_a_program_in_the_text_area_section() throws InterruptedException {
		//driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		 linkedlist.Textarea();
		   // Thread.sleep(4000);
		    linkedlist.Run();
		   // Thread.sleep(3000);
	}

	@Then("I should see  executed results for the valid program")
	public void i_should_see_executed_results_for_the_valid_program() throws InterruptedException {
		linkedlist.resultoutput();
		  
		  // Thread.sleep(2000); 
	}

	@When("I give the invalid program")
	public void i_give_the_invalid_program() throws InterruptedException {
		
	   driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}

	@When("I should get the error popup for the invalid program")
	public void i_should_get_the_error_popup_for_the_invalid_program() throws InterruptedException {
	    linkedlist.textareainvalid();
	    //Thread.sleep(3000);
	    linkedlist.Run();
	   // Thread.sleep(2000);
	    linkedlist.Alertmessage();
	   // Thread.sleep(2000);
	}

	@When("I click  the Creating Linked List link")
	public void i_click_the_creating_linked_list_link() throws InterruptedException {
	    linkedlist.clickcreatinglinkedlist();
	   //.sleep(1000);
	}

	@Then("I navigate to  the Creating Linked List link page with details and a {string} option")
	public void i_navigate_to_the_creating_linked_list_link_page_with_details_and_a_option(String string) {
	  
	}

	@Then("I  by using Try here button i navigate to program page")
	public void i_by_using_try_here_button_i_navigate_to_program_page() throws InterruptedException {
	   linkedlist.Tryhere();
	  // Thread.sleep(1000);
	}

	@When("I test run a program in the Creating Linked List section program page")
	public void i_test_run_a_program_in_the_creating_linked_list_section_program_page() throws InterruptedException {
		//driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		linkedlist.Textarea();
		//Thread.sleep(3000);
	   linkedlist.Run();
	  // Thread.sleep(2000);
	}

	@Then("I should  be seeing the result  execution for the valid program")
	public void i_should_be_seeing_the_result_execution_for_the_valid_program() throws InterruptedException {
	    linkedlist.resultoutput();
	   // Thread.sleep(2000);
	}

	@When("I give invalid program and click Run")
	public void i_give_invalid_program_and_click_run() throws InterruptedException {
		
	    driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    linkedlist.textareainvalid();
	   // Thread.sleep(3000);
	    linkedlist.Run();
	   // Thread.sleep(3000);
	}

	@When("I should  be getting the error popup for the invalid program")
	public void i_should_be_getting_the_error_popup_for_the_invalid_program() throws InterruptedException {
	    linkedlist.Alertmessage();
	    //Thread.sleep(3000);
	}

	@When("I navigate to the Types of linked list link page by clicking the link")
	public void i_navigate_to_the_types_of_linked_list_link_page_by_clicking_the_link() throws InterruptedException {
		 linkedlist.clickTypesoflinkedlist();
		  // Thread.sleep(1000);
	}

	@Then("I should see the Types of linked list page with details and a Try Here option")
	public void i_should_see_the_types_of_linked_list_page_with_details_and_a_try_here_option() {
	    
	}

	@When("I click on Try here")
	public void i_click_on_try_here() throws InterruptedException {
		linkedlist.Tryhere();
		  // Thread.sleep(1000);
		   
	}

	@When("I test run the program in the Types of linked list section")
	public void i_test_run_the_program_in_the_types_of_linked_list_section() throws InterruptedException {
		//driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    linkedlist.Textarea();
	    //Thread.sleep(3000);
	}

	@When("I give the valid program and click the run button")
	public void i_give_the_valid_program_and_click_the_run_button() throws InterruptedException {
	    linkedlist.Run();
	    //Thread.sleep(2000);
	}

	@Then("I  get the test executed")
	public void i_get_the_test_executed() throws InterruptedException {
	    linkedlist.resultoutput();
	    //Thread.sleep(2000);
	}

	@When("i give the invalid program in the text area and run")
	public void i_give_the_invalid_program_in_the_text_area_and_run() throws InterruptedException {
		
	    driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    //Thread.sleep(2000);
	    linkedlist.textareainvalid();
	   // Thread.sleep(3000);
	    linkedlist.Run();
	    //Thread.sleep(2000);
	}

	@Then("I should see the error popup for the invalid program")
	public void i_should_see_the_error_popup_for_the_invalid_program() throws InterruptedException {
		
	   linkedlist.Alertmessage();
	   //Thread.sleep(2000);
	}

	@When("I click through Traversal link to get navigated to the")
	public void i_click_through_traversal_link_to_get_navigated_to_the() throws InterruptedException {
	    linkedlist.clickTraversal();
	    //Thread.sleep(1000);
	}

	@Then("I should see the Traversal page with details and a Try Here option")
	public void i_should_see_the_traversal_page_with_details_and_a_try_here_option() {
	   
	}

	@When("I click on the Try here button")
	public void i_click_on_the_try_here_button() throws InterruptedException {
	    linkedlist.Tryhere();
	   // Thread.sleep(2000);;
	}

	@When("I test a program  on text area by clicking the Run button")
	public void i_test_a_program_on_text_area_by_clicking_the_run_button() throws InterruptedException {
		//driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	   linkedlist.Textarea();
	   //Thread.sleep(3000);
	   linkedlist.Run();
	   //Thread.sleep(2000);
	}

	@Then("I should see  executed result for the valid program")
	public void i_should_see_executed_result_for_the_valid_program() throws InterruptedException {
	   linkedlist.resultoutput();
	   //Thread.sleep(3000);
	}

	@When("I give invalid text and run")
	public void i_give_invalid_text_and_run() throws InterruptedException {
		
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Thread.sleep(2000);
		linkedlist.textareainvalid();
		//Thread.sleep(3000);
		linkedlist.Run();
		//Thread.sleep(2000);
	   
	}

	@When("I should get the error that popup for the invalid program")
	public void i_should_get_the_error_that_popup_for_the_invalid_program() throws InterruptedException {
	   linkedlist.Alertmessage();
	   //Thread.sleep(2000);
	}

	@When("I navigate to the Insertion link page through the link")
	public void i_navigate_to_the_insertion_link_page_through_the_link() throws InterruptedException {
	   linkedlist.clickinsertion();
	   //Thread.sleep(2000);
	}

	@Then("I see the Insertion page with details and a Try Here  option")
	public void i_see_the_insertion_page_with_details_and_a_try_here_option() {
	   
	}

	@When("I click the Try here button")
	public void i_click_the_try_here_button() throws InterruptedException {
	   linkedlist.Tryhere();
	  // Thread.sleep(2000);
	}

	@When("I test a program in the program section and click the run button")
	public void i_test_a_program_in_the_program_section_and_click_the_run_button() throws InterruptedException {
		//driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    linkedlist.Textarea();
	    //Thread.sleep(4000);
	    linkedlist.Run();
	    //Thread.sleep(2000);
	}

	@Then("I  see  executed results for the valid program")
	public void i_see_executed_results_for_the_valid_program() throws InterruptedException {
	   linkedlist.resultoutput();
	   //Thread.sleep(2000);
	}

	@When("I give invalid content in text area and run")
	public void i_give_invalid_content_in_text_area_and_run() throws InterruptedException {
		
	    driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   // Thread.sleep(2000);
	    linkedlist.textareainvalid();
	    //Thread.sleep(3000);
	    linkedlist.Run();
	   // Thread.sleep(2000);
	    linkedlist.Alertmessage();
	    //Thread.sleep(2000);
	}
	
	
	
	

	@When("I navigate through Deletion link to the respective page")
	public void i_navigate_through_deletion_link_to_the_respective_page() throws InterruptedException {
	    linkedlist.clickDeletion();
	   // Thread.sleep(2000);
	}

	@Then("I should  be seeing the Deletion page with details and a Try Here option")
	public void i_should_be_seeing_the_deletion_page_with_details_and_a_try_here_option() {
	    
	}

	@When("I click on the Try here button in Deletion page")
	public void i_click_on_the_try_here_button_in_deletion_page() throws InterruptedException {
	   linkedlist.Tryhere();
	   //Thread.sleep(1000);
	}

	@When("I test the program in the program section and click the run button")
	public void i_test_the_program_in_the_program_section_and_click_the_run_button() throws InterruptedException {
		//driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    linkedlist.Textarea();
	    //Thread.sleep(3000);
	    linkedlist.Run();
	    //Thread.sleep(2000);
	}

	@Then("I will be seeing  the results getting executed for the valid program")
	public void i_will_be_seeing_the_results_getting_executed_for_the_valid_program() throws InterruptedException {
	    linkedlist.resultoutput();
	    //Thread.sleep(2000);
	}

	@When("I click the run by giving invalid program")
	public void i_click_the_run_by_giving_invalid_program() throws InterruptedException {
		  
	    driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   // Thread.sleep(2000);
	    linkedlist.textareainvalid();
	    //Thread.sleep(3000);
	    linkedlist.Run();
	    //Thread.sleep(2000);
	}

	@When("I will be getting the error popup for the invalid program")
	public void i_will_be_getting_the_error_popup_for_the_invalid_program() throws InterruptedException {
	   linkedlist.Alertmessage();
	   //Thread.sleep(2000);
	}

	@Given("I am on the linkedlist introduction page")
	public void i_am_on_the_linkedlist_introduction_page() throws InterruptedException {
	   driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");
	   //Thread.sleep(1000);
	}

	@When("I click on the link for Practice Questions link")
	public void i_click_on_the_link_for_practice_questions_link() throws InterruptedException {
		linkedlist.clickpracticequestions();
		   //Thread.sleep(1000);
	}

	@Then("I am navigated to the Practice Questions page")
	public void i_am_navigated_to_the_practice_questions_page() throws InterruptedException {
	  
	}


 	
}