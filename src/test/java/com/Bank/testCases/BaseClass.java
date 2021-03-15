package com.Bank.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Bank.Utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig= new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
			
	public  String userName=readconfig.getUserName();
	public  String password=readconfig.getPassword();
	public static WebDriver driver;
			
	public static Logger logger;

	@Parameters("browser")	
	@BeforeClass
	public void setUp(String br) throws InterruptedException
	{
		logger=Logger.getLogger("Bank");
		PropertyConfigurator.configure("Log4j.properties");

		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getDriverPath());
			driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			FirefoxOptions op=new FirefoxOptions();
			FirefoxOptions opt=op.setBinary("C:\\Users\\Haribabu\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver", readconfig.getGeckoDriver());
			driver = new FirefoxDriver(opt);
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIEDriverPath());
			driver=new InternetExplorerDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		//Thread.sleep(4000);
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
public void captureScreen(WebDriver driver,String tname) throws IOException{
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
	
}
}
