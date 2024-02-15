package StepDefinition;

import java.time.Duration;

import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	

	@Given("User on a Login Page")
	public void user_on_a_login_page() {
		
		/*System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);*/
		String URL = "https://dsportalapp.herokuapp.com/login";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
	}

	@Given("User enters username")
	public void user_enters_username() {
		
        lp.getuname("testing");
	}

	@Given("User enters password")
	public void user_enters_password() {
        lp.getpwd("pwd@123");
	}

	@When("User clicks Login button")
	public void user_clicks_login_button1() throws InterruptedException {
        lp.clicklogin();
	}

	@Then("User can be logged in if details are correct")
	public void user_can_be_logged_in_if_details_are_correct() {

	}
	
	@Given("User is on a Login Page")
	public void user_is_on_a_login_page() {
		String URL = "https://dsportalapp.herokuapp.com/login";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
	}
	

	@Given("user enters username as {string}")
	public void user_enters_username_as(String string) {

         lp.getuname(string);
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String string) {
         lp.getpwd(string);
	}

	@When("user clicks Login button")
	public void user_clicks_login_button() throws InterruptedException {
		lp.clicklogin();

	}
	@When("User clicking Register Link")
	public void user_clicking_register_link() throws InterruptedException {
        lp.clickregister();
	}

	@Then("User should redirect to Register Page")
	public void user_should_redirect_to_register_page() {

	}

	


}
