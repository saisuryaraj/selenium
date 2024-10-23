package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDownElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://books-pwakit.appspot.com/");	
		driver.manage().window().maximize();
		
//		String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
//		Thread.sleep(1000);
		
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
		
		//this element is inside single shadow DOM
		SearchContext shadow1 = driver.findElement(By.cssSelector("shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		shadow1.findElement(By.cssSelector("#shadow-element"));
		
		//this element is inside 2 nested shadow DOM
		SearchContext shadow2 = driver.findElement(By.cssSelector("shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow3=shadow2.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow3.findElement(By.cssSelector("#nested-shadow-element"));
		
		//this element is inside 3 nested shadow DOM
		SearchContext shadow4 = driver.findElement(By.cssSelector("shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow5=shadow4.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow6=shadow5.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		shadow6.findElement(By.cssSelector("#multi-nested-shadow-element"));
		
	}
}
