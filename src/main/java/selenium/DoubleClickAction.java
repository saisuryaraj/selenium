package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		
		box1.clear();
		box1.sendKeys("hi");
		
		Thread.sleep(3000);
		
		Actions act =new Actions(driver);
		act.doubleClick(button).perform();
		
		//validation :box2 should contain WELCOME
		
		String text=box2.getAttribute("value");
		
		System.out.println(text);
		
		if(box2.getText().equals("hi"))
		{
			System.out.println("Text copied");
		}
		else 
		{
			System.out.println("Text not copied");
		}
	}
}