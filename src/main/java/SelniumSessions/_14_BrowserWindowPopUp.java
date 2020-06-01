package SelniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _14_BrowserWindowPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		String childWindowID1 = it.next();
		String childWindowID2 = it.next();

		driver.switchTo().window(childWindowID1);

		System.out.println("Child1 window title is - " + driver.getTitle());
		System.out.println("Child1 window id is - " + childWindowID1);
		driver.close();

		driver.switchTo().window(childWindowID2);

		System.out.println("Child2 window title is - " + driver.getTitle());
		System.out.println("Child2 window id is - " + childWindowID2);
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);

		System.out.println("Parent window title is - " + driver.getTitle());
		System.out.println("Parent window id is - " + parentWindowId);
		
		driver.quit();
	}
}
