
package com.Bank.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Bank.Utilities.XLUtils;
import com.Bank.pageObjects.LoginPage;

public class TC_loginPage_002 extends BaseClass {
	
@Test(dataProvider="LoginData")
public void login(String user,String pwd) throws InterruptedException, IOException
{
	
	LoginPage lp=new LoginPage(driver);
	
	lp.setUsername(user);
	logger.info("User name is entered");
	lp.setPassword(pwd);
	logger.info("password entered");
	lp.clickSubmit();
	//Thread.sleep(3000);
	if(isAlertPresent()==true)
	{
		
		driver.switchTo().alert().accept();//close alert
		driver.switchTo().defaultContent();
		captureScreen(driver,"login");
		Assert.assertTrue(false);
		logger.info("Login Failed");
		//captureScreen(driver,"login");
		
	}
	else
	{
		Assert.assertTrue(true);
		logger.info("Login passed");
		
		lp.clickLogout();
		//Thread.sleep(3000);
		driver.switchTo().alert().accept();//close logout alert
		driver.switchTo().defaultContent();
		
		
	}
}
public boolean isAlertPresent() //user defined method to check wether alert is present or not
{
	try {
		driver.switchTo().alert();
		return true;
		}
	catch (Exception e) {
		return false;
	}
	
}
@DataProvider(name="LoginData")
String [][] getData() throws IOException
{
	String path=System.getProperty("user.dir")+"/src/test/java/com/Bank/testData/guru.xlsx";
	
	int rownum=XLUtils.getRowCount(path, "sheet1");
	int colcount=XLUtils.getCellCount(path, "sheet1",1);
	
	String logindata[][]=new String[rownum][colcount];
	
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		logindata[i-1][j]=XLUtils.getCellData(path, "sheet1",i,j);//1 0
		
	}
	return logindata;
}
}
