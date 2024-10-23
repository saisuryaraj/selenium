package testng;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;
	//constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//mandatory
	}
	//Locators 
	/*
	By txt_username_loc= By.xpath("//input[@placeholder='Username']");
	By txt_password_loc= By.xpath("//input[@placeholder='Password']") ;
	By btn_login_loc= By.xpath("//button[normalize-space()='Login']") ;
	*/
	//@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username_loc;
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']") WebElement txt_username_loc;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password_loc;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login_loc;
	
	@FindBy(tagName="a")
	List<WebElement> links;
	
	//Action methods
	/*
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	public void setPassword(String pwd)
	{
		driver.findElement(txt_username_loc).sendKeys(pwd);
	}
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();;
	}
	*/
	public void setUserName(String user)
	{
		txt_username_loc.sendKeys(user);
	}
	public void setPassword(String pwd)
	{
		txt_username_loc.sendKeys(pwd);
	}
	public void clickLogin()
	{
		btn_login_loc.click();;
	}
}
