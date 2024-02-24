package StepDefinition;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.Queuepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.BaseClass;
//import cucumberpages.Base;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Queuesteps  extends BaseClass {
	 //public static WebDriver driver= null;
	//queue qu=new queue(driver);
   // public static queue qu;
   
	@Given("user is in Dsalgo homepage")
	public void user_is_in_dsalgo_homepage() {
		//WebDriverManager.chromedriver().setup();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
	    driver=new ChromeDriver();
     	// qu=new queue(driver);
     	driver.manage().window().maximize();
	  driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("user click signin button it should be directed to login page")
	public void user_click_signin_button_it_should_be_directed_to_login_page() throws InterruptedException  {
	   
		qu.clickSignin();
	   Thread.sleep(1000);
	}

	@When("user enter Username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		 
		qu.enterUsername("Dsalgo@146");
		qu.enterPassword("Gpss@146");
		 Thread.sleep(3000);
	}

	@When("user clicks loginbutton it should redirected to Dsalgohomepage")
	public void user_clicks_loginbutton_it_should_redirected_to_dsalgohomepage() throws InterruptedException {
		
		qu.clickLogin();
		Thread.sleep(1000);
	}

	@Then("user clicks Getstarted button on queue")
	public void user_clicks_getstarted_button_on_queue() throws InterruptedException {
		
		qu.clickgetstartedqueue();
		Thread.sleep(1000);
	}

@Given("User is on Dsalgo Queue page")

	public void user_is_on_dsalgo_queue_page() throws InterruptedException {
	// qu=new queue(driver);
    driver.get("https://dsportalapp.herokuapp.com/queue/"); 
   Thread.sleep(1000);
	}

	@When("User clicks Implementation of queue in Python link")
	public void user_clicks_implementation_of_queue_in_python_link() throws InterruptedException {
		 
		qu.clickImplementationofqueueinpython();
	  Thread.sleep(1000);
	}

	@When("User Clicks TryHere button")
	public void user_clicks_try_here_button() throws InterruptedException {
		
		qu.clickTryHere();
	    Thread.sleep(1000);
	}

	@Then("The user should be directed to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_directed_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws InterruptedException {
		
		driver.get("https://dsportalapp.herokuapp.com/tryEditor"); 
		Thread.sleep(1000);
	}

	@When("user  enters a code in tryEditor as a valid program")
	public void user_enters_a_code_in_try_editor_as_a_valid_program() throws InterruptedException {                   //write code
		
		qu.enterprinthello();
		Thread.sleep(1000);
	}
	@When("User Clicks Run button to run a program and  redirected to implementation of queue in python page and click Try here button")
	public void user_clicks_run_button_to_run_a_program_and_redirected_to_implementation_of_queue_in_python_page_and_click_try_here_button() throws InterruptedException {
		qu.clickRun();
		qu.resultoutput();
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		
		Thread.sleep(3000);
	}
	

	@When("user  enters a code in tryEditor as a invalid program")
	public void user_enters_a_code_in_try_editor_as_a_invalid_program() throws InterruptedException {                          //writecode
		
		qu.enterprinthello1();
		Thread.sleep(1000);
	}

	@When("User Clicks Run button to run implementation of queue in python program")
	public void user_clicks_run_button_to_run_implementation_of_queue_in_python_program() throws InterruptedException {
		
		qu.clickRun();
		qu.alertmessage();
		Thread.sleep(3000);
	}

	@Given("User is in Dsalgo Queue page")
	public void user_is_in_dsalgo_queue_page() throws InterruptedException {
		
			driver.get("https://dsportalapp.herokuapp.com/queue/");    
		Thread.sleep(1000);
	}
	
	
	@When("User clicks Implementation using collections.deque link")
	public void user_clicks_implementation_using_collections_deque_link() throws InterruptedException {
		qu.clickimplementationusingcollectionsdeque();
	//	qu.clickimplementationusingcollectionsdeque();
		Thread.sleep(1000);
	}

	
	@When("User going to Click TryHere button")
	public void user_going_to_click_try_here_button() throws InterruptedException {
		
		qu.clickTryHere();
		Thread.sleep(1000);
	}

	@Then("The user having an tryEditor with a Run button to test")
	public void the_user_having_an_try_editor_with_a_run_button_to_test() throws InterruptedException {
		
		driver.get("https://dsportalapp.herokuapp.com/tryEditor"); 
		Thread.sleep(1000);
	}

	@When("user  enters a code  of collections.deque in tryEditor as a valid program")
	public void user_enters_a_code_of_collections_deque_in_try_editor_as_a_valid_program() throws InterruptedException { //write a code
		
		qu.enterprinthello();
		Thread.sleep(1000);
	}

	
	@When("User Click Run button and redirected to implementation using collection .deque page and click Try here button")
	public void user_click_run_button_and_redirected_to_implementation_using_collection_deque_page_and_click_try_here_button() throws InterruptedException {
		qu.clickRun();
		qu.resultoutput();
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		Thread.sleep(1000); 
	}
	@When("user  enters a code in tryEditor as a invalid program of collections.deque")
	public void user_enters_a_code_in_try_editor_as_a_invalid_program_of_collections_deque() throws InterruptedException {   //write a code
		
		qu.enterprinthello1();
		Thread.sleep(1000);
	}

	@When("User Clicks Run button to run collections.deque program")
	public void user_clicks_run_button_to_run_collections_deque_program() throws InterruptedException {
		
		qu.clickRun();
		qu.alertmessage();
		Thread.sleep(1000);
	}

	@Given("User is directed to Dsalgo Queue page")
	
	public void user_is_directed_to_dsalgo_queue_page() throws InterruptedException {
		
		
		driver.get("https://dsportalapp.herokuapp.com/queue/");    
		Thread.sleep(1000);
	}

	@When("User clicks Implementation using array link")
	public void user_clicks_implementation_using_array_link() throws InterruptedException {
		
		qu.clickimplementationusingarray();
		Thread.sleep(1000);
	}

	@When("User Click TryHere button in array")
	public void user_click_try_here_button_in_array() throws InterruptedException {
		
		qu.clickTryHere();
		Thread.sleep(1000);
	}

	@Then("The user is on  the page having an tryEditor with a Run button to test")
	public void the_user_is_on_the_page_having_an_try_editor_with_a_run_button_to_test() throws InterruptedException {
		
		driver.get("https://dsportalapp.herokuapp.com/tryEditor"); 
		Thread.sleep(1000);
	}

	@When("user  enters a code in tryEditor as a valid program of array")
	public void user_enters_a_code_in_try_editor_as_a_valid_program_of_array() throws InterruptedException {      //write a code
		
		qu.enterprinthello();
		Thread.sleep(1000);
	}
	@When("User Clicks Run button to run a  array program and redirected to implementation using array page and click Try here button")
	public void user_clicks_run_button_to_run_a_array_program_and_redirected_to_implementation_using_array_page_and_click_try_here_button() throws InterruptedException {
		qu.clickRun();
		qu.resultoutput();
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		Thread.sleep(3000);
	}
	

	@When("user  enters a code in tryEditor as a invalid program of array")
	public void user_enters_a_code_in_try_editor_as_a_invalid_program_of_array() throws InterruptedException {             //write a code
		
		qu.enterprinthello1();
		Thread.sleep(1000);
	}

	@When("User Clicks Run button to run implementation using array program")
	public void user_clicks_run_button_to_run_implementation_using_array_program() throws InterruptedException {
		
		qu.clickRun();
		qu.alertmessage();
		Thread.sleep(3000);
	}
	

	@Given("User is Dsalgo Queue page for queue operations")
	public void user_is_dsalgo_queue_page_for_queue_operations() throws InterruptedException {
		
		driver.get("https://dsportalapp.herokuapp.com/queue/");    
		Thread.sleep(1000);
	}

	@When("User clicks Queue operations link")
	public void user_clicks_queue_operations_link() throws InterruptedException {
		 
		qu.clickQueueoperations();
		Thread.sleep(1000);
	}

	@When("User Clicks TryHere button in queue operations")
	public void user_clicks_try_here_button_in_queue_operations() throws InterruptedException {
		 
		qu.clickTryHere();
		Thread.sleep(1000);
	}

	@Then("The user should be directed to a page having an tryEditor with a Run button")
	public void the_user_should_be_directed_to_a_page_having_an_try_editor_with_a_run_button() throws InterruptedException {
		   
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		Thread.sleep(1000);
	}

	@When("user  enters a code in tryEditor as a valid program of Queue operations")
	public void user_enters_a_code_in_try_editor_as_a_valid_program_of_queue_operations() throws InterruptedException {      //write a code
		
		qu.enterprinthello();
		Thread.sleep(1000);
	}
	@When("User Clicks Run button to run a queue operations program and redirected to implementation using Queue operations page and click Try here button")
	public void user_clicks_run_button_to_run_a_queue_operations_program_and_redirected_to_implementation_using_queue_operations_page_and_click_try_here_button() throws InterruptedException {
		qu.clickRun();
		qu.resultoutput();
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		Thread.sleep(3000);  
	}

	
	@When("user  enters a code in tryEditor as a invalid program of Queue operations")
	public void user_enters_a_code_in_try_editor_as_a_invalid_program_of_queue_operations() throws InterruptedException {   //write a code
		
		qu.enterprinthello1();
		Thread.sleep(1000);
		
	}

	@When("User Clicks Run button to run Queue operations program")
	public void user_clicks_run_button_to_run_queue_operations_program() throws InterruptedException {
		
		qu.clickRun();
		qu.alertmessage();
		Thread.sleep(3000);
	}

}
