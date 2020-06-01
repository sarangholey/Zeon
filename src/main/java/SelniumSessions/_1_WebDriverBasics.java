package SelniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class _1_WebDriverBasics {

	public static void main(String[] args) {

		// setting up the environment variable of chrome driver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		// by topcasting created object of chrome driver class 
		// this will open the browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new OperaDriver();
		
		// setting up browser properties
		// maximize the browser
		driver.manage().window().maximize();
		// deleting all cookies
		driver.manage().deleteAllCookies();
	
		// opening the URL
		driver.get("https://www.google.com");
		
		// checking the title of the page opened
		String pageTitle = driver.getTitle();
		
		// printing the title on console
		System.out.println(pageTitle);
		
		// validating the title with expected title
		if(pageTitle.equals("Google"))
		{
			System.out.println("Page title is correct");
		}
		else {
			System.out.println("Page title is incorrect");
		}
		
		// printing current url
		System.out.println("Current page URL is  "+driver.getCurrentUrl());
		
		//closing the browser
		driver.quit();

	}

}
