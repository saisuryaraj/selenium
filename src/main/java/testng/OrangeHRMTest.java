package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * open the application
 * test logo presencde
 * login
 * close
 * */

public class OrangeHRMTest {
	WebDriver driver;
	@Test(priority=1)
	void openapp() 
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=2)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();	
		System.out.println(status);
	}
	@Test(priority=3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority=4)
	void logout() 
	{
		driver.quit();
	}

}