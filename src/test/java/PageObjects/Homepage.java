package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.BaseClass;

public class Homepage extends BaseClass {

	//public WebDriver driver ;
	
	By getstarted = By.xpath("//div//button");
	By clickdrop = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By clickitem = By.xpath("//a[@class='dropdown-item']");
	By alertmsg = By.xpath("//div[@class='alert alert-primary']");
	By clickgetstart = By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	By register = By.xpath("//a[contains(@href,'/register')]");
	By login = By.xpath("//a[contains(@href,'/login')]");
	
	public Homepage(WebDriver rdriver) {
		
		driver = rdriver;
		//PageFactory.initElements(rdriver, this);
	}
	
	/*@FindBy (xpath = "//div//button") WebElement getstarted;
	@FindBy (xpath = "//a[@class='nav-link dropdown-toggle']") WebElement clickdrop;
	@FindBy (xpath = "//a[@class='dropdown-item']") WebElement clickitem;
	@FindBy (xpath = "//div[@class='alert alert-primary']") WebElement alertmsg;
	@FindBy (xpath = "//a[@class='align-self-end btn btn-lg btn-block btn-primary']") WebElement clickgetstart;
	@FindBy (xpath = "//a[contains(@href,'/register')]") WebElement register;
	@FindBy (xpath = "//a[contains(@href,'/login')]") WebElement login;*/
	

	public void getstarted() {
		//getstarted.click();
		driver.findElement(getstarted).click();
	}
	
	public void clickdrop() {
		//clickdrop.click();
		driver.findElement(clickdrop).click();
	}
	public void clickitem() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(clickitem).click();
		//clickitem.click();
	}
	public void alertmsg() {
		//String alerttext = alertmsg.getText();
		//System.out.println(alerttext);
		String alerttext = driver.findElement(alertmsg).getText();
		System.out.println(alerttext);
	}
	public void clickgetstart() throws InterruptedException {
        Thread.sleep(2000);
		//clickgetstart.click();
        driver.findElement(clickgetstart).click();
	}
	public void register() {
		//register.click();
		driver.findElement(register).click();
	}
	public void login() {
		//login.click();
		driver.findElement(login).click();
	}
}
