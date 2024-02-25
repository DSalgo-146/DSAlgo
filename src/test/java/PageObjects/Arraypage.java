package PageObjects;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class Arraypage extends BaseClass{

	
private  By username=By.xpath("//input[@id='id_username']");
private  By password=By.xpath("//input[@id='id_password']");
private By loginbtn=By.xpath("//input[@value='Login']");
private By arrgetstarted=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]/div/div/a");
private By arrinpython=By.linkText("Arrays in Python");
private By Arrayusinglist=By.linkText("Arrays Using List");
private By basicOpinlist=By.linkText("Basic Operations in Lists");
private By appofarrays=By.linkText("Applications of Array");
private By practiceques=By.linkText("Practice Questions");
private By searcharrques=By.linkText("Search the array");
private By maxconsecones=By.linkText("Max Consecutive Ones");
private By findnowithevendigits=By.linkText("Find Numbers with Even Number of Digits");
private By squaresofsortarray=By.linkText("Squares of a Sorted Array");
private By Tryhere=By.linkText("Try here>>>");
private By texteditor=By.xpath("//div[@class='input']/div/div/textarea");
//private By texteditor=By.xpath("//*[@id='answer_form']/div/div/div[1]/textarea");
private By console=By.xpath("//div[@class='code-area']/div/pre[@id='output']");
private By runbtn=By.xpath("//button[text()='Run']");

/*public Arraypage(WebDriver dr) {
		//Arraypage.driver=dr;
	
}*/
public void enterusername(String uname) throws InterruptedException {
	
	driver.findElement(username).clear();
	Thread.sleep(10);
	driver.findElement(username).sendKeys(uname);
	
}
public void enterpwd(String pwd) {
	driver.findElement(password).clear();
	driver.findElement(password).sendKeys(pwd);
	}

public void clicklbtn() throws InterruptedException {
	
	driver.findElement(loginbtn).click();
	}
	public void clickarrgetstarted() throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(arrgetstarted).click();
	}
	public void clickarrinpython() throws InterruptedException {
		
		Thread.sleep(10);
		driver.findElement(arrinpython).click();
	}
	
     public void clickTryhere() throws InterruptedException {
		
		Thread.sleep(10);
		driver.findElement(Tryhere).click();
	 }

      public void sendtexteditor(String Text) throws InterruptedException {
    	      	  
    	 driver.findElement(texteditor).sendKeys(Text);
    	  /*JavascriptExecutor js=((JavascriptExecutor)driver);
    	  
    	  String javaScript = "document.getElementsByClassName('input')[0].value = 'hello' ";
    	  js.executeScript(javaScript);
    	  /*String Text="hello";
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
  		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(texteditor));
  				
  		((JavascriptExecutor)driver).executeScript("arguments[0].sendkeys(Text);", element);*/
  		
    	  
      }
      public void sendpythoncode() {
    	  driver.findElement(texteditor).sendKeys(Keys.CONTROL,"a");
    	  driver.findElement(texteditor).sendKeys(Keys.DELETE);
    	  String pythoncode="print'hello'";
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	  driver.findElement(texteditor).sendKeys(pythoncode);
      }
      
      public void clickrunbtn() throws InterruptedException {
  		
  		Thread.sleep(10);
  		driver.findElement(runbtn).click();
  	 }
      public void console() {
    	  
    	try {
    	Thread.sleep(1000);
    		WebElement msg= driver.findElement(console);
			System.out.println(msg.getText());
			//Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
      }
      
      public void clickarrayusinglist() throws InterruptedException {
  		
  		Thread.sleep(10);
  		driver.findElement(Arrayusinglist).click();
  	}
      
      public void captureErrorMsg() {
    	  try {
    		  Alert alert = driver.switchTo().alert(); // switch to alert

    		  String alertMessage= driver.switchTo().alert().getText(); // capture alert message

    		  System.out.println(alertMessage); // Print Alert Message
    		  alert.accept();

    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    	    }
      
      public void clickbasicOpinlist() {
    	
    	  driver.findElement(basicOpinlist).click();
      }
      public void clickappofarrays() {
      	
    	  driver.findElement(appofarrays).click();
      }
      public void clickpracticeques() {
    	  driver.findElement(practiceques).click();
      }
      public void clicksearcharrques() throws InterruptedException {
    	  Thread.sleep(10);
    	  driver.findElement(searcharrques).click();
      }
      public void clickmaxconsecones() throws InterruptedException {
    	  Thread.sleep(10);
    	  driver.findElement(maxconsecones).click();
      }
      public void clickfindnowithevendigits() throws InterruptedException {
    	  Thread.sleep(10);
    	  driver.findElement(findnowithevendigits).click();
      }
      public void clicksquaresofsortarray() throws InterruptedException {
    	  Thread.sleep(10);
    	  driver.findElement(squaresofsortarray).click();
    	  
      }
      
}
