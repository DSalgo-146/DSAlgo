package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
	}
	
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
	public void clicklogin() {
		driver.findElement(login).click();
	}
	public void clickregister() {
		driver.findElement(register).click();
	}
	
	public void test() {
		
	}
	
}
