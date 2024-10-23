package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(1000);
		int rows =driver.findElements(By.xpath("//table[@id='tablepress-1']//tr")).size();
		System.out.println(rows);
		int cols =driver.findElements(By.xpath("//table[@id='tablepress-1']//th")).size();
		System.out.println(cols);
		Thread.sleep(1000);
		
		int n=driver.findElements(By.xpath("//table[@id=\"tablepress-1\"]//tr")).size();
		
		System.out.println(n);
		
		
		for(int r=1;r<=rows;r++)
		{
			
				String customername =driver.findElement(By.xpath("//table[@id='tablepress-1']//tr["+r+"]//td[2]")).getText();
				String email =driver.findElement(By.xpath("//table[@id='tablepress-1']//tr["+r+"]//td[3]")).getText();
				System.out.println(customername+"\t" +email);
				//driver.findElement(By.xpath("//a[@id='tablepress-1_next']")).click();
		}
		driver.close();
	}
}