package PageObjects;

import org.openqa.selenium.By;
import Utilities.BaseClass;
import Utilities.LoggerLoad;

public class Homepage extends BaseClass {

	//public WebDriver driver ;
		
	By getstarted = By.xpath("//div//button");
	By clickdrop = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By clickitem = By.xpath("//a[@class='dropdown-item']");
	
	By clickitemarray = By.xpath("//a[@href='/array']");
	By clickitemll = By.xpath("//a[@href='/linked-list']");
	By clickitemstack = By.xpath("//a[@href='/stack']");
	By clickitemqueue = By.xpath("//a[@href='/queue']");
	By clickitemtree = By.xpath("//a[@href='/tree']");
	By clickitemgraph = By.xpath("//a[@href='/graph']");
	By alertmsg = By.xpath("//div[@class='alert alert-primary']");
	By clickgetstart = By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	
	
	By clickdatast = By.xpath("//a[@href='data-structures-introduction']");
	By clickarray = By.xpath("//a[@href='array']");
	By clickll = By.xpath("//a[@href='linked-list']");
	By clickstack = By.xpath("//a[@href='stack']");
	By clickqueue = By.xpath("//a[@href='queue']");
	By clicktree = By.xpath("//a[@href='tree']");
	By clickgraph = By.xpath("//a[@href='graph']");
	
	By register = By.xpath("//a[contains(@href,'/register')]");
	By login = By.xpath("//a[contains(@href,'/login')]");
	
	/*public Homepage(WebDriver rdriver) {
		
		driver = rdriver;
		//PageFactory.initElements(rdriver, this);
	}*/
	
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
		//driver.findElement(clickdrop).click();
	}

	public void clickitem() throws InterruptedException {
        Thread.sleep(2000);
        //driver.findElement(clickitem).click();
        
        driver.findElement(clickdrop).click();
        Thread.sleep(2000);
        driver.findElement(clickitemarray).click();
		String alerttext = driver.findElement(alertmsg).getText();
		System.out.println(alerttext);
		
		/*String actualElementText = driver.findElement(alertmsg).getText();
		String expectedElementText = "You are not logged in";

		try {
		    assertEquals(actualElementText, expectedElementText);
		} catch (AssertionError e) {
		    System.out.println("Not equal");
		    throw e;
		}*/
		        
        Thread.sleep(2000);
        driver.findElement(clickdrop).click();
        Thread.sleep(2000);
        driver.findElement(clickitemll).click();
		String alerttext1 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext1);

        Thread.sleep(2000);
        driver.findElement(clickdrop).click();
        Thread.sleep(2000);
        driver.findElement(clickitemstack).click();
		String alerttext2 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext2);

        Thread.sleep(2000);
        driver.findElement(clickdrop).click();
        Thread.sleep(2000);
        driver.findElement(clickitemqueue).click();
		String alerttext3 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext3);

        Thread.sleep(2000);
        driver.findElement(clickdrop).click();
        Thread.sleep(2000);
        driver.findElement(clickitemtree).click();
		String alerttext4 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext4);

        Thread.sleep(2000);
        driver.findElement(clickdrop).click();
        Thread.sleep(2000);
        driver.findElement(clickitemgraph).click();
		String alerttext5 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext5);

        Thread.sleep(2000);

		//clickitem.click();
	}

	public void alertmsg() {
		//String alerttext = alertmsg.getText();
		//System.out.println(alerttext);
		/*String alerttext = driver.findElement(alertmsg).getText();
		System.out.println(alerttext);*/
		
     /*   // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        		
        // Accepting alert		
        alert.accept();		*/
       
	}

	public void clickgetstart() throws InterruptedException {
        Thread.sleep(2000);
		//clickgetstart.click();
       // driver.findElement(clickgetstart).click();
        
        driver.findElement(clickdatast).click();
		String alerttext1 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext1);

        Thread.sleep(2000);
        driver.findElement(clickarray).click();
		String alerttext2 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext2);

        Thread.sleep(2000);
        driver.findElement(clickll).click();
		String alerttext3 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext3);

        Thread.sleep(2000);
        driver.findElement(clickstack).click();
		String alerttext4 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext4);

        Thread.sleep(2000);
        driver.findElement(clickqueue).click();
		String alerttext5 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext5);

        Thread.sleep(2000);
        driver.findElement(clicktree).click();
		String alerttext6 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext6);

        Thread.sleep(2000);
        driver.findElement(clickgraph).click();
		String alerttext7 = driver.findElement(alertmsg).getText();
		System.out.println(alerttext7);

        Thread.sleep(2000);
        
        
      /*  List<WebElement> listOfElements = driver.findElements(clickgetstart);
        
        for(WebElement element: listOfElements)
        {
        	try {
            //System.out.println("test" + element);        		
             element.click();
        	} catch(StaleElementReferenceException e) {
        		
        	}
        }*/
    /*   for(int i=0;i< listOfElements.size() ;i++) {
    	   
    	   try {
    		   Thread.sleep(2000);
    		  // listOfElements.get(i).click();
    		   System.out.println("elements "+listOfElements.get(i).getAttribute("href"));
    	   } catch(StaleElementReferenceException e) {
    		   
    	   }
       }*/
       
	}

	public void register() throws InterruptedException {
		//register.click();
		driver.findElement(register).click();
		Thread.sleep(2000);
	}

	public void login() throws InterruptedException {
		//login.click();
		driver.findElement(login).click();
		Thread.sleep(2000);
	}
}
