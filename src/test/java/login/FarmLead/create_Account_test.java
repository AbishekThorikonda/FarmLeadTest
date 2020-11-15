package login.FarmLead;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.create_Account;
import Utils.Base;

public class create_Account_test extends Base {
	
	public WebDriver driver;
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=init();
	}
	//Positive Tests
	@Test(dataProvider="positiveData")
	public void CreateAccount_PositiveTest(String fname ,String lname, String email)
	{
		driver.get(prop.getProperty("url"));
		create_Account ca = new create_Account(driver);
		ca.createAccountLink().click();
		ca.FirstName().sendKeys(fname);
		ca.LastName().sendKeys(lname);
		ca.Email().sendKeys(email);
		ca.NextButton().click();
		//Even with valid details not able to create account, hence could not validate positive case
	}
	
	//Negative Tests
	@Test(dataProvider="NegativeData")
	public void CreateAccount_NegativeTest(String fname ,String lname, String email, String errorMessage)
	{
		driver.get(prop.getProperty("url"));
		create_Account ca = new create_Account(driver);
		ca.createAccountLink().click();
		ca.FirstName().sendKeys(fname);
		ca.LastName().sendKeys(lname);
		ca.Email().sendKeys(email);
		ca.NextButton().click();
		Assert.assertEquals(errorMessage,ca.errorMessage().getText());
	}
	//positive Daraprovider
	@DataProvider
	public Object[][] positiveData()
	{
	Object[][] acntData_positive=new Object[1][3];
	acntData_positive[0][0]="Abishek";
	acntData_positive[0][1]="Thorikonda";
	acntData_positive[0][2]="abishek@gmail.com";
	return acntData_positive;
	}

	//Negative Dataprovider
	@DataProvider
	public Object[][] NegativeData()
	{
		Object[][] acntData =new Object[3][4];
		acntData[0][0]="Abishek";
		acntData[0][1]="T";
		acntData[0][2]="abcdefg";
		acntData[0][3]="The provided email is invalid.";
		
		acntData[1][0]="??//@# ";
		acntData[1][1]="T";
		acntData[1][2]="abc@gmail.com";
		acntData[1][3]="First name is required.";
		
		acntData[2][0]="Abishek";
		acntData[2][1]="@#$%";
		acntData[2][2]="abc@gmail.com";
		acntData[2][3]="Last name is required.";
		
		return acntData;
	}
	
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}
