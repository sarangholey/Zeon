package SelniumSessions._18_DataProviderTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _18_TestNg_DataProvider {

	WebDriver driver = null;
	public static final String urlName = "https://www.seleniumeasy.com/test/input-form-demo.html";
	@Parameters({"url","browsername"})
	@BeforeMethod
	public void setUp(@Optional(urlName) String url, @Optional ("chrome") String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(url);
		} 

		
	}
	
	@Test(dataProvider = "getUserData")
	public void loginHubSpot(String fName,String lName,String emailID,String phoneNum,String cAddress)
	{
		WebElement firstNameBox = driver.findElement(By.name("first_name"));
		WebElement lastNameBox = driver.findElement(By.name("last_name"));
		WebElement emailBox = driver.findElement(By.name("email"));
		WebElement phoneNumberBox = driver.findElement(By.name("phone"));
		WebElement addressBox = driver.findElement(By.name("address"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		firstNameBox.sendKeys(fName);
		lastNameBox.sendKeys(lName);
		emailBox.sendKeys(emailID);
		phoneNumberBox.sendKeys(phoneNum);
		addressBox.sendKeys(cAddress);
		submitButton.click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@DataProvider(name = "getUserData")
	public Object[][] userData()
	{
		Object userinfo[][] = new Object[3][5]; 
		userinfo[0][0] = "Tom";
		userinfo[0][1] = "Peter";
		userinfo[0][2] = "tompeter@gmail.com";
		userinfo[0][3] = "45678945";
		userinfo[0][4] = "22,east streen,new york";	
		
		userinfo[1][0] = "Harry";
		userinfo[1][1] = "Desuza";
		userinfo[1][2] = "harrydesuza@gmail.com";
		userinfo[1][3] = "46578915";
		userinfo[1][4] = "22,West streen,new gercy";	
		
		userinfo[2][0] = "John";
		userinfo[2][1] = "Smith";
		userinfo[2][2] = "johnsmith@gmail.com";
		userinfo[2][3] = "12345678";
		userinfo[2][4] = "22,Nort streen, london";	
		return userinfo;
	}
	
}
