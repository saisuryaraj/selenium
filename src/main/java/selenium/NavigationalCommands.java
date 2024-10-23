package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;

public class NavigationalCommands {
	public static void main(String a[]) throws MalformedURLException
	{
		WebDriver driver =new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/");//accepts url only in string format
		
		driver.navigate().to("https://demo.nopcommerce.com/");//accepts url only in string format and also in URL object format
		//navigate to internally calls get method
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	 	URL myurl = new URL("https://demo.nopcommerce.com/");
//		driver.navigate().to(myurl);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
	}
}
 