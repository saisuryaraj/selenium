package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String a[]) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		//get(url)-opens url in the broswer
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//gettitle-return title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl - returns the url of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPAgeSource - returns the source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle()- returns ID of the single Broswer Window
//		String windowid = driver.getWindowHandle();
//		System.out.println("windowid = "+ windowid);
		
		//getWindowHandles()-returns ID's of the multiple Broswer Windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles();
		System.out.println("windowids = "+ windowids);
	
	}
}
