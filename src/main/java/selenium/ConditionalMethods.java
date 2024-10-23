package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String a[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		//driver.manage().window().maximize();
		
//		WebElement logo =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		
//		logo.isDisplayed();
//		System.out.println(logo.isDisplayed());//we can check the display status of the element
		
//		boolean status =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//		System.out.println(status);
		
//		boolean status =driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled(); //we can check enable/or disable status of element/operational element
//		System.out.println(status);
		
		WebElement male = driver.findElement(By.xpath("//*[@id='gender-male']")); // to check the element is selected or not 
		System.out.println(male.isSelected());//before selected
		
		male.click();
		System.out.println(male.isSelected());//after selected
		
		
		driver.close();
		
	}
}
