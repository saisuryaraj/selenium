package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new");//setting for headless mode odexecution
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String act_title = driver.getTitle();
		if(act_title.equals("Automation Testing Practice"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		driver.quit();
		 
	}
}