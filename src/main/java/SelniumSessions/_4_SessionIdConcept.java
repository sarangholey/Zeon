package SelniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_SessionIdConcept {

	public static void main(String[] args) {

		// by this line a session id got created 
		// this id will be available through out the program
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();
		// this line will throw an exception
		// " org.openqa.selenium.NoSuchSessionException
		// as after quitting the driver we cannot perform any 
		// action on driver as driver gets "null"
		System.out.println(driver.getTitle());
	}

}
