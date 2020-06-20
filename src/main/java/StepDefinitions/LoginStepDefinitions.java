package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends BaseClass {

	@Given("i open the chrome broswer")
	public void i_open_the_chrome_broswer() throws IOException {

		BaseClass.instialise();
	}

   @When("enter the url as {string}")
	public void enter_the_url_as(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Then("enter the username as {string} and password as {string}")
	public void enter_the_username_as_and_password_as(String email, String pwd) throws InterruptedException {
		lp.userName(email);

		lp.password(pwd);
	}

	@And("Click on login button")
	public void click_on_login_button() {
		lp.clickOnLogin();
	}

	 @Then("Click on logout button and close the browser")
	public void close_the_browser() throws InterruptedException {
	 lp.clickOnLogout();
	 Thread.sleep(1000);
	 driver.quit();
	}

}
