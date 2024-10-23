package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String a[])
	{
		WebDriver driver =new ChromeDriver();
		/*
		 * 1. We need to create a new object WebDriverWait */
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername.sendKeys("Admin");
		
		WebElement txtpassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtpassword.sendKeys("admin123");
		
		WebElement txtsubmit =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
		txtsubmit.click();
		
		WebElement txtprofile =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='oxd-userdropdown-img']")));
		txtprofile.click();
		
		WebElement txtlogout =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
		boolean status = false;
		if(txtlogout.isDisplayed()) {
			txtlogout.click();
			status = true;
		}
		
		System.out.println(status);
		//driver.findElement(By.xpath("//input[@placeholder='Username']\")).sendKeys(\"Admin")).sendKeys("Admin");
		//driver.close();
	}
}
