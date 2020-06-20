package StepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;

public class BaseClass {

	public static LoginPage lp;
	public static WebDriver driver;
	public static Properties configprop;

	public static void instialise() throws IOException {
//		FileInputStream file = new FileInputStream("Config.Properties");
//		configprop = new Properties();
//		configprop.load(file);
//		System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
//		driver = new ChromeDriver();
//		lp = new LoginPage(driver);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\CucumberBDD\\drivers\\chromedriver.exe");
	       driver = new ChromeDriver();
		   lp = new LoginPage(driver);
		   
		
		
		
		
		
	}

}
