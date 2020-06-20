package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.BaseClass;

public class AddCustomer {

WebDriver driver;
	
	public AddCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public @FindBy(xpath="//li[@class='treeview active current-active-item menu-open']//i[@class='fa fa-angle-left pull-right']") WebElement ClickOnCustomer;
	
	
	public @FindBy(xpath="//li[@class='treeview active current-active-item menu-open']//i[@class='fa fa-angle-left pull-right']") WebElement CustomerRadioButton;
	
	public @FindBy(xpath="//a[@class='btn bg-blue']") WebElement ClickOnAddNew;
	
	
	
	
}
