package PageObject;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.BaseclassforDriver;
import junit.framework.Assert;

public class linkedlistpage {
	//private static final By errorMessage = null;
	public WebDriver driver;
	public WebDriverWait wait;
	 
	    

	 	private By LinkedListgetstart =By.xpath("//a[@href='linked-list']");
	 	private By introduction       = By.xpath("//a[@href='introduction' and @class='list-group-item'][text()='Introduction']");
	    private By creatinglinkedlist =By.linkText("Creating Linked LIst");
	    private By Typesoflinkedlist  =By.linkText("Types of Linked List");
	    private By Implementoflinkedlistinpython=By.linkText("Implement Linked List in Python");
	    private By Traversal          =By.linkText("Traversal");		
	    private By Insertion          =By.linkText("Insertion");
	    private By Deletion           = By.linkText("Deletion") ;
	    private By practisequestions  =By.linkText("Practice Questions");
	    private By Tryhere            =By.xpath("//a[@class='btn btn-info']");
	    private By Textarea           =By.xpath ("//div[@class='input']/div/div/textarea");
	    		  ////textarea[@autocorrect='off' and @autocapitalize='off' and @spellcheck='false']
	    private By run     			  =By.xpath("//button[@type='button']");  
	    private By OutputElement	  =By.xpath("//pre[@id='output']");
	    private By loginLocator		  = By.xpath("//input[@type='submit']");
	    private By usernameField	  = By.xpath("//input[@id='id_username']");
		private By passwordField 	  = By.xpath("//input[@id='id_password']");
	     
 
	      public linkedlistpage(WebDriver driver) {
	        this.driver = driver;
	      
	    }
	      
	    
	     // wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	      public void get(String string) {
		  		String loginURL ="https://dsportalapp.herokuapp.com/login";
		  		driver.get(loginURL);	
	  }
	      
	  public void login(String string, String string2) throws InterruptedException {
	    		driver.findElement(usernameField).sendKeys("Dsalgo@146");
	    	    driver.findElement(passwordField).sendKeys("Gpss@146");
	    
	    	}	      
	  public void clickloginButton() {	
	    		driver.findElement(loginLocator).click();	
	    	}

	  public void Linkedlistgetstarted()  {

		  		driver.findElement(LinkedListgetstart).click();
	  }
	  
	  public void Introduction() {
	
		  		driver.findElement(introduction).click();
		  		

	  }

	  public void Tryhere() {
		  		driver.findElement(Tryhere).click();
		  		//wait.until(ExpectedConditions.elementToBeClickable(Tryhere)).click();
	  }


	  public void Textarea()  {
		  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  		driver.findElement(Textarea).sendKeys("print 'hello'");
	  }
	 

	  public void Run() {
		  		driver.findElement(run).click();
		  		//wait.until(ExpectedConditions.elementToBeClickable(run)).click();

	  }
	  public  void resultoutput() {
		 driver.findElement(OutputElement).getText();
	  }
				//String resultoutput = ((Alert) OutputElement).getText();
		//System.out.println("outputareamessage: " + resultoutput);



public void Alertmessage() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert = driver.switchTo().alert();
	String alertMessage = alert.getText();
	System.out.println("Alert message: " + alertMessage);
	alert.accept(); 	
	
}

	
	public void clickcreatinglinkedlist() {
		driver.findElement(creatinglinkedlist).click();
		//wait.until(ExpectedConditions.elementToBeClickable(creatinglinkedlist)).click();

}
	 public void clickImplementoflinkedlistinpython() {
	  		driver.findElement(Implementoflinkedlistinpython).click();
	
}
	
	public void clickTypesoflinkedlist() {
		driver.findElement(Typesoflinkedlist).click();
		
		
	}
	public void clickTraversal() {
		driver.findElement(Traversal).click();
}
	
	
	
	public void clickDeletion() {
		driver.findElement(Deletion).click();
	}
	public void clickinsertion() {
		driver.findElement(Insertion).click();
	}
	
	public void clickpracticequestions() {
		driver.findElement(practisequestions).click();
	}

	public void textareainvalid() {
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(Textarea).sendKeys("printhello");
		
	}
	
	
	
	public void textareaclear() {
		driver.findElement(Textarea).clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}