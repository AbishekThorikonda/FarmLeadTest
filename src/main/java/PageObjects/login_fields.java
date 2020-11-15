package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_fields {
	
	public WebDriver driver;
	
	public login_fields(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='Input_input__3544m' and @type='text']")
	private WebElement user_name;
	
	@FindBy(xpath="//input[@class='Input_input__3544m' and @type='password']")
	private WebElement pass_word;
	
	
	@FindBy(xpath="//input[@type='submit' and @value='Next']")
	private WebElement next_button;
	
	
	//Blank Email Password error message
	//Email account not registered error
	@FindBy(xpath="//div[@class='Input_caption__3AYcS']")
	private WebElement error_text;
	
	
	
	public WebElement username()
	{
		return user_name;
	}
	public WebElement password()
	{
		return pass_word;
	}
    
	public WebElement NextButton()
	{
		return next_button;
	}
	
	public WebElement Email_Error()
	{
		return error_text;
	}
}
