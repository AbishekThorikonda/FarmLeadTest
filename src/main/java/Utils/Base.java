package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	public static Properties prop= new Properties();
	public WebDriver init() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Utils\\Data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Utils\\chromedriver.exe");
			driver = new ChromeDriver();	
	    }
	    else if(browserName.equals("firefox"))
	    {
	    	System.setProperty("webdriver.geko.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Utils\\geckodriver.exe");
			driver = new FirefoxDriver();
	    }
	    else if(browserName.equals("IE"))
	    {
	    	System.setProperty("webdriver.IEDriver.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Utils\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	  
					}
	 
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		return driver;
		
	}

}
