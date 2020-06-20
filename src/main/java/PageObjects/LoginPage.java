package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.BaseClass;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Webelements
	
	public @FindBy(id="Email")   WebElement Email;
	
	public @FindBy(id="Password") WebElement Password; 
	
	public @FindBy(xpath = "//input[@value='Log in']") WebElement LoginButton;
	
	public @FindBy(xpath = "//a[text()='Logout']") WebElement Logout;
	
	
	
	//Actions
	
	public void userName(String username) throws InterruptedException {
		Email.clear();
		Thread.sleep(1000);
		Email.sendKeys(username);
	}
	
	public void password(String password) throws InterruptedException {
		Password.clear();
		Thread.sleep(1000);
		Password.sendKeys(password);
	}
	
	
	public void clickOnLogin() {
		LoginButton.click();
	}
	
	public void clickOnLogout() {
		Logout.click();
	}
	
	
	
	
	
	
	
	
}
