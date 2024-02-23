package PageObjects;

import org.openqa.selenium.By;
import Utilities.BaseClass;

public class LoginPage extends BaseClass {

	/*public LoginPage(WebDriver rdriver) {
		driver = rdriver;
	}*/
	
	By uname = By.id("id_username");
	By pwd = By.id("id_password");
	By login = By.xpath("//input[@value='Login']");	
	By register = By.xpath("//a[contains(@href,'/register')]");	
	
	public void getuname(String str) {
		driver.findElement(uname).sendKeys(str);
	}
	public void getpwd(String str) {
		driver.findElement(pwd).sendKeys(str);
	}
	public void clicklogin() throws InterruptedException {
		driver.findElement(login).click();
		Thread.sleep(10);
	}
	public void clickregister() throws InterruptedException {
		driver.findElement(register).click();
		Thread.sleep(10);
	}
	
	
}
