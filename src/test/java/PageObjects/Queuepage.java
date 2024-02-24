package PageObjects;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;

public class Queuepage extends BaseClass{

	//static WebDriver driver;
    By btnGetstarted=By.xpath("//button[@class='btn']");
    By txtSignin=By.xpath("//a[@href='/login']");
    By txtusername=By.name("username");
    By txtpassword=By.name("password");
    By btnlogin=By.xpath("//input[@type='submit']");
    By btnGetstartedqueue=By.xpath("//a[@href='queue']");
	By linktextImplementationofqueueinpython=By.linkText("Implementation of Queue in Python");
	By btnTryHere=By.xpath("//a[@href='/tryEditor']");
	By txttryEditor=By.xpath("//div[@class='input']/div/div/textarea");
	By btnRun=By.xpath("//button[@type='button']");
	By resultoutput=By.xpath("//div[@class='input']/div/div/textarea");
	//By linktextimplementationusingcollectionsdeque=By.xpath("/html/body/div[2]/ul[2]/a");
//	By linktextimplementationusingcollectionsdeque=By.xpath("//a[@href='implementation-collections']");
	By linktextimplementationusingcollectionsdeque=By.linkText("Implementation using collections.deque");
	By linktextimplementationusingarray=By.linkText("Implementation using array");
	By linktextQueueoperations=By.linkText("Queue Operations");

/*public Queuepage(WebDriver driver){

	this.driver= driver;
}*/
public void clickGetstarted() {
	
	driver.findElement(btnGetstarted).click();
}
public void clickgetstartedqueue() {
	driver.findElement(btnGetstartedqueue).click();
}
public  void enterUsername(String Username) {
	driver.findElement(txtusername).sendKeys("Dsalgo@146");
}
public  void enterPassword(String Password) {
	driver.findElement(txtpassword).sendKeys("Gpss@146");
}
public void clickSignin() {
	driver.findElement(txtSignin).click();
}
public  void clickLogin() {
	driver.findElement(btnlogin).click();
}
public  void clickImplementationofqueueinpython() {
	driver.findElement(linktextImplementationofqueueinpython).click();
}
public void clickTryHere() {
	driver.findElement(btnTryHere).click();
}
public void enterprinthello() {
	driver.findElement(txttryEditor).sendKeys("print 'hello'");
}
public void enterprinthello1() {
	driver.findElement(txttryEditor).sendKeys("printhello");
	
}
public void clickRun() {
	driver.findElement(btnRun).click();
}
public void resultoutput() {
	driver.findElement(resultoutput).getText();
}
public void clickimplementationusingcollectionsdeque() {
	driver.findElement(linktextimplementationusingcollectionsdeque).click();
}
public void clickimplementationusingarray() {
	driver.findElement(linktextimplementationusingarray).click();
}
public void clickQueueoperations() {
	driver.findElement(linktextQueueoperations).click();
}
public void alertmessage() {
	try {
		  Alert alert = driver.switchTo().alert(); // switch to alert

		  String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		  System.out.println(alertMessage); // Print Alert Message
		  Thread.sleep(5000);
		  alert.accept();

			} catch (Exception e) {
				e.printStackTrace();
			}
	    }


public void loginValidUser (String Username,String Password) {
	driver.findElement(btnGetstartedqueue).click();
	driver.findElement(btnGetstarted).click();
	driver.findElement(txtusername).sendKeys("Dsalgo@146");
	driver.findElement(txtpassword).sendKeys("Gpss@146");
	driver.findElement(txtSignin).click();
	driver.findElement(btnlogin).click();
	//driver.findElement(linktextImplementationofqueueinpython).click();
	driver.findElement(btnTryHere).click();
	driver.findElement(txttryEditor).sendKeys("print 'hello'");
	driver.findElement(txttryEditor).sendKeys("Print hello");
	driver.findElement(btnRun).click();
	driver.findElement(resultoutput).getText();
	//driver.findElement(linktextimplementationusingcollectionsdeque).click();
	//driver.findElement(linktextimplementationusingarray).click();
	//driver.findElement(linktextQueueoperations).click();
}

}
