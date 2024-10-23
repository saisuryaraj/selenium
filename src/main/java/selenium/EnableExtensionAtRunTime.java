package selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRunTime {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		
		File file = new File("");
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com");
		
	}
}
