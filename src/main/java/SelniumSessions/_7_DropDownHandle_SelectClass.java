package SelniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _7_DropDownHandle_SelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		WebElement dayfield = driver.findElement(By.id("day"));
		WebElement monthfield = driver.findElement(By.id("month"));
		WebElement yearfield = driver.findElement(By.id("year"));
		
		Select selectDay = new Select(dayfield);
		selectDay.selectByVisibleText("15");
		
		Select selectMonth = new Select(monthfield);
		selectMonth.selectByVisibleText("Mar"); // Preferred always
		//selectMonth.selectByIndex(3);
		//selectMonth.selectByValue("5");
		
		Select selectYear = new Select(yearfield);
		selectYear.selectByVisibleText("1993");
		
		
		// finding the count of values from dropdown
		List<WebElement> daylist =  selectDay.getOptions();
		System.out.println("List containing count of -"+ daylist.size());
		
		// Seleceting value from dropdown with list
		for (int i = 0; i < daylist.size(); i++) {
			String value = daylist.get(i).getText();
			if(value.equals("10"))
			{
				daylist.get(i).click();
			}
		}
		
	}
	
	// overloaded methods
	public static void doSelectValueFromDropDown(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}
	
	public static void doSelectValueFromDropDown(WebElement element, int value)
	{
		Select sel = new Select(element);
		sel.selectByIndex(value);
	}
	
	public void doSelectValueFromDropDown(String value, WebElement element)
	{
		Select selectvalue = new Select(element);
	
		// finding the count of values from dropdown
		List<WebElement> list =  selectvalue.getOptions();
		System.out.println("List containing count of -"+ list.size());
		
		// Seleceting value from dropdown without select class
		for (int i = 0; i < list.size(); i++) {
			String val = list.get(i).getText();
			if(val.equals(value))
			{
				list.get(i).click();
			}
		}
	}
}
