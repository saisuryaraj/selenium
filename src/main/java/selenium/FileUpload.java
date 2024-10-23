package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//single file upload
	/*	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("1.txt"))
		{
			System.out.println("file uploaded");
		}
		else
		{
			System.out.println("file not uploaded");
		}
		*/
		
		String file1="C:\\1.txt";
		String file2="C:\\2.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int files=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(files==2)
		{
			System.out.println("files uploaded");
		}
		else
		{
			System.out.println("files not uploaded");
		}
		Thread.sleep(3000);
		//validate file names
		if(driver.findElement(By.xpath("//*[@id=\"fileList\"]/li[1]")).getText().equals("1.txt") && driver.findElement(By.xpath("//*[@id=\"fileList\"]/li[2]")).getText().equals("2.txt"))
		{
			System.out.println("file names matching");
		}
	}

}
