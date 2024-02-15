package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegisterPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.BaseClass;

public class Register extends BaseClass {
	
	//public WebDriver driver ;
	//public static RegisterPage rp;
	
	
	/*@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();

	}*/

	@Given("User on a Register Page")
	public void user_on_a_register_page() {
		
		/*System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		rp = new RegisterPage(driver);*/
		
		String URL = "https://dsportalapp.herokuapp.com/register";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
	}

	@When("user enters username")
	public void user_enters_username() {
      rp.getuname("testing");
	}

	@When("user enters password")
	public void user_enters_password() {
      rp.getpwd1("abcdefgh");
	}

	@When("user enters password confirmation")
	public void user_enters_password_confirmation() {
      rp.getpwd2("abcdefgh");
	}

	@Then("user clicks Register button")
	public void user_clicks_register_button() throws InterruptedException {
      rp.clickregister();
      Thread.sleep(4000);
	}

	@Then("user will be registered")
	public void user_will_be_registered() {
     // rp.alertmsg();
	}
	
	
	@Given("User enters username as {string}")
	public void user_enters_username_as(String string) {
		
		String URL = "https://dsportalapp.herokuapp.com/register";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
        rp.getuname(string);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
        rp.getpwd1(string);
	}

	@Then("User enters password confirmation as {string}")
	public void user_enters_password_confirmation_as(String string) {
        rp.getpwd2(string);
	}
	

	@Then("User should click Register button")
	public void user_should_click_register_button() throws InterruptedException {
         rp.clickregister();
         Thread.sleep(4000);
	}
	
	@Given("User on Register Page")
	public void user_on_register_page() {
		
		String URL = "https://dsportalapp.herokuapp.com/register";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		

	}

	@When("User clicking Login Link")
	public void user_clicking_login_link() {
        rp.login();
	} 

	@Then("User should redirect to Login Page")
	public void user_should_redirect_to_login_page() {

	}	
}
