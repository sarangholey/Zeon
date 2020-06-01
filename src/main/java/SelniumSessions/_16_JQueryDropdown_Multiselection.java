package SelniumSessions;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.InstrumentedType.Frozen;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class _16_JQueryDropdown_Multiselection {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	driver.findElement(By.id("justAnInputBox")).click();
	selectChoiceValue(driver, "choice 1");
	selectChoiceValue(driver, "choice 2 3");
	selectChoiceValue(driver, "choice 1" , "choice 2 3");
	// for selecting all values
	selectChoiceValue(driver, "all");
	}
	
	// for single selection
	public static void selectChoiceValue(WebDriver driver, String value)
	{
		List<WebElement> choiceList = 
				driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			if(text.equals(value))
			{
				choiceList.get(i).click();
				break;
			}
		}
	}
	
	// for multi value selection
	public static void selectChoiceValue(WebDriver driver, String... value)
	{
		List<WebElement> choiceList = 
				driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("ALL"))
		{
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				for (int j = 0; j < value.length; j++) {
					if(text.equals(value[j]))
					{
						choiceList.get(i).click();
						break;
					}
				}
			}
		}
		else
		{
			// as it will throw ElementNotIntractable exception as this list holding some hidden values
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}