package SelniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8_DropdownHandleWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		List<WebElement> optionList = driver.findElements(By.xpath("//select[@id='day']/options"));
		System.out.println("Dropdown containg all values as -" + optionList.size());

		for (int i = 0; i < optionList.size(); i++) {

			String val = optionList.get(i).getText();
			if (val.equals("15")) {
				optionList.get(i).click();
			}
		}
		
		By day = By.xpath("//select[@id='day']/options");
		ArrayList<String> days = getDropDownValues(driver, day);
		System.out.println(days);

	}
	
	public static ArrayList<String> getDropDownValues(WebDriver driver, By locator)
	{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> optionList = driver.findElements(locator);
		
		for (int i = 0; i < optionList.size(); i++) {
			String val = optionList.get(i).getText();
			ar.add(val);
		}
		return ar;
	}
	

}
