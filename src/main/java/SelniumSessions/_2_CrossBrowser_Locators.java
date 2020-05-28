package SelniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class _2_CrossBrowser_Locators {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		_2_CrossBrowser_Locators objRef = new _2_CrossBrowser_Locators();
		driver = objRef.initDriver("edge");
		driver.get("https://www.google.com");
		driver.quit();
	}
	
	public WebDriver initDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("opera")) {
			driver = new OperaDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Entered browser "+ browserName +" cannot br launched");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
}
