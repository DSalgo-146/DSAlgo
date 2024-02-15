package PageObjects;

import org.openqa.selenium.By;
import Utilities.BaseClass;

public class RegisterPage extends BaseClass {
	
	//public WebDriver driver ;
	
	/*public RegisterPage(WebDriver rdriver) {
		
		driver = rdriver;
	}*/
	
	By uname = By.id("id_username");
	By pwd1 = By.id("id_password1");
	By pwd2 = By.id("id_password2");
	By register = By.xpath("//input[@value='Register']");
	By alertmsg = By.xpath("//div[@class='alert alert-primary']");
	By login = By.xpath("//a[contains(@href,'/login')]");
	
	public void getuname(String str) {
		driver.findElement(uname).clear();
		driver.findElement(uname).sendKeys(str);
	}
	
	public void getpwd1(String str) {
		driver.findElement(pwd1).clear();		
		driver.findElement(pwd1).sendKeys(str);		
	}
	
	public void getpwd2(String str) {
		driver.findElement(pwd2).clear();	
		driver.findElement(pwd2).sendKeys(str);		
	}
	public void clickregister() {
		driver.findElement(register).click();
	}
	public void alertmsg() {
		String alerttext = driver.findElement(alertmsg).getText();
		System.out.println(alerttext);

	}
	public void login() {
		driver.findElement(login).click();
	}
	
}
