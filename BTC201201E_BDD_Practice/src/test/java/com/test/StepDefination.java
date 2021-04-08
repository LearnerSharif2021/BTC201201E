//package com.test;
//
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefination {
//	
//	@Before
//	public void start() {
//		
//	}
//	@After
//	public void end() {
//		
//	}
//	@Before("@smoke")
//	public void start1() {
//		
//	}
//	@After("@smoke")
//	public void end1() {
//		
//	}
//	
//	
//	WebDriver dr;
//	@Given("^open blank browser$")
//	public void open_blank_browser() throws Throwable {
//		dr=new ChromeDriver();
//	}
//
//	@Given("^nevigate to url$")
//	public void nevigate_to_url() throws Throwable {
//		dr.get("https://www.facebook.com/");
//	}
//
//	@When("^user type userid in userText box$")
//	public void user_type_userid_in_userText_box() throws Throwable {
//		dr.findElement(By.id("email")).sendKeys("");
//	}
//
//	@When("^user type password in passText box$")
//	public void user_type_password_in_passText_box() throws Throwable {
//		dr.findElement(By.id("pass")).sendKeys("");
//	}
//
//	@When("^user click on login button$")
//	public void user_click_on_login_button() throws Throwable {
//		dr.findElement(By.id("login")).click();
//	}
//
//	@Then("^user should see his profile page$")
//	public void user_should_see_his_profile_page() throws Throwable {
//		if(dr.findElement(By.id("signout")).isDisplayed()){
//			System.out.println("i am in right page");
//		}
//	}
//	
//	@When("^user type <\"([^\"]*)\"> in userText box$")
//	public void user_type_in_userText_box(String arg1) throws Throwable {
//		dr.findElement(By.id("email")).sendKeys(arg1);
//		
//	}
//
//	@When("^user type <\"([^\"]*)\">password in passText box$")
//	public void user_type_password_in_passText_box(String arg1) throws Throwable {
//		dr.findElement(By.id("pass")).sendKeys(arg1);
//		
//	}    
//
//	@Then("^user should not see his profile page$")
//	public void user_should_not_see_his_profile_page() throws Throwable {
//		if(!dr.findElement(By.id("signout")).isDisplayed()){
//			System.out.println("i am in right page");
//		}
//		
//	}
//
//
//}
