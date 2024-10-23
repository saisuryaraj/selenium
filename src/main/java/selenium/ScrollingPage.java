package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll down the page by pixel number
//		js.executeScript("window.scrollBy(0,1000)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll the page till the element is visible
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll page till the end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		//go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}
}