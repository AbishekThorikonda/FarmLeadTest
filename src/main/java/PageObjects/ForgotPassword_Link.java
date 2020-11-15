package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_Link {
public WebDriver driver;
	
	public ForgotPassword_Link(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By forgot_password =By.xpath("//div[@class='Onboard_take-to-marketplace__3876D' and text()='Forgot your password?']");
	private By pagetitle =By.xpath("//div[@class='RecovPasswdForm_title__7ZdwX' and text()='Trouble Logging in?']");
	private By enter_email =By.xpath("//input[@class='Input_input__bw3sO']");
	private By submit_button =By.xpath("//input[@type='submit' and @value='Submit']");
	
	public WebElement forgotPassword()
	{
		return driver.findElement(forgot_password);
	}
	
	public WebElement pageTitle()
	{
		return driver.findElement(pagetitle);
	}
	
	public WebElement emailAddress()
	{
		return driver.findElement(enter_email);
	}
	
	public WebElement SubmitButton()
	{
		return driver.findElement(submit_button);
	}

}
