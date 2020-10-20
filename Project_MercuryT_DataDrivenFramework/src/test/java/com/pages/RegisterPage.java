package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

import com.configu.Demo;

public class RegisterPage {
 public WebDriver driver;
 Properties prop=new Properties();
 
 @BeforeClass
 public void register() throws IOException
 {
  FileInputStream fis1=new FileInputStream("C:\\\\Users\\\\SHRI\\\\eclipse-workspace\\\\Project_MercuryT_DataDrivenFramework\\\\src\\\\test\\\\resources\\\\configu.properties");
  prop.load(fis1);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.findElement(By.linkText("REGISTER")).click();
  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(prop.getProperty("fname"));
  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(prop.getProperty("lname"));
  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(prop.getProperty("mobile"));
  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(prop.getProperty("email"));
  driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(prop.getProperty("address"));
  driver.findElement(By.xpath("//input[@name='city']")).sendKeys(prop.getProperty("city"));
  driver.findElement(By.xpath("//input[@name='state']")).sendKeys(prop.getProperty("state"));
  driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(prop.getProperty("postal"));
  
  WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
  Select sel=new Select(country);
  sel.selectByIndex(2);
  
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prop.getProperty("uname"));
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("pass"));
  driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(prop.getProperty("conpass"));
  driver.findElement(By.xpath("//input[@name='register']")).click();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.findElement(By.linkText("REGISTER")).click();
  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(prop.getProperty("fname1"));
  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(prop.getProperty("lname1"));
  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(prop.getProperty("mobile1"));
  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(prop.getProperty("email1"));
  driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(prop.getProperty("address1"));
  driver.findElement(By.xpath("//input[@name='city']")).sendKeys(prop.getProperty("city1"));
  driver.findElement(By.xpath("//input[@name='state']")).sendKeys(prop.getProperty("state1"));
  driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(prop.getProperty("postal1"));
  
  WebElement country1=driver.findElement(By.xpath("//select[@name='country']"));
  Select sel1=new Select(country1);
  sel1.selectByIndex(5);
  
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prop.getProperty("uname1"));
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("pass1"));
  driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(prop.getProperty("conpass1"));
  driver.findElement(By.xpath("//input[@name='register']")).click();
  
  }
 public RegisterPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 
}
