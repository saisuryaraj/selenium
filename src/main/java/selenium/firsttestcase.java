package selenium;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
/*
 1. launch browser(chrome)
 2. open url  https://demo.opencart.com/
 3. validate title should be "Your Store"
 4. close browser
 */

public class firsttestcase 
{
	public static void main(String args[])
	{
		//launch browser(chrome)
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
		// open url  https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		// validate title should be "Your Store"
		String act_title = driver.getTitle();	
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// close Browser
		driver.close();
		//driver.quit();
	}
}
