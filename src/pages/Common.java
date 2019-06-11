package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common {
	
	WebDriver driver;
	public Common(WebDriver driver) {
		this.driver = driver;
	} 
	//Signup button locator
	
	By signUpButton = By.cssSelector(".login-link.s-btn.s-btn__primary.py8.btn-topbar-primary");
	
	//methods
	public void navigateToSignUp() {
		System.out.println("I am in Common");
		driver.findElement(signUpButton).click();
	}
	
	//signup button action method
}
