package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_Account {
	public WebDriver driver;
	
	public create_Account(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Create an Account')]")
	private WebElement  create_account_link;
	
	@FindBy(xpath="//fieldset[@class='Input_border__1URNC']/legend[text()='First Name']/following-sibling::div/input")
	private WebElement first_name;
	
	
	@FindBy(xpath="//fieldset[@class='Input_border__1URNC']/legend[text()='Last Name']/following-sibling::div/input")
	private WebElement last_name;

	
	@FindBy(xpath="//fieldset[@class='Input_border__1URNC']/legend[text()='Email Address']/following-sibling::div/input")
	private WebElement email_address;
	

	@FindBy(xpath="//input[@type='submit' and @value='Next']")
	private WebElement next_btn;
	
	
	@FindBy(xpath="//div[@class='Input_caption__3AYcS']")
	private WebElement error_Message;
	
	
public WebElement createAccountLink()
{
	return create_account_link;
}

public WebElement FirstName()
{
	return first_name;
}

public WebElement LastName()
{
	return last_name;
}

public WebElement Email()
{
	return email_address;
}

public WebElement NextButton()
{
	return next_btn;
}

public WebElement errorMessage()
{
	return error_Message;
}

}


