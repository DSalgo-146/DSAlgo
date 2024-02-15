package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import PageObjects.DataStructure;
import PageObjects.Homepage;
import PageObjects.LoginPage;
import PageObjects.RegisterPage;
import PageObjects.TreePage;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends BaseClass {

	String URL = "https://dsportalapp.herokuapp.com/";
	
	@Before
	public void setup() throws IOException {
		
		/*Properties configprop = new Properties();
		FileInputStream configpropfile = new FileInputStream("C:\\Users\\girij\\eclipse-workspace\\DS-AlgoProject\\src\\test\\resources\\config.properties");
		configprop.load(configpropfile);
		String br = configprop.getProperty("browser");*/
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		/*System.setProperty("webdriver.edge.driver", "C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
		driver = new EdgeDriver();*/
		
		driver.manage().window().maximize();
		//hp = new Homepage(driver);
		hp = new Homepage();
		rp = new RegisterPage();
		lp = new LoginPage();
		ds = new DataStructure();
		tr = new TreePage();
		
	}
	@After
	public void teardown() {
		driver.quit();
		
	}

}
