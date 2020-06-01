package SelniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15_BrowserWindowHandlesWithList {
		
		static WebDriver driver;

		public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		//driver.findElement(By.linkText("Good PopUp #2")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> listOfHandes = new ArrayList<String>(handles);
		
		String parentWinId = listOfHandes.get(0);
		String childWinId = listOfHandes.get(1);
		
		driver.switchTo().window(childWinId);
		System.out.println("Child window title is - " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWinId);
		
		System.out.println("Parent window title is - " + driver.getTitle());
		
		driver.quit();
		}
		
		// encapsulated private method
		private static List<String> getWindowIdList(WebDriver driver) {
			Set<String> handles = driver.getWindowHandles();
			List<String> listOfHandes = new ArrayList<String>(handles);
			return listOfHandes;
		}
		
		// generic method to get window id
		public static String getWindowId(WebDriver driver, int windowNum)
		{
			List<String> windowList = getWindowIdList(driver);
			return windowList.get(windowNum);
		}
}
