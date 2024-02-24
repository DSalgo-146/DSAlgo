package StepDefinition;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.BaseClass;
import Utilities.LoggerLoad;


public class ArrayPage_SD extends BaseClass{

	//public WebDriver driver;
	//public static ArrayPage ap;
		
	@Given("user is on login page")
	public void user_is_on_login_page() {
		LoggerLoad.info("User is on login page");
		
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws InterruptedException {
		 Ap.enterusername("Dsalgo@146");
		    Ap.enterpwd("Gpss@146");
		    	   
		
	}

	@When("clicks login button")
	public void clicks_login_button() throws InterruptedException {
		//Thread.sleep(1000);
		Ap.clicklbtn();
	}

	@Then("user should redirect to dsalgo home page")
	public void user_should_redirect_to_dsalgo_home_page() {
	  String url= driver.getCurrentUrl();
	   System.out.println(url);
	}

	

	@Given("user is on home Page")
	public void user_is_on_home_page() {
	    //driver.get("https://dsportalapp.herokuapp.com/home");
		LoggerLoad.info("User Loggedin with valid Username and Password");
	}

	@When("user clicks Get started button")
	public void user_clicks_get_started_button() throws InterruptedException {
	   Thread.sleep(1000);
	   Ap.clickarrgetstarted();
	}

	@Then("user redirects to array page")
	public void user_redirects_to_array_page() throws InterruptedException {
		Thread.sleep(1000);
	    System.out.println(driver.getCurrentUrl());
	    LoggerLoad.info("User is on Array Home Page");
	}

	@When("user clicks on Arrays in Python link")
	public void user_clicks_on_arrays_in_python_link() throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clickarrinpython();
	}

	@Then("user should be redirected to Arrays in python page")
	public void user_should_be_redirected_to_arrays_in_python_page() {
	   driver.getCurrentUrl();
	   System.out.println(driver.getCurrentUrl());
	   LoggerLoad.info("User is on Arrays in Python Page");

	  }

	@When("user clicks Try here button")
	public void user_clicks_try_here_button() throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clickTryhere();
	}

	@Then("user should be navigated to next page")
	public void user_should_be_navigated_to_next_page() {
	    
	}

	
	@When("user enters correct python code in the Text editor with {string}")
	public void user_enters_correct_python_code_in_the_text_editor_with(String string) throws InterruptedException {
		Thread.sleep(4000);
		Ap.sendtexteditor(string);

	}


	@When("clicks Run button")
	public void clicks_run_button() throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clickrunbtn();
	}

	@Then("Result should be displayed in console")
	public void result_should_be_displayed_in_console() {
	      Ap.console();    
	       
	       
	}
	@When("user enters incorrect python code in the Text editor with {string}")
	public void user_enters_incorrect_python_code_in_the_text_editor_with(String string) throws InterruptedException {
		Thread.sleep(4000);
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		Ap.sendtexteditor(string);
	}
	@Then("Error alert should be displayed in console")
	public void error_alert_should_be_displayed_in_console() {
		Ap.captureErrorMsg();
		
	}


	@When("user clicks on Get started button under Array section")
	public void user_clicks_on_get_started_button_under_array_section() throws InterruptedException {
		Thread.sleep(1000);
		   Ap.clickarrgetstarted();
	}

	@When("User Clicks on Array Using List link")
	public void user_clicks_on_array_using_list_link() throws InterruptedException {
	    Thread.sleep(1000);
		Ap.clickarrayusinglist();
	}

	@Then("User Should be redirected to Array Using List page")
	public void user_should_be_redirected_to_array_using_list_page() {
		driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());
		   LoggerLoad.info("User is on Array Using List Page");
    
	}

	@When("User Clicks on Basic Operations in List link")
	public void user_clicks_on_basic_operations_in_list_link() {
	   Ap.clickbasicOpinlist();
	}

	@Then("User Should be redirected to Basic Operations in List page")
	public void user_should_be_redirected_to_basic_operations_in_list_page() {
		driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());
		   LoggerLoad.info("User is on Basic Operations in List Page");
	}

	@When("User Clicks on Applications Of Array link")
	public void user_clicks_on_applications_of_array_link() {
	    
		Ap.clickappofarrays();
	}

	@Then("User Should be redirected to Applications Of Array page")
	public void user_should_be_redirected_to_applications_of_array_page() {
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		LoggerLoad.info("User is on Applications Of Array Page");

	}
	
	@Given("User is on {string} Page")
	public void user_is_on_page(String string) {
		
	    driver.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
	}

	@When("User clicks Practice Questions Link")
	public void user_clicks_practice_questions_link() {
	    
	Ap.clickpracticeques();
	}

	@Then("User Should be redirected to Questions Page")
	public void user_should_be_redirected_to_question_page() {
	LoggerLoad.info("User is on Practice Questions Page");
		
	}

	@When("User clicks {string} Link")
	public void user_clicks_link(String string) throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clicksearcharrques();
		
	}

	@Then("user redirected to the corresponding question page")
	public void user_redirected_to_the_corresponding_link() {
	    LoggerLoad.info("User is on Search the Array Question Page");
	}

	/*@When("User enters the below Python code in the Text Editor")
	public void user_enters_the_below_python_code_in_the_text_editor(DataTable dataTable) throws InterruptedException {
	   		Ap.sendpythoncode();
		}*/	
	@When("User enters the Python code in the Text Editor")
	public void user_enters_the_python_code_in_the_text_editor() {
		Ap.sendpythoncode();
	}


	@When("User Clicks the run button")
	public void user_clicks_the_run_button() throws InterruptedException {
	   Ap.clickrunbtn();
		
	}

	@Then("Result Should be displayed in the console")
	public void result_should_be_displayed_in_the_console() throws InterruptedException {
	    Thread.sleep(1000);
		Ap.console();
	}

	@When("User is on Practice questions Page")
	public void user_is_on_practice_questions_page() {
	String url= "https://dsportalapp.herokuapp.com/array/practice";
	    driver.get(url);
	}

	@When("User clicks Max Consecutive Ones link")
	public void user_clicks_max_consecutive_ones_link() throws InterruptedException {
		LoggerLoad.info("User clicks Max Consecutive Ones Question link");
		Ap.clickmaxconsecones();
	   
	}

	@Then("User should be redirected to the corresponding question page")
	public void user_should_be_redirected_to_the_corresponding_question_page() {
	    
	}

	@When("user enters python code in the Text editor")
	public void user_enters_python_code_in_the_text_editor() {
	   Ap.sendpythoncode();
	    
	}

	@When("Clicks run button")
	public void clicks_run_button1() throws InterruptedException {
	    Ap.clickrunbtn();
	}

	@When("User clicks {string} link")
	public void user_clicks_link1(String string) throws InterruptedException {
		LoggerLoad.info("User clicks 'Find number with even digits' Question link");
		Ap.clickfindnowithevendigits();
	}
	
	@When("User clicks Squares of a Sorted Array link")
	public void user_clicks_squares_of_a_sorted_array_link() throws InterruptedException {
		LoggerLoad.info("User clicks 'Squares of a Sorted Array' Question link"); 
		Ap.clicksquaresofsortarray();
		 
	 }




}
