package selenium;

import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class New {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Duration d =driver.manage().timeouts().getImplicitWaitTimeout();
//		System.out.println(d.getSeconds());

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@id='deletesuccess']"))));
//		
//		System.out.println(driver.findElement(By.xpath("//div[@id='deletesuccess']")).isDisplayed());
//		
//		driver.findElement(By.xpath("//input[@id='alert2']")).click();
		
//		WebElement ele = driver.findElement(By.xpath("//*[@id='email']"));
		
//		WebElement ele1=FluentWait.until(new Function<WebDriver,WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("foo"));
//			}
//			
//		});
 
		
		
//		List lst= new ArrayList<Class>();
//		lst.add(NoSuchAlgorithmException.class);
//		lst.add(NoSuchElementException.class);
//		
//		
//		 Wait<WebDriver> wait =
//			        new FluentWait<>(driver)
//			            .withTimeout(Duration.ofSeconds(2))
//			            .pollingEvery(Duration.ofMillis(300))
//			            .ignoreAll(lst);
			            
//			           
//
//		WebElement ele=wait.until(new Function<WebDriver,WebElement>(){
//			public java.lang.String  String (WebDriver ele) {
//				return driver.findElement(By.xpath("//div[@id='deletesuccess']")).getText();
//			}
//			
//		});
 


		//driver.close();

	}

}
