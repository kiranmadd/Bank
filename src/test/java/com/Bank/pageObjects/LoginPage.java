package com.Bank.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
public	LoginPage(WebDriver rdriver){
	
		ldriver = rdriver ;
		PageFactory.initElements(rdriver,this);
		
	}

	@FindBy(name="uid")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='LOGIN']")
			
	WebElement Login;
	@FindBy(linkText="Log out")
	WebElement logout;
	
	public void setUsername(String uname) {
		
		userName.sendKeys(uname);
	}
	
       public void setPassword(String pwd) {
		
		Password.sendKeys(pwd);
	}
      public void clickSubmit() {
	
	      Login.click();
}
      public void clickLogout()
      {
    	  logout.click();
      }
	
}
