package Cucumber.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("Maximise the Browser")
	public void maxTheBrowser() {
		driver.manage().window().maximize();
	}
	@And("Set the Implicit Timeouts")
	public void setTheTimeouts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Load the Leaftaps URL")
	public void loadTheURL() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("Enter the Username as (.*)")
	public void enterUsername(String userName) {
	driver.findElementById("username").sendKeys(userName);
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String password) {
		 driver.findElementById("password").sendKeys(password);
	}
	@When("Click on the Login Button")
	public void clickLogin() {
		 driver.findElementByClassName("decorativeSubmit").click();
		 	}
	@Then("Verify Login Successful")
	public void verifySuccess() {
		 System.out.println("Login Success");
		 driver.close();

	}
	@But("Verify the Error Message")
	public void verifyFailure() {
		 System.out.println("Login Failure");
		 driver.close();
	}
	
	
	
	
}
