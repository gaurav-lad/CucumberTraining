package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Common;
import pages.SignUpPage;
import pages.StackOverflowLandingPage;

public class signUpSteps {

	WebDriver driver;
	SignUpPage signup;
	StackOverflowLandingPage stackpage;
	Common common;
	
	@Given("^I am on StackOverFlow page$")
	public void i_am_on_StackOverFlow_page() throws Throwable {
		System.out.println("Given");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^I navigate to SignUp$")
	public void i_navigate_to_SignUp() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When");
		common = new Common(driver);
		common.navigateToSignUp();
		//driver.findElement(By.cssSelector(".login-link.s-btn.s-btn__primary.py8.btn-topbar-primary")).click();
	}
	
	//I am in Regression
	@When("^I am in Regression$")
	public void i_am_in_Regression() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("in @Regression Tag");
	}
	
	@When("^I provide signUp$")
	public void i_provide_signUp() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("And When");
		System.out.println("@SmokeTest");
		driver.findElement(By.cssSelector("#display-name")).sendKeys("Gaurav");
		driver.findElement(By.cssSelector("#email")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("abc");
	}

	@Then("^I should get some message$")
	public void i_should_get_some_message() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
		String message = driver.findElement(By.cssSelector("#content > div > div.wmx4.ta-center.fs-title.mx-auto.mb24")).getText();
		System.out.println("Message: "+message);
	}

	@Then("^I should get some message in AskQuestions$")
	public void i_should_get_some_message_in_AskQuestion() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then in Ask Questions");
		String message = driver.findElement(By.cssSelector("#content > div > div.wmx4.ta-center.fs-title.mx-auto.mb24")).getText();
		System.out.println("Message: "+message);
	}
	
	@When("^I provide signUp details as \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void i_provide_signUp_details_as_and_and(String displayName, String email, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("And When");
		System.out.println("params: " + displayName+" "+email+" "+password);
		driver.findElement(By.cssSelector("#display-name")).sendKeys(displayName);
		driver.findElement(By.cssSelector("#email")).sendKeys(email);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
	}
}
