package com.pk.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.pk.baseclass.BaseClass;
//import com.pk.baseclass.ExcelData;

public class CreateCustomer extends BaseClass{

	@Test
	public void testCreateCustomer() {
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		
		String customername = xlib.getExcelData("createCustomer", 1, 0);
		String description = xlib.getExcelData("createCustomer", 1, 1);
		
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(customername);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(description);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		
	}
}
