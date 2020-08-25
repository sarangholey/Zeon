package SelniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22_DatePickerCalender_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("https://phptravels.net/home");
		
		String month = "June,2020";
		String day = "25";
		
		WebElement checkInBox = driver.findElement(By.id("checkin"));
		checkInBox.click();
		
		Thread.sleep(2000);
		
		WebElement currentMonth = driver.findElement(By.xpath("(//nav[@class='datepicker--nav']//div[@class='datepicker--nav-title'])[1]"));
		
		while(true)
		{
			WebElement nextButton = driver.findElement(By.xpath("(//div[@class='datepicker--nav-action' and @data-action='next'])[1]"));
			String currnetMonthText = currentMonth.getText();
			if(currnetMonthText.contains(month))
			{
				break;
			}
			else
			{
				nextButton.click();	
			}
		}
		WebElement dateNumber = driver.findElement(By.xpath("//div[@class='datepicker--cells datepicker--cells-days']//div[@class='datepicker--cell datepicker--cell-day' and @data-date='"+day+"']"));
		dateNumber.click();
		
		

	}

}
