package StepDefinition;

import java.time.Duration;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.BaseClass;
import Utilities.LoggerLoad;

public class Home extends BaseClass {
	
	//public WebDriver driver;
	
	//public static Homepage hp;
	

	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
		/*System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		hp = new Homepage(driver);*/
		
	}

	@Given("User opens DSAlgo Portal")
	public void user_opens_ds_algo_portal() {
		
		String URL = "https://dsportalapp.herokuapp.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoggerLoad.info("User opens DSAlgo Portal");
		driver.get(URL);
				
	}

	@When("User click GetStarted button")
	public void user_click_get_started_button() {
        
		LoggerLoad.info("User click GetStarted button");
		hp.getstarted();
	}

	@Then("The DSAlgo Home Page opens")
	public void the_ds_algo_home_page_opens() {

	}

	

	@Given("User on a DSAlgo Portal Home Page")
	public void user_on_a_ds_algo_portal_home_page() {

		String URL = "https://dsportalapp.herokuapp.com/home";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoggerLoad.info("User on a DSAlgo Portal Home Page");
		driver.get(URL);
	}

	@When("User clicks Data Structures dropdown")
	public void user_clicks_data_structures_dropdown() {
        LoggerLoad.info("User clicks Data Structures dropdown");
		hp.clickdrop();

	}

	@Then("User can see six different data structure entries")
	public void user_can_see_six_different_data_structure_entries() {

	}

	@Then("User selects data structure from dropdown")
	public void user_selects_data_structure_from_dropdown() throws InterruptedException {
		LoggerLoad.info("User selects data structure from dropdown");
		hp.clickitem();

	}

	@Then("alert user with the message {string}")
	public void alert_user_with_the_message(String string) {
	   LoggerLoad.info("alert user with the message {string}");
       hp.alertmsg();				
	}

	@Given("User in on Home Page")
	public void user_in_on_home_page() {
		
		String URL = "https://dsportalapp.herokuapp.com/home";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoggerLoad.info("User in on Home Page");
		driver.get(URL);
	
	}

	@When("User clicks Get Started button in Data Structure Topics")
	public void user_clicks_get_started_button_in_data_structure_topics() throws InterruptedException {
        LoggerLoad.info("User clicks Get Started button in Data Structure Topics");
		hp.clickgetstart();
		
	}

	@When("User clicks Register Link")
	public void user_clicks_register_link() throws InterruptedException {
		
		String URL = "https://dsportalapp.herokuapp.com/home";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		LoggerLoad.info("User clicks Register Link");
        hp.register();
	}

	@Then("User will redirect to Register Page")
	public void user_will_redirect_to_register_page() {

	}

	@When("User Clicks Sign in Link")
	public void user_clicks_sign_in_link() throws InterruptedException {
		String URL = "https://dsportalapp.herokuapp.com/home";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		LoggerLoad.info("User Clicks Sign in Link");
        hp.login();
	}

	@Then("User will redirect to login page")
	public void user_will_redirect_to_login_page() {

	}
	
}
