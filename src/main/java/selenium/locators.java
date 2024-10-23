package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators 
{
	public static void main(String a[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//boolean logoDisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
		
		//System.out.println(logoDisplaystatus);
		
		//link text and partial link text
		// https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=57
		//driver.findElement(By.linkText("Tablets")).click(); //most preferable
		//driver.findElement(By.partialLinkText("Table")).click();
		
//		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
//		System.out.println(headerLinks.size());
		
		//tagname
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
	}
}