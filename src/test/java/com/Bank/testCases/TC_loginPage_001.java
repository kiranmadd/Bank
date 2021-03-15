package com.Bank.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Bank.pageObjects.LoginPage;

public class TC_loginPage_001 extends BaseClass
{
    
	@Test
	public void loginPage() throws InterruptedException, IOException 
	{
		//driver.get("baseURL");
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(userName);
		logger.info("Username is entered");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		    logger.info("login test passed");
		}
		else
		{
			captureScreen(driver,"loginPage");
			Assert.assertTrue(false);
			System.out.println("Title of the page...."+driver.getTitle());
			logger.info("login test failed");
		}
	}

}
