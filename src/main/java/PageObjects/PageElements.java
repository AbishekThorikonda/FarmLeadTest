package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements {
	public WebDriver driver;
	
	public PageElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Title Page Elements
	@FindBy(xpath="//div[@class='Onboard_title__12piM']")
	private WebElement page_title;
	
	@FindBy(xpath="//label[text()='Email Address']")
	private WebElement Email_text;
	
	@FindBy(xpath="//label[text()='Password']")
	private WebElement Password_text;
	
	@FindBy(xpath="//div[@class='Onboard_take-to-marketplace__3876D']")
	private WebElement forgot_pswd_text;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contact_us_text;
	
	@FindBy(xpath="//span[contains(text(),'Create an Account')]")
	private WebElement  create_account_link_text;
	
//Create Account Page Elements
	@FindBy(xpath="//div[contains(text(),\"Let's Get Started!\")]")
	private WebElement CreateAccount_PageTitle;
	
	@FindBy(xpath="//label[text()='First Name']")
	private WebElement firstName_field_Text;
	
	@FindBy(xpath="//label[text()='Last Name']")
	private WebElement lastName_field_Text;
	
	@FindBy(xpath="//label[text()='Email Address']")
	private WebElement email_field_text;
	
	@FindBy(xpath="//div[@class='Onboard_button__3K0AZ']")
	private WebElement Next_Button_Field_Text;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement Login_field_Text;
 			
	
//Title Page Element Methods	
	public WebElement PageTitle()
	{
		return page_title;
	}
	
	public WebElement EmailText()
	{
		return Email_text;
	}
	
	public WebElement PasswordText()
	{
		return Password_text;
	}
	
	public WebElement forgot_password_text()
	{
		return forgot_pswd_text;
	}
	
	public WebElement contact_us_text()
	{
		return contact_us_text;
	}
	
	public WebElement create_account_text()
	{
		return create_account_link_text;
	}

//Create Account Page Element Methods	

	public WebElement CreateAccountPage_Title()
	{
		return CreateAccount_PageTitle;
	}
	
	public WebElement FirstName_Field()
	{
		return firstName_field_Text;
	}
	
	public WebElement LastName_Field()
	{
		return lastName_field_Text;
	}
	
	public WebElement Email_Field()
	{
		return email_field_text;
	}
	
	public WebElement Next_Button_Field()
	{
		return Next_Button_Field_Text;
	}
	
	public WebElement Login_Link()
	{
		return Login_field_Text;
	}
	

}
