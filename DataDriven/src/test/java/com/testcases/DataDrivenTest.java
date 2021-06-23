package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class DataDrivenTest extends BaseClass {
	
	@Test(dataProvider = "Credentials")
	public void loginTest(String username, String password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		Assert.assertEquals(actualURL,  expectedURL);
		
		
		
		
	}

}
