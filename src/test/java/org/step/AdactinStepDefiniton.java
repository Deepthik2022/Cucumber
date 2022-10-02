package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStepDefiniton {
//	WebDriver driver;
//	Select select;
//	
//	@Given("user is on Adactin hotel app login page")
//	public void user_is_on_Adactin_hotel_app_login_page() {
//	    WebDriverManager.chromedriver().setup();
//	    driver=new ChromeDriver();
//	    driver.get("http://adactinhotelapp.com/");
//	    driver.manage().window().maximize();
//	}
//	@When("user enters username as {string}  and password as {string}")
//	public void user_enters_username_as_and_password_as(String username, String password) {
//		 driver.findElement(By.id("username")).sendKeys(username);
//		    driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@When("click the login button")
//	public void click_the_login_button() {
//	    driver.findElement(By.id("login")).click();
//	}
//
//	@Then("Search hotel page is displayed")
//	public void search_hotel_page_is_displayed() {
//	    
//	}
//
//	@When("user selects the location")
//	public void user_selects_the_location_as() {
//		WebElement country = driver.findElement(By.id("location"));
//		Select select=new Select(country);
//		select.selectByVisibleText("London");
//	    
//	}
//
//	@When("clicks search button")
//	public void clicks_search_button() {
//	  driver.findElement(By.id("Submit")).click();
//	}
//
//	@Then("select hotel page is displayed")
//	public void select_hotel_page_is_displayed() {
//	    
//	}
//
//	@When("user selects hotel")
//	public void user_selects_hotel() {
//		driver.findElement(By.id("radiobutton_2")).click();
//	    
//	}
//
//	@When("clicks on continue")
//	public void clicks_on_continue() {
//		driver.findElement(By.id("continue")).click();
//	    
//	}
//
//	@Then("Book a hotel page is displayed")
//	public void book_a_hotel_page_is_displayed() {
//	    
//	}
//
//	@When("user enters firstname as {string},lastname as {string},billingaddress as {string},creditcardnum as {string},creditcardtype ,expirymonth ,expyear as ,cvvnum as {string}")
//	public void user_enters_firstname_as_lastname_as_billingaddress_as_creditcardnum_as_creditcardtype_expirymonth_expyear_as_cvvnum_as(String firstname, String lastname, String billingaddress, String creditcardnum, String cvvnum) {
//	    driver.findElement(By.id("first_name")).sendKeys(firstname);
//	    driver.findElement(By.id("last_name")).sendKeys(lastname);
//	    driver.findElement(By.id("address")).sendKeys(billingaddress);
//	    driver.findElement(By.id("cc_num")).sendKeys(creditcardnum);
//	    WebElement ccType = driver.findElement(By.id("cc_type"));
//	   Select select=new Select(ccType);
//	   select.selectByVisibleText("VISA");
//	   WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
//	   select=new Select(expMonth);
//	   select.selectByVisibleText("December");
//	   WebElement expYear = driver.findElement(By.id("cc_exp_year"));
//	   select=new Select(expYear);
//	   select.selectByVisibleText("2022");
//	   driver.findElement(By.id("cc_cvv")).sendKeys(cvvnum);
//	}
//	
//	@When("click on booknow button")
//	public void click_on_booknow_button() {
//		driver.findElement(By.id("book_now")).click();
//	    
//	}
//
//	@Then("booking confirmation page is displayed")
//	public void booking_confirmation_page_is_displayed() {
//		driver.findElement(By.partialLinkText("Logout")).click();
//	    
//	}
//
//
//
//
//
//
}
