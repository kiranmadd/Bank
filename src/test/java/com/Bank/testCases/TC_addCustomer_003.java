package com.Bank.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.Bank.pageObjects.AddCustomerPage;
import com.Bank.pageObjects.LoginPage;

public class TC_addCustomer_003 extends BaseClass{

	@Test
	public void addcustomer() {
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		
		AddCustomerPage acp=new AddCustomerPage(driver);
		acp.newCust();
		acp.cName("Radha");
		acp.cGender("female");
		acp.cDOB("12","02","1989");
		acp.cAddress("123");
		acp.city("Chennai");
		acp.state("Tamilnadu");
		acp.pincode("114312");
		acp.phoneNum("123455669");
		String rstr=randomstring()+"@gmail.com";
		acp.emailId(rstr);
		acp.password("adadgh");
		acp.submit();
	}
	
				public String randomstring() {
					String rstring=RandomStringUtils.randomAlphabetic(8);
					return rstring;
				}
	
	
	
}
