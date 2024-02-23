package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.BaseClass;

public class DataStructure extends BaseClass {

	public WebDriverWait wait;
	By getstarted = By.xpath("//a[@href='data-structures-introduction']");
	By time_complexity = By.xpath("//a[@href='time-complexity']");
	By try_here = By.xpath("//a[@href='/tryEditor']");
	By editortext = By.xpath("//*[@id='answer_form']/div/div/div[1]/textarea");
	By pracques = By.linkText("Practice Questions");
				
	By output = By.id("output");
	By run =By.xpath("//button[@type='button']");
	
	
	
	/*String code = "def search(input_list, num):\r\n  output = 'Number is Not Found'\r\nfor x in input_list:\r\n"
			+ "  if x == num:\r\n"
			+ "   output = 'Number is found'\r\n"
			+ " print(str(num) + ' is '+output)\r\ninput_list=[12,23,45,56,67]\r\n"
			+ "num=564\r\n"
			+ "search(input_list,num)";*/
	

	public void getstarted() {
		driver.findElement(getstarted).click();
	}
	
	public void clicktime() {
		
		driver.findElement(time_complexity).click();
	}
	
	public void clicktryhere() {
		driver.findElement(try_here).click();
	}

	public void sendpythoncode(String str) throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(editortext).sendKeys(str);
	
	}
	
	public void clickrun() {
		driver.findElement(run).click();
	}
	public void printoutput() {
		
		String out = driver.findElement(output).getText();
		System.out.println("Result "+ out);
		
	}
	public void sendwrongcode(String str) throws InterruptedException {
		
		Thread.sleep(10);
		driver.findElement(editortext).sendKeys(str);
		
	}
	public void printerrormsg() {
		
	    try {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Alert data: " + alertText);
	        alert.accept();
	    } catch (NoAlertPresentException e) {
	        e.printStackTrace();
	    }

	}
	
	public void clickpracques() {
		driver.findElement(pracques).click();
	}
}
