package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerMethods {
	public static void main(String a[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
		
		//driver.close();//closes only parent window
		driver.quit();//closes all the windows
	}
}
