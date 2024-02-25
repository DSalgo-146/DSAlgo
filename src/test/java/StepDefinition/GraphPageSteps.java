package StepDefinition;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.GraphPage;
import PageObjects.linkedlistpage;
import Utilities.BaseClass;
//import hooks.BaseclassforDriver;
import io.cucumber.java.en.*;

public class GraphPageSteps extends BaseClass{

//WebDriver driver;
WebDriverWait wait;

/*public GraphPageSteps() {
    this.driver = BaseclassforDriver.getdriver();
      
  }*/
 // public static  GraphPage graph;






	@Given("I am on the login page")
	public void i_am_on_the_login_page() throws InterruptedException {
		//graph = new  GraphPage(driver);
		graph.get("https://dsportalapp.herokuapp.com/login");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60)); 
		
	}

	@When("I enter my credentials and click on the login button")
	public void i_enter_my_credentials_and_click_on_the_login_button() throws InterruptedException {
		graph.login("Dsalgo@146","Gpss@146");
		graph.clickloginButton();
		// Thread.sleep(3000);
	}

	@Then("I am redirected to the Data Structure home page")
	public void i_am_redirected_to_the_data_structure_home_page() {
	    
	}

	@When("I click on the Get Started link")
	public void i_click_on_the_get_started_link() throws InterruptedException {
		 graph.graphgetstarted();
		// Thread.sleep(3000); 
	}

	@Then("I navigate to the Graph Overview page")
	public void i_navigate_to_the_graph_overview_page() {
	    
	}

	@When("I click on the Graph topic link")
	public void i_click_on_the_graph_topic_link() throws InterruptedException {
	    graph.graphlink();
	   // Thread.sleep(3000);
	}

	@Then("I navigate to the Graph Introduction page")
	public void i_navigate_to_the_graph_introduction_page() {
	   
	}

	

	@Then("I see the description and a Try Here button")
	public void i_see_the_description_and_a_try_here_button() throws InterruptedException {
	   graph.Tryhere();

	   //Thread.sleep(1000);
	}

	@When("I enter a valid program into the text area and click Run")
	public void i_enter_a_valid_program_into_the_text_area_and_click_run() throws InterruptedException {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		graph.Textarea();
		//Thread.sleep(4000);
	    graph.Run();
	   // Thread.sleep(3000);
	}

	@Then("I get the result output")
	public void i_get_the_result_output() throws InterruptedException {
		graph.resultoutput();
		
		//Thread.sleep(3000);
	    
	}

	@When("I enter an invalid program into the text area and click {string}")
	public void i_enter_an_invalid_program_into_the_text_area_and_click(String string) throws InterruptedException {
	    driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  //  Thread.sleep(3000);
	    graph.textareainvalid();
	   // Thread.sleep(3000);
	    graph.Run();
	    //Thread.sleep(3000);
	}

	@Then("I get an error popup message")
	public void i_get_an_error_popup_message() throws InterruptedException {
	   graph.Alertmessage();
	  // Thread.sleep(3000);
	}

	@Given("I am on the Graph Overview page")
	public void i_am_on_the_graph_overview_page() throws InterruptedException {
	    driver.get("https://dsportalapp.herokuapp.com/graph/");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@When("I click on the Graph Representations link and then on Try Here")
	public void i_click_on_the_graph_representations_link_and_then_on_try_here() throws InterruptedException {
		
		graph.graphrepresentationlink();
		//Thread.sleep(3000);
		graph.Tryhere();
		//Thread.sleep(1000);
	    
	}

	@Then("I navigate to the Graph Representations program page")
	public void i_navigate_to_the_graph_representations_program_page() {
	    //driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@When("I enter a valid program into the program page textarea and click Run")
	public void i_enter_a_valid_program_into_the_program_page_textarea_and_click_run() throws InterruptedException {
	   graph.Textarea();
	   //Thread.sleep(4000);
	   graph.Run();
	  // Thread.sleep(3000);
	}

	@Then("I get the program  validoutput")
	public void i_get_the_program_validoutput() throws InterruptedException {
	  graph.resultoutput();
	 // Thread.sleep(2000);
	}

	@When("I enter an invalid program into the program page textarea and click Run")
	public void i_enter_an_invalid_program_into_the_program_page_textarea_and_click_run() throws InterruptedException {
	    driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	    //Thread.sleep(3000);
	    graph.textareainvalid();
	   // Thread.sleep(4000);
	    graph.Run();
	   // Thread.sleep(2000);
	}

	@Then("I get an alert popup message")
	public void i_get_an_alert_popup_message() throws InterruptedException {
	   graph.Alertmessage();
	   //Thread.sleep(2000);
	}

	@Given("I am on the Graph introduction page")
	public void i_am_on_the_graph_introduction_page() throws InterruptedException {
	    driver.get("https://dsportalapp.herokuapp.com/graph/graph/");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   // Thread.sleep(2000);
	}

	@When("I click on the  Practice Questions link")
	public void i_click_on_the_practice_questions_link() throws InterruptedException {
	    graph.Practicequestion();
	    //Thread.sleep(3000);
	}

	@Then("I  navigate to the Practice Questions page")
	public void i_navigate_to_the_practice_questions_page() {
	    driver.get("https://dsportalapp.herokuapp.com/graph/practice");
	}



}
