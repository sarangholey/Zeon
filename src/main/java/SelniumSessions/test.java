package SelniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	
	@Test
	public void autoSuggestion() throws InterruptedException
	{
		_2_CrossBrowser_Locators ref = new _2_CrossBrowser_Locators();
		WebDriver driver = ref.initDriver("chrome");
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(1000);
		searchBox.sendKeys("samsung");
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@id='suggestions']/div"));
		wait.until(ExpectedConditions.visibilityOfAllElements(suggestionList));
		for (int i = 0; i < suggestionList.size(); i++) {
			System.out.println(suggestionList.get(i).getText());
		}
		for (int i = 0; i < suggestionList.size(); i++) {
			String listEle = suggestionList.get(i).getText().toLowerCase();
			if(listEle.contains("dell"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(false);
			}
		}
		
		driver.quit();
	}

}
