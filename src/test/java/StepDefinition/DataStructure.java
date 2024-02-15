package StepDefinition;

import java.time.Duration;

import Utilities.BaseClass;
import io.cucumber.java.en.*;

public class DataStructure extends BaseClass {
	
	@Then("User can be logged in")
	public void user_can_be_logged_in() {

	}

	@When("User clicks Get Started button")
	public void user_clicks_get_started_button() throws InterruptedException {
		
		String URL = "https://dsportalapp.herokuapp.com/home";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
	
       ds.getstarted();
       Thread.sleep(2000);
	}

	@Then("User redirects to Data Structure Intro Page")
	public void user_redirects_to_data_structure_intro_page() {

	}

	@Then("User clicks Time Complexity link")
	public void user_clicks_time_complexity_link() throws InterruptedException {
       ds.clicktime();
       Thread.sleep(2000);
	}

	@Then("User redirects to Time Complexity Page")
	public void user_redirects_to_time_complexity_page() {

	}

	@When("User clicks Try Here button")
	public void user_clicks_try_here_button() throws InterruptedException {
       ds.clicktryhere();
       Thread.sleep(2000);
	}

	@Then("User redirects to the Editor")
	public void user_redirects_to_the_editor() {

	}


	@Then("User types correct python code")
	public void user_types_correct_python_code() throws InterruptedException {

		String code ="print \"Testing correct python code\"";
		ds.sendpythoncode(code);
		Thread.sleep(2000);
	}

	@When("User clicks Run button")
	public void user_clicks_run_button() throws InterruptedException {
		ds.clickrun();
	    Thread.sleep(2000);
	}

	@Then("That python Code will be displayed down")
	public void that_python_code_will_be_displayed_down() throws InterruptedException {
        ds.printoutput();
        Thread.sleep(2000);
	}
	
	@Then("User types wrong python code")
	public void user_types_wrong_python_code() throws InterruptedException {

		String URL = "https://dsportalapp.herokuapp.com/tryEditor";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
		String code ="Testing wrong python code";
		ds.sendwrongcode(code);
		Thread.sleep(2000);

	}

	@Then("Error Alert Message will be displayed")
	public void error_alert_message_will_be_displayed() throws InterruptedException {
		ds.printerrormsg();
        Thread.sleep(2000);		
	}	
	
	@When("User clicks Practical Questions Link")
	public void user_clicks_practical_questions_link() throws InterruptedException {
        ds.clickpracques();
        Thread.sleep(2000);
	}

	@Then("User redirects to Practical Questions Page")
	public void user_redirects_to_practical_questions_page() {

	}	

}
