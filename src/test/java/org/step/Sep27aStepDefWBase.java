//package org.step;
//
//import org.baseclass.BaseClass;
//import org.hook.Hooks;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Sep27aStepDefWBase extends BaseClass {
//	@Given("user is on Adactin hotel login page")
//	public void user_is_on_Adactin_hotel_login_page() {
//	    
//	}
//	
//	@When("user enters username as {string} and password as {string}")
//	public void user_enters_username_as_and_password_as(String s1, String s2) {
//	    WebElement txtEmail = BaseClass.locateById("username");
//	    BaseClass.txtInput(txtEmail, s1);
//	    WebElement txtPass = BaseClass.locateById("password");
//	    BaseClass.txtInput(txtPass, s2);
//	}
//
// 
//	@When("clicks on login button")
//	public void clicks_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.id("login"));
//		BaseClass.click(loginBtn);
//	    
//	}
//
//	@Then("it displays search hotel page")
//	public void it_displays_search_hotel_page() {
//	    
//	}
//
//
//
//}
