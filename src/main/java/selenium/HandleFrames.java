package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleFrames {
	public static void main(String a[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Thread.sleep(5000);
		
		/*WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		*/
		WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("form");
		Thread.sleep(3000);
		// inner frame
		//driver.switchTo().frame(0); // switching to frame using index
		WebElement framei= driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(framei);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='i8']")).click();
		Thread.sleep(1000);
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='eBFwI' and @role='listitem']"));

//		for(int i =0;i<=checkboxes.size();i++)
//			{
//				checkboxes.get(i).click();
//			}
//		
			for(WebElement checkbox:checkboxes)
			{
				checkbox.click();
			}
			
			Thread.sleep(3000);
		/*
		//driver.findElement(By.xpath("//div[@jscontroller='liFoG']")).click();
		//driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf OIC90c LMgvRb KKjvXb']")).click();
		//driver.findElement(By.xpath("//div[@data-value='Yes' and @role='option']")).click();
		driver.findElement(By.xpath("//div[@jsname=\"d9BH4c\" and @class=\"ry3kXd\"]")).click();
		WebElement drpchooseELE =driver.findElement(By.xpath("//div[@jsname='wQNmvb']"));
		Select drpchoose=new Select(drpchooseELE);
		//drpchoose.selectByVisibleText("Yes");
		drpchoose.selectByIndex(1);
		*/
		//WebElement yes = driver.findElement(By.xpath("//*[text()='Yes']"));
		/*WebElement yes = driver.findElement(By.xpath("//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Yes']"));
		
		Actions actions = new Actions(driver);
		actions.click(yes).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		*/
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[1]/div[1]/div[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Yes']")).click();
	}
}

//frame[src='frame_1.html']
//frame[@src='frame_2.html']