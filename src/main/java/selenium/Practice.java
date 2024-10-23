package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys("3000");
		String filePath= System.getProperty(("user.dir")+"\\testdata\\caldata.xlsx");
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
	}

}
