package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_JavaScriptPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement signInButton = driver.findElement(By.name("proceed"));
		signInButton.click();
		
		Alert al = driver.switchTo().alert();
		
		String alerttext = al.getText();
		if(alerttext.equals("Please enter a valid user name"))
		{
			System.out.println("Alert is correct");
		}
		else {
			System.out.println("Alert is incorrect");
		}
		
		al.accept();
	}
}
