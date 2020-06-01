package SelniumSessions;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Position.Bias;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_LocatorStatagy {
    
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
//		WebElement usernameField = driver.findElement(By.id("username"));
//		usernameField.sendKeys("tom@gmail.com");
//		
//		driver.findElement(By.id("password")).sendKeys("ABC@123");
//		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ABC@123");
//		//driver.findElement(By.cssSelector("#password")).sendKeys("ABC@123");
//		//driver.findElement(By.className("login-password")).sendKeys("ABC@123");
//		
//		driver.findElement(By.linkText("Forgot my password")).click();
//		//driver.findElement(By.partialLinkText("Forgot")).click();

		By usernameFld = By.id("username");
		By passwordFld = By.id("password");
		By forgotPassLink = By.linkText("Forgot my password");
		
		_5_LocatorStatagy ref = new _5_LocatorStatagy();
		ref.getElement(usernameFld).sendKeys("Peter@gmail.com");
		ref.getElement(passwordFld).sendKeys("Peter@gmail.com");
		ref.getElement(forgotPassLink).click();
	}
	
	// utility to get the WebElement
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	

}
