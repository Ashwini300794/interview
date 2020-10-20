package com.configu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo {
 
	public WebDriver driver;
	Properties prop=new Properties();
	@BeforeSuite
	public void browser() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\SHRI\\\\eclipse-workspace\\\\Project_MercuryT_DataDrivenFramework\\\\src\\\\test\\\\resources\\\\configu.properties");
		prop.load(fis);
		
		System.setProperty(prop.getProperty("path"), prop.getProperty("browser"));
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void url() throws IOException
	{
		FileInputStream fis1=new FileInputStream("C:\\\\Users\\\\SHRI\\\\eclipse-workspace\\\\Project_MercuryT_DataDrivenFramework\\\\src\\\\test\\\\resources\\\\configu.properties");
		prop.load(fis1);
		driver.get(prop.getProperty("url"));
	}
	public Demo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
}
