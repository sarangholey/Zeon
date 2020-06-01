package SelniumSessions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class _9_HeadlessBrowser {
	static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		options.addArguments("--incognito");
		options.addArguments("--disable-infobars");
		//options.addExtensions(new File("C:\\Users\\Sarang\\eclipse-workspace\\Zeon\\AddBlockerPlusExtension_4_12_0_0.crx"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
