package SelniumSessions._20_TakeScreeshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class _20_TakeScreenshot {

	static WebDriver driver;
	
	public static void main(String[] args)
	{
		System.out.println("Current directory is - "+System.getProperty("user.dir"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		takescreenshotUtil();
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String destPath = System.getProperty("user.dir")+"/src/main/java/SelniumSessions/_20_TakeScreeshot/"+ System.currentTimeMillis()+".png";
//		File dest = new File(destPath);
//		try {
//			FileUtils.copyFile(src, dest);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public static void takescreenshotUtil()
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destPath = System.getProperty("user.dir")+"/src/main/java/SelniumSessions/_20_TakeScreeshot/"+ System.currentTimeMillis()+".png";
		File dest = new File(destPath);
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

