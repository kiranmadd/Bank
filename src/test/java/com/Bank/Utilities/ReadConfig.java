package com.Bank.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {

		try {
			File rf=new File("./Configuration/config.properties");
			FileInputStream fis=new FileInputStream(rf);
			pro=new Properties();
			pro.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public String getApplicationURL() {
		String url=pro.getProperty("baseURL");
		return url;	
	}
	public String getUserName() {
		String uname=pro.getProperty("userName");
		return uname;
	}
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getDriverPath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIEDriverPath() {
		String ie=pro.getProperty("iedriver");
		return ie;
	}
	public String getGeckoDriver() {
		String gecko=pro.getProperty("geckodriver");
		return gecko;
	}
}