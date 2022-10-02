package org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class Sep25b2DWHStepDefiniton {
//	WebDriver driver;
//
//	@Given("user is on Adactin login page")
//	public void userIsOnAdactinLoginPage() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
//	}
//
//	@When("user enters username and password")
//	public void userEntersUsernameAndPassword(io.cucumber.datatable.DataTable dataTable) {
//		List<Map<String, String>> asMaps = dataTable.asMaps();
//		String s1 = asMaps.get(0).get("username");
//		driver.findElement(By.id("username")).sendKeys(s1);
//		String s2 = asMaps.get(0).get("password");
//		driver.findElement(By.id("password")).sendKeys(s2);
//	}
//
//	@When("user clicks the login button")
//	public void userClicksTheLoginButton() {
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Then("search hotel page appears")
//	public void searchHotelPageAppears() {
//	}
//
//}
