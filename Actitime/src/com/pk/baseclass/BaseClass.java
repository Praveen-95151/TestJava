package com.pk.baseclass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
	public WebDriver driver;
	public ExcelData xlib;
	
	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void Login() {
		
		xlib = new ExcelData();
		String un=xlib.getExcelData("login", 1, 0);
		String pwd=xlib.getExcelData("login", 1, 1);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void Logout() {
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
