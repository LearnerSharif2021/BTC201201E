package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass<NewExcelLibrary> {
	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shafi\\Downloads\\Selenium software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@DataProvider(name="Credentials")
	public Object getData() {
		Object[][] data=new Object[3][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="admin1";
		data[1][1]="admin123";
		
		data[2][0]="admin2";
		data[2][1]="admin";
		
		return data;
		
		
		
		
	}
	
	
	
	
	
	
	

}
