package login.FarmLead;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.PageElements;
import Utils.Base;
public class TitlePageElement_test extends Base{
	public WebDriver driver;
	@BeforeTest
	public void initilize() throws IOException
	{
		driver = init();
	}
//Testing all Elements of Title Page	
	@Test
	public void TitlePage_ElementTest()
	{
		driver.get(prop.getProperty("url"));
		PageElements pe=new PageElements(driver);
		Assert.assertEquals("Combyne",driver.getTitle());
		Assert.assertEquals("Email Address",pe.EmailText().getText());
		Assert.assertEquals("Password",pe.PasswordText().getText());
		Assert.assertEquals("Welcome to Combyne", pe.PageTitle().getText());
		Assert.assertEquals("Forgot your password?",pe.forgot_password_text().getText());
		Assert.assertEquals("Create an Account",pe.create_account_text().getText());
		Assert.assertEquals("Contact Us",pe.contact_us_text().getText());	
	}

	@AfterTest
	public void close()
	{
		driver.close();
	}

}
