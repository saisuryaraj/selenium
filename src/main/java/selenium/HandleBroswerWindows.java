package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBroswerWindows {
public static void main(String a[]) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	
	//get(url)-opens url in the broswer
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	
	Set<String> WindowIDs = driver.getWindowHandles();
	
	/*List<String> WindowList =new ArrayList(WindowIDs);
	String parentID=WindowList.get(0);
	String childID = WindowList.get(1);
	
	driver.switchTo().window(childID);
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(parentID);
	System.out.println(driver.getTitle());*/
	
	for(String winID:WindowIDs)
	{
		String title = driver.switchTo().window(winID).getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println(driver.getCurrentUrl());
			//some validation on the parent window
		}
		
	}
	}
}
