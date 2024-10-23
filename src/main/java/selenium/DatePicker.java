package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	static void selectfuturedate(WebDriver driver,String month, String year,String date)
	{	
		//select month and year
		while(true)
		{
			String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 	String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			//Thread.sleep(2000);
			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List<WebElement> alldates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
	static void selectDate(WebDriver driver,String date)
	{
		//Select the date
				
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//method 1: using sendKeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		
		//method 2: using datepicker
		String year="2025";
		String month="May";
		String date ="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectfuturedate(driver,month,year,date);	
	}
}