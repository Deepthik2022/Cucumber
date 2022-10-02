package org.step;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sep27cStepDefinition extends BaseClass {
	@Before
	public void beforeEachScenario() {
		browserConfig();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
		System.out.println("window is maximized");
	}
	@After
	public void afterEachScenario() {
		close();
		System.out.println("window is closed");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on Adactin login page");
	}
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		WebElement txtUser = locateById("username");
		txtInput(txtUser, username);
		WebElement txtPass = locateById("password");
		txtInput(txtPass, password);
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		WebElement loginBtn = locateById("login");
		click(loginBtn);
	}
	@Then("search hotel page is displayed")
	public void search_hotel_page_is_displayed() {
		System.out.println("search hotel page is displayed");
	}

}
