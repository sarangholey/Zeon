package Javasessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _HashMap {
	public static WebDriver driver;
	public static void main(String[] args) {
		// HashMap<String, String> userMap = new HashMap<String, String>();
		// above line can be used also
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Delhi");

		//System.out.println(userMap.get(0));
		// as HashMap is not order biased we cannot access it on the basis of index
		// so by looping like normal for loop we cannot itrate it and get the values of it
		System.out.println(userMap.get("name")); // O/P is Tom
		System.out.println(userMap.size()); // O/P is 3
		System.out.println(userMap); // O/P is {city=Delhi, name=Tom, id=1}

		// to get values from HashMap
		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		// O/P is - city Delhi
		//			name Tom
		//			id 1

		// use case in selenium - 
		// different user on basis of level in hierarchy Username And Password 
		Map<String,String> loginMap = new HashMap<String,String>();
		loginMap.put("admin", "admin_admin");
		loginMap.put("patient", "Harry_test123");
		loginMap.put("doctor", "peter@gmail.com_ABC123");
		driver = new ChromeDriver();
		// login with admin credentials
		driver.findElement(By.id("username")).sendKeys(userMap.get("admin").split("_")[0]);
		driver.findElement(By.id("username")).sendKeys(userMap.get("admin").split("_")[1]);
		// login with admin credentials
		driver.findElement(By.id("username")).sendKeys(userMap.get("patient").split("_")[0]);
		driver.findElement(By.id("username")).sendKeys(userMap.get("patient").split("_")[1]);
		// use of reusable utility instead of use of above lines
		doLogin(driver, userMap, "doctor");
	}
	public static Map<String,String> userMap()
	{
		Map<String,String> loginMap = new HashMap<String,String>();
		loginMap.put("admin", "admin_admin");
		loginMap.put("patient", "Harry_test123");
		loginMap.put("doctor", "peter@gmail.com_ABC123");
		return loginMap;
	}
	public static void doLogin(WebDriver driver, Map<String,String> userMap, String userKey)
	{
		driver.findElement(By.id("username")).sendKeys(userMap.get(userKey).split("_")[0]);
		driver.findElement(By.id("username")).sendKeys(userMap.get(userKey).split("_")[1]);
	}
}
