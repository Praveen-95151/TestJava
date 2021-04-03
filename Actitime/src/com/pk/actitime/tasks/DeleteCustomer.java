package com.pk.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.pk.baseclass.BaseClass;

public class DeleteCustomer extends BaseClass{
  @Test
  public void testDeleteCustomer() {
	  driver.findElement(By.id("container_tasks")).click();
	  String del = xlib.getExcelData("ddeleteCustomer", 1, 0);
	  driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys(del);
	  driver.findElement(By.xpath("//span[text()='"+del+"' and @class='highlightToken']/../../..//div[@class='editButton']")).click();
	  driver.findElement(By.xpath("//div[text()='ACTIONS'][1]")).click();
	  driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
	  driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	  
  }
}
