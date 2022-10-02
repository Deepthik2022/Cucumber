package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class Step25a1DStepDefinition {
//	WebDriver driver;
//
//	@Given("user is on Adactin login page")
//	public void user_is_on_Adactin_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) throws Exception {
//		String s1 = dataTable.asList().get(0);
//		String s2 = dataTable.asList().get(1);
//		driver.findElement(By.id("username")).sendKeys(s1);
//		driver.findElement(By.id("password")).sendKeys(s2);
//		Thread.sleep(5000);
//	}
//
//	@When("clicks on login button")
//	public void clicks_on_login_button() {
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("search hotel page appears")
//	public void search_hotel_page_appears() {
//
//	}
//
//}
