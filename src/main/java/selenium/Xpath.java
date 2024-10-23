package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String a[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.opencart.com/");
        Thread.sleep(10000);
		//driver.manage().window().maximize();
		
		//with single attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iPhone");
		
		//with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("phone");
		
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("phone");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("phone");
		
		/* xpath with inner text */
		//WebElement ele = driver.findElement(By.xpath("(//*[@id='content']//child::h4)[1]"));

		//driver.findElement(By.xpath("//input[@title='MacBook']")).click();
		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
//		Actions actions = new Actions(driver);
//		actions.moveToElement(ele).build().perform();
//		actions.click(ele).build().perform();
		
//		boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//		System.out.println(displaystatus);
//		
//		String value = driver.findElement(By.xpath("//*h3[text()='Featured']")).getText();
//		System.out.println(value);
		
		//driver.findElement(By.xpath("//*input[contains@placeholder,'sea']")).sendKeys("phone");
		
		//driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Search')]")).sendKeys("phone");
        
        
        //chained xpath
//        boolean status =driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
//        System.out.println(status);
        
    }
}
