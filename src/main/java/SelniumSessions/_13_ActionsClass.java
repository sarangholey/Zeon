package SelniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _13_ActionsClass {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement fameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(fameEle);
		
		WebElement dragBox = driver.findElement(By.id("draggable"));
		WebElement dropBox = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(dragBox).moveToElement(dropBox).release().build().perform();
		//act.dragAndDrop(dragBox, dropBox).build().perform();
		
		driver.get("https://app.hubspot.com");
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		
		act.sendKeys(usernameField,"Tom@gmail.com").build().perform();
		act.sendKeys(passwordField,"123@!@#").build().perform();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightClickBtn).build().perform();
		List<WebElement> rightClickOptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		for (int i = 0; i < rightClickOptions.size(); i++) {
			System.out.println(rightClickOptions.get(i).getText());
			
		}
		
	}
	
	public static ArrayList<String> getOptionsFromList(WebDriver driver, By locator)
	{
		ArrayList<String> arrList = new ArrayList<String>();
		List<WebElement> list = driver.findElements(locator);
		for (int i = 0; i < list.size(); i++) {
			arrList.add(list.get(i).getText());
		}
		
		return arrList;
	}
}
