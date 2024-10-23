package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String a[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drpcountryELE =driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcountry=new Select(drpcountryELE);
		
		//select option from dropdown
		Thread.sleep(1000);
		drpcountry.selectByVisibleText("India");
		drpcountry.selectByValue("india");
		drpcountry.selectByIndex(9);
		
		//capture the options from the dropdown
		List<WebElement>options=drpcountry.getOptions();	
		System.out.println(options.size());
		
		//printing the options
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
		//enhanced for loop
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		driver.close();
	}
}