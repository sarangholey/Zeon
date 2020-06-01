package SelniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_TagName_FindAllLinks {
	
	static WebDriver driver;
		
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		// finding all links text on a webpage
//		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
//
//		int totalLinkCount = listOfLinks.size();
//		System.out.println("Total link count is - "+totalLinkCount);
//		
//		for (int i = 0; i < totalLinkCount; i++) 
//		{
//			String linkText = listOfLinks.get(i).getText();
//			//System.out.println(i+1 + " -> "+linkText);
//			if(!listOfLinks.isEmpty())
//			{
//				System.out.println(i+1 + " -> "+linkText);
//			}
//			
//		}
		
		// Finding and printing all the links on webpage
		List<WebElement> listOfLinks1 = driver.findElements(By.tagName("a"));
		for (int i = 0; i < listOfLinks1.size(); i++) {
			System.out.println(i+1+" -> "+listOfLinks1.get(i).getAttribute("href"));
		}		
	}

}
