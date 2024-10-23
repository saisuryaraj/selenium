package selenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {
	public static void main(String a[])
	{
		WebDriver driver =new ChromeDriver();
		
		Wait<WebDriver> mywait =new FluentWait<WebDriver>(driver)//declaration
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement textusername = mywait.until(new Function<WebDriver, WebElement>() {//usuage
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		     }
		   });
		textusername.sendKeys("Admin");
		
	}
}
		/*WebElement txtusername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
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
	
*/


/*
  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
       .withTimeout(Duration.ofSeconds(time))
       .pollingEvery(Duration.ofSeconds(time))
       .ignoring(NoSuchElementException.class);

   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
     public WebElement apply(WebDriver driver) {
       return driver.findElement(By.id("foo"));
     }
   });
 */
