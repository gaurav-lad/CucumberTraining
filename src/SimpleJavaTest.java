import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SimpleJavaTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/");
		String landingPageURL = driver.getCurrentUrl();
		String landingPageTitle = driver.getTitle();
		String landingPageMatter = driver.findElement(By.cssSelector("body > div.old-hero.z-base > div > div.fl-shrink2 > h1")).getText();
		System.out.println("landingPageURL: " + landingPageURL + " landingPageTitle: " +landingPageTitle + "landingPageMatter: " + landingPageMatter);
		//singUp Button
		driver.findElement(By.cssSelector(".login-link.s-btn.s-btn__primary.py8.btn-topbar-primary")).click();
		String signUpPageURL = driver.getCurrentUrl();
		String signUpPageTitle = driver.getTitle();
		String signUpPageMatter = driver.findElement(By.cssSelector("#content > div > div.wmx4.ta-center.fs-title.mx-auto.mb24")).getText();
		System.out.println("signUpPageURL: " + signUpPageURL + " signUpPageTitle: " +signUpPageTitle + "signUpPageMatter: " + signUpPageMatter);
		driver.findElement(By.cssSelector("#display-name")).sendKeys("Gaurav");
		driver.findElement(By.cssSelector("#email")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Password@123");
		driver.close();	
	}
}