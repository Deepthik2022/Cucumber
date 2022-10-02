package org.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AdactinPOM.AdactinSep23bPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class AdactinSep23bStepDefiniton{
//	AdactinSep23bPOM a;
//	WebDriver driver;
//	@Given("User is on Adactin login page")
//	public void user_is_on_Adactin_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//	}
//	@When("User enters  valid Username as {string} and password as {string}")
//	public void user_enters_valid_Username_as_and_password_as(String Username, String password) {
//		a=new AdactinSep23bPOM(driver);
//		a.getTxtUsername(Username);
//		a.getTxtPassword(password);
//	}
//	@When("User clicks the login button")
//	public void user_clicks_the_login_button() {
//        a.getBtnLogin();
//	}
//	@Then("Search hotel page is displayed")
//	public void search_hotel_page_is_displayed() {
//	}
//
//
//}
