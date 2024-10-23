package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	public static void main(String a[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.normal alert with ok button
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		Alert myalert =driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();*/
		
		// 2. comnfirmation Alert - ok and cancel
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept(); //closing alert using ok\
		driver.switchTo().alert().dismiss();// closing with cancel
		/*Alert confirm =driver.switchTo().alert();
		System.out.println(confirm.getText());
		confirm.dismiss();*/
		
		//3. 
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		Alert myalert =driver.switchTo().alert();
		//Thread.sleep(5000);
		myalert.sendKeys("Welcome");
		
		myalert.accept();
	}
}
