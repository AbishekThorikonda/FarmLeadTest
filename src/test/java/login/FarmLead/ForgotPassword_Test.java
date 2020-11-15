package login.FarmLead;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.ForgotPassword_Link;
import Utils.Base;

public class ForgotPassword_Test extends Base{
public WebDriver driver;

@BeforeTest
public void initilize() throws IOException
{
	driver=init();
}

@Test
public void ForgotPasswordTest()
{
driver.get(prop.getProperty("url"));
ForgotPassword_Link fp = new ForgotPassword_Link(driver);
fp.forgotPassword().click();
Assert.assertEquals("Trouble Logging in?", fp.pageTitle().getText());
fp.emailAddress().sendKeys("abc@gmail.com");
fp.SubmitButton().click();
}

@AfterTest
public void close()
{
	driver.close();
}

}
