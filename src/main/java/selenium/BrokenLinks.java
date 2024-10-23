package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");	
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int noOfBrokenLinks=0;
		
		for(WebElement linkElement:links)
		{
			String hrefatt =linkElement.getAttribute("href");
			if(hrefatt == null || hrefatt.isEmpty())
			{
				System.out.println("empty");
				continue;
			}
			//hit url to server
			try
			{
				URL linkurl = new URL(hrefatt);
			
				HttpURLConnection conn= (HttpURLConnection)linkurl.openConnection();//opens the connection to the server
				conn.connect();	//connect to thr server and send the request	
			
				if(conn.getResponseCode() >=400)
				{
					System.out.println(hrefatt + "Broken");
					noOfBrokenLinks++;
				}
				else
				{
					System.out.println(hrefatt + "not a broken");
				}
			}
			catch(Exception e)
			{	
			}
			System.out.println(noOfBrokenLinks);
		}
	}
}