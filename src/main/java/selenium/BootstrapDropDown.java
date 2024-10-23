package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
	public static void main(String a[]) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	//driver.manage().window().maximize();
	
	//select single option
	driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	
	//capture all the options
	//driver.findElement(By.xpath("//input[@value='Java']")).click();
	List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	/*
	//printing from dropdown
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}*/
	
	// select multiple options
		for(WebElement op:options)
		{
			if(op.getText().equals("Java") || op.getText().equals("Python")  || op.getText().equals("MySQL")) 
			{
				op.click();
			}
		}
	}
}
