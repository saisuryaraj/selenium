package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		WebElement resources = driver.findElement(By.xpath("//a[normalize-space()='Resources']"));
		WebElement bootcamp = driver.findElement(By.xpath("//a[normalize-space()='BootCamp']"));
		
		Actions act = new Actions(driver);
		
		//mouse hover action
		//act.moveToElement(resources).moveToElement(bootcamp).click().build().perform();
		act.moveToElement(resources).moveToElement(bootcamp).perform();

	}

}
