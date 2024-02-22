package PageObject;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GraphPage {
	
	
	
	public WebDriver driver;
	
	
	private By grapghgetstartedbutton=By.xpath("//a[@href='graph']");
	private By graphlink			 =By.xpath("//a[@href='graph' and @class='list-group-item']");
	private By graphrepresentations  =By.linkText("Graph Representations");
	private By praticequestions		 =By.linkText("Practice Questions");
	private By loginLocator		  	 = By.xpath("//input[@type='submit']");
    private By usernameField	  	 = By.xpath("//input[@id='id_username']");
	private By passwordField 	  	 = By.xpath("//input[@id='id_password']");
	private By tryherebutton         =By.linkText("Try here>>>");
	private By Textarea           =By.xpath("//div[@class='input']/div/div/textarea");
	  ////textarea[@autocorrect='off' and @autocapitalize='off' and @spellcheck='false']
	private By run     			  =By.xpath("//button[@type='button']");  
	private By OutputElement	  =By.xpath("//pre[@id='output']");
	
	 public GraphPage (WebDriver driver) {
	        this.driver = driver;
	      
	    }
	public void graphgetstarted() {
		driver.findElement(grapghgetstartedbutton).click();
		
	}

	public void login(String string, String string2) {
		driver.findElement(usernameField).sendKeys("Dsalgo@146");
	    driver.findElement(passwordField).sendKeys("Gpss@146");		
	}

	public void get(String string) {
		String loginURL ="https://dsportalapp.herokuapp.com/login";
  		driver.get(loginURL);
		
	}
	public void clickloginButton() {	
		driver.findElement(loginLocator).click();	
	}
	  public void Tryhere() {
	  		driver.findElement(tryherebutton).click();
}
	  
	  public void  graphlink() {
		  driver.findElement(graphlink).click();
	  }
	  
	  public void  Textareaclick() {
		  driver.findElement(OutputElement).click();
	  }
		  
	  public void Textarea()  {
		  
		  //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("Textarea ")));

		  driver.findElement(Textarea).sendKeys("print 'helloworld'");
		  
		  
		  
		  
	  }
		 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 // WebElement textArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='input']/div/div/textarea")));

		 
		 // try {
		    //  textArea.click();
		 // } catch (Exception e) {
		   //   System.out.println("Click before typing  ");
//}

		  // Send keys
		  //textArea.sendKeys("print 'helloworld'");
	
	  		
	 
	 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//  WebElement TextArea = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='input']/div/div/textarea")));
	//  TextArea.sendKeys("print 'helloworld'");

	  
	 // driver.findElement(Textarea).sendKeys("print 'helloworld'");

	  public void Run() {
	 driver.findElement(run).click();
 }
	  
	  public void resultoutput() {
	  driver.findElement(OutputElement).click();
	  }
	  
	  public void Alertmessage() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String alertMessage = alert.getText();
			System.out.println("Alert message: " + alertMessage);
			alert.accept(); 	
			
		}
	  
	  public void textareainvalid() {
			driver.findElement(Textarea).sendKeys("printhelloword");
			
		}
	public void graphrepresentationlink() {
		driver.findElement(graphrepresentations).click();
		
	}
	  public void Practicequestion() {
		  driver.findElement(praticequestions).click();
	  }
	  
	  
	  
	  
}