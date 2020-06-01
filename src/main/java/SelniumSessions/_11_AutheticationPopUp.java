package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_AutheticationPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String username = "admin";
;
		String password = "admin";
		driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		WebElement msg = driver.findElement(By.xpath("//div[@id='content']//p"));
		
		if(msg.getText().contains("Congratulations"))
		{
			System.out.println("Authentication is successful");
		}
		else {
			System.out.println("Authentication is unsuccessful");
		}
	}
}
