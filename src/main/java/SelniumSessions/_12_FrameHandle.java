package SelniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12_FrameHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		// check no of frames from the page
		List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		System.out.println("Frame available on page - "+frameList.size());
		if(frameList.size()>=1)
		{
			WebElement fameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(fameEle);
			
			WebElement ele = driver.findElement(By.xpath("//div[@id='draggable']/p"));
			System.out.println(ele.getText());
			
		}
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='demo-list']//h2"));
		System.out.println(ele.getText());
	}

}
