package selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CitBankCal {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		driver.manage().window().maximize();
		
		
		String filePath= "D:\\Eclipse\\workspace\\selenium\\testdata\\citbank.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		for(int i=1;i<=2;i++)
		{
			String pric = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String length = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String rateofinterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String compound = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			
			
			WebElement deposit = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			deposit.clear();
			deposit.sendKeys(pric);
			
			WebElement period= driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			period.clear();
			period.sendKeys(length);
			
			WebElement interest = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			interest.clear();
			interest.sendKeys(rateofinterest);
			
			// Click on the dropdown to open the list of options
			driver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();

			// Wait for the dropdown options to be visible and then select the desired option
			driver.findElement(By.xpath("//mat-option//span[contains(text(),'" + compound + "')]")).click();
			
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			String act_mvalue =driver.findElement(By.xpath("//span[@id='displayTotalValue'][1]")).getText();
			
			
			if(act_mvalue == exp_mvalue)
			{	
				
				System.out.println("TestPased");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 6, "TestPased");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 6);
			}
			else {
				
				System.out.println("Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 6, "Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 6);
			}
			Thread.sleep(3000);
			driver.navigate().refresh();
		}	
		driver.quit();
	}
}
