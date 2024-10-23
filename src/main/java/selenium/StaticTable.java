package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String a[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find no of rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rows);
		
		int cols =driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		//int cols = driver.findElements(By.tagName("th")).size();
		System.out.println(cols);
		
		//read data from specific row and column
		String ind=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		
		//System.out.println(ind.getText());
//		for(int r =2;r<=rows;r++)
//		{
//			for(int c=1;c<=cols;c++)
//			{
//				String data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				//Thread.sleep(1000);
//				System.out.print(data+"\t"+"\t");
//			}
//			System.out.println();
//		}
		
		// print books whose author name is mukesh
		
//		for(int r =2;r<=rows;r++)
//		{
//			String authername=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//			if(authername.equals("Mukesh"))
//			{
//				
//				String bookname =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();	
//				System.out.println(bookname);
//			}
//		}
		
		//find cost of books
		int total =0;
		for(int r =2;r<=rows;r++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				
				total =total+Integer.parseInt(price);
				
			}
		System.out.println(total);
	}
}