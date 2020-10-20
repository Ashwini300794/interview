package com.test;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.pages.RegisterPage;

public class Execute {
	public WebDriver driver;
	Properties prop=new Properties();
	static Logger logg=Logger.getLogger(Execute.class.getName());
	@Test
  public void excecutr1() throws IOException
  {
	  FileInputStream fis=new FileInputStream("C:\\Users\\SHRI\\eclipse-workspace\\Project_MercuryT_DataDrivenFramework\\src\\test\\resources\\configu.properties");
		prop.load(fis);
		
		System.setProperty(prop.getProperty("path"),prop.getProperty("browser"));
		driver=new ChromeDriver();
		
		logg.warn("browser opened successfully");
		
		driver.get(prop.getProperty("url"));
		logg.info("url opened successfully");
		
		driver.manage().window().maximize();
		logg.info("window is maximized");
		
		RegisterPage rp=new RegisterPage(driver);
		rp.register();
		
  }
  
  
}
