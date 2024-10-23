package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		WebElement rome =driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy =driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome,italy).perform();
		
	}

}