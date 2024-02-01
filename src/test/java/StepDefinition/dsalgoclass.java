package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dsalgoclass {

	public static WebDriver driver ;
	String URL = "https://dsportalapp.herokuapp.com/";
	
	/*@FindBy (xpath = "//button//span[text()='Dismiss']") WebElement dismissBtn;
	@FindBy (id = "emailControl") WebElement emailID;
	@FindBy (id = "passwordControl") WebElement passwordTxt;
	@FindBy (id = "repeatPasswordControl") WebElement confirmPassword;
	@FindBy (xpath = "//div[@id='mat-select-value-1']/span") WebElement secQnBox;
	@FindBy (xpath = "//span[text()=' Your eldest siblings middle name? ']") WebElement secQn;
	@FindBy (id = "securityAnswerControl") WebElement secQnAns;*/

	@FindBy (xpath = "//div//button") WebElement getstarted;
	@FindBy (xpath = "//a[contains(@href,'/register')]") WebElement register;
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(URL);
		
		PageFactory.initElements(driver, this);
		
		getstarted.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		register.click();
		//emailID.sendKeys("vijay@bharathi.com");
	}

	@Given("some other precondition")
	public void some_other_precondition() {

		/*passwordTxt.sendKeys("bharathi.1234");
		confirmPassword.sendKeys("bharathi.1234");
		secQnBox.click();
		secQn.click();
		secQnAns.sendKeys("vijay");*/
	}

	@When("I complete action")
	public void i_complete_action() {

	}

	@When("some other action")
	public void some_other_action() {

	}

	@When("yet another action")
	public void yet_another_action() {

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {

	}

	@Then("check more outcomes")
	public void check_more_outcomes() {

	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {

	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {

	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {

	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {

	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {

	}
}
