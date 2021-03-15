package com.Bank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how=How.XPATH,using="//a[text()='New Customer']")
	WebElement addCustomer;


	@FindBy(how=How.NAME,using="name")
	WebElement custName;

	@FindBy(how=How.NAME,using="rad1")
	WebElement gender;


	@FindBy(how=How.XPATH,using="//input[@type='date']")
	WebElement dob;

	@FindBy(how=How.NAME,using="addr")
	WebElement custAddress;

	@FindBy(how=How.NAME,using="city")
	WebElement custCity;
	
	@FindBy(how=How.NAME,using="state")
	WebElement state;

	@FindBy(how=How.NAME,using="pinno")
	WebElement custPin;

	@FindBy(how=How.NAME,using="telephoneno")
	WebElement phoneNum;

	@FindBy(how=How.NAME,using="emailid")
	WebElement emailId;

	@FindBy(how=How.NAME,using="password")
	WebElement password;

	@FindBy(how=How.NAME,using="sub")
	WebElement submit;

	public void newCust() {
		addCustomer.click();
	}	
	public void cName(String name) {
		custName.sendKeys(name);	
	}

	public void cGender(String g) {
		gender.click();
	}
	public void cDOB(String d,String m,String y) {
		dob.sendKeys(d);
		dob.sendKeys(m);
		dob.sendKeys(y);
	}
	public void cAddress(String adr)
	{
		custAddress.sendKeys(adr);
	}
	public void city(String c)
	{
		custCity.sendKeys(c);
	}
	public void state(String s) {
		state.sendKeys(s);
	}
	public void pincode(String pin)
	{
		custPin.sendKeys(pin);
	}
	public void phoneNum(String phone)
	{
		phoneNum.sendKeys(phone);
	}
	public void emailId(String mailid)
	{
		emailId.sendKeys(mailid);
	}
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void submit()
	{
		submit.click();
	}






}



