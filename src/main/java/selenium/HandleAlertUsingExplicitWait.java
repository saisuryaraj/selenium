package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {
	public static void main(String a[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent()); // to capture the alert
		
	   /* Alert myalert =driver.switchTo().alert();
		Thread.sleep(5000);
		myalert.sendKeys("Welcome");*/
		
		System.out.println(myalert.getText());
		myalert.accept();
	}
}