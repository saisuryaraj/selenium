package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String a[]) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/* applicable for every statement in the code
		   till we close the driver implicitlywait is on 
		   maximum of 10 sec */
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		}
}