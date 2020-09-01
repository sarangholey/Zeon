package FileDownloadScenario.ChromeFileDownload;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class _1_FileDownloadInChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(System.getProperty("user.dir") + "\\src\\main\\java\\FileDownloadScenario\\ChromeFileDownload\\download");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//String downloadPath = "C:\\Users\\Sarang\\eclipse-workspace\\Zeon\\src\\main\\java\\FileDownloadScenario\\ChromeFileDownload\\download";

		String downloadPath = (System.getProperty("user.dir") + "\\src\\main\\java\\FileDownloadScenario\\ChromeFileDownload\\download");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		options.setExperimentalOption("prefs",chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("ZIP file")).click();
		
		Thread.sleep(5000);
		
		String filePathUpdated = downloadPath+"\\DownloadDemo-master.zip";
		
		File file = new File(filePathUpdated);
		
		//Assert.assertTrue(file.exists());
		
		if(file.exists()) {
			
			file.delete();
			
		}
		

	}

}
