package Hooks;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import PageObjects.Arraypage;
import PageObjects.DataStructure;
import PageObjects.Homepage;
import PageObjects.LoginPage;
import PageObjects.RegisterPage;
import PageObjects.TreePage;
import PageObjects.linkedlistpage;
import PageObjects.Queuepage;
import Utilities.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends BaseClass {

	String URL = "https://dsportalapp.herokuapp.com/";
	
	@Before
	public void setup() throws IOException {
		
		Properties configprop = new Properties();
		FileInputStream configpropfile = new FileInputStream("C:\\Users\\girij\\eclipse-workspace\\DS-AlgoProject\\src\\test\\resources\\config.properties");
		configprop.load(configpropfile);
		String br = configprop.getProperty("browser");
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		
		
		if(br.equals("chrome")) {
			
			//ChromeOptions chromeoptions = new ChromeOptions();
			//chromeoptions.addArguments("start-maximized");
			//chromeoptions.addArguments("headless");
			//driver = new ChromeDriver(chromeoptions);
			driver = new ChromeDriver();
		} else if(br.equals("firefox")) {
			
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.addArguments("start-maximized");
			//firefoxoptions.addArguments("headless");
			driver = new FirefoxDriver(firefoxoptions);			
		} else if(br.equals("edge")) {
			
			EdgeOptions edgeoptions = new EdgeOptions();
			edgeoptions.addArguments("start-maximized");
			//edgeoptions.addArguments("headless");
			driver = new EdgeDriver(edgeoptions);
		}

		
		//driver.manage().window().maximize();
		//hp = new Homepage(driver);
		hp = new Homepage();
		rp = new RegisterPage();
		lp = new LoginPage();
		ds = new DataStructure();
		tr = new TreePage();
		Ap = new Arraypage();
		linkedlistpage linkedlist = new linkedlistpage();
		qu = new Queuepage();
		
	}
	@After
	public void teardown() {
		driver.quit();
		
	}

}
