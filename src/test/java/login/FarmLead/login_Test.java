package login.FarmLead;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.login_fields;
import Utils.Base;

public class login_Test extends Base{

public WebDriver driver;
@BeforeTest
public void initilize() throws IOException
{
	driver=init();
}
//Postive Test
@Test(dataProvider="getPositiveData")
public void positiveloginTest(String username, String password)
{
	login_fields lf = new login_fields(driver);
	driver.get(prop.getProperty("url"));
	lf.username().sendKeys(username);
	lf.password().sendKeys(password);
	lf.NextButton().click();
	// Not able to create account even with valid data, so could not validate positive test. 
}

//Negative Test
@Test(dataProvider="getData")
public void NegativeloginTest(String username, String password, String errorMessage)
{
	login_fields lf = new login_fields(driver);
	driver.get(prop.getProperty("url"));
	lf.username().sendKeys(username);
	lf.password().sendKeys(password);
	lf.NextButton().click();
	Assert.assertEquals(errorMessage,lf.Email_Error().getText());
	
}

//Empty Data Test
@Test(dataProvider="emptyData")
public void BlankloginTest(String username, String password, String errorMessage)
{
	login_fields lf = new login_fields(driver);
	driver.get(prop.getProperty("url"));
	lf.username().sendKeys(username);
	lf.password().sendKeys(password);
	lf.NextButton().click();
	Assert.assertEquals(errorMessage,lf.Email_Error().getText());
}


//Positive Data
@DataProvider
public Object[][] getPositiveData()
{
Object[][] pdata= new Object[1][2];
pdata[0][0]="abc@gmail.com";
pdata[0][1]="Abc@1234";

return pdata;
}

//Negative Data
@DataProvider
public Object[][] getData()
{
	Object[][] data = new Object[3][3];
	data[0][0]="abc@gmail.com";
	data[0][1]="????";
	data[0][2]="Whoops! That email is not associated with an account.";
	
	data[1][0]="abcdefc";
	data[1][1]="123456";
	data[1][2]="Whoops! That email is not associated with an account.";
	
	data[2][0]="abc@gmail.com";
	data[2][1]=" ";
	data[2][2]="Whoops! That email is not associated with an account.";
	
	return data;
				
}

//Blank Data
@DataProvider
public Object[][] emptyData()
{
	Object[][] edata = new Object[2][3];
	edata[0][0]=" ";
	edata[0][1]="123456";
	edata[0][2]="Either a phone number or email is required.";
	
	edata[1][0]=" ";
	edata[1][1]=" ";
	edata[1][2]="Either a phone number or email is required.";
	
	return edata;
	
}

@AfterTest
public void exit()
{
	driver.close();
}

}
