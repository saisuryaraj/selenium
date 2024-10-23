package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
	public static void main(String a[])
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();//maximize the browser window
		//driver.close();
		
		/*   tag#id */
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("phone");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("phone");
		
		/* tag.classname */
		
		//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("phone");
		
		/* tag[attribute="value"] */
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("phone");
		
		/*tag.classname[attribute="value"]*/
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("phone");
	}
}
