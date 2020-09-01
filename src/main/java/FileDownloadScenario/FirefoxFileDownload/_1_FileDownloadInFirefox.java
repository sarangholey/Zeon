package FileDownloadScenario.FirefoxFileDownload;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;

public class _1_FileDownloadInFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println(System.getProperty("user.dir") + "\\src\\main\\java\\FileDownloadScenario\\FirefoxFileDownload\\download");
		
		FirefoxOptions options = new FirefoxOptions();	
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("browser.download.folderList",2);
		String downloadFilePath = (System.getProperty("user.dir") + "\\src\\main\\java\\FileDownloadScenario\\FirefoxFileDownload\\download");
		profile.setPreference("browser.download.dir",downloadFilePath);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		options.setProfile(profile);
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();
		
//		File downloadedFile = new File(downloadFilePath+"\\DownloadDemo-master.zip");
//		
//		Thread.sleep(5000);
//		
//		Assert.assertTrue(downloadedFile.exists());		
//		
//		downloadedFile.delete();
		
		driver.close();
	}

}
