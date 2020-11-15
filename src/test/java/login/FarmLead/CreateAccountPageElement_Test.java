package login.FarmLead;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.PageElements;
import Utils.Base;

public class CreateAccountPageElement_Test extends Base {
	public WebDriver driver;
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=init();
	}
	
	@Test
	public void CreateAccount_PageElementsTest() throws InterruptedException
	{
		driver.get(prop.getProperty("url"));
	    PageElements pe=new PageElements(driver);
	    pe.create_account_text().click();
		Assert.assertEquals("Let's Get Started!",pe.CreateAccountPage_Title().getText());
		Assert.assertEquals("First Name",pe.FirstName_Field().getText());
		Assert.assertEquals("Last Name",pe.LastName_Field().getText());
		Assert.assertEquals("Email Address",pe.Email_Field().getText());
		Assert.assertEquals("Log in",pe.Login_Link().getText());
		
	}

	@AfterTest
	public void close()
	{
		driver.close();
	}
}
