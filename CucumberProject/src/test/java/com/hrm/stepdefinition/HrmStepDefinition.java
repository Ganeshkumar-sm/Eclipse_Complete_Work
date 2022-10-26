package com.hrm.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmStepDefinition {
	WebDriver driver;

	@Given("^user enter the valid url$")
	public void user_enter_the_valid_url() throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);

	}

	@When("^user gives the username and password$")
	public void user_gives_the_username_and_password() { 				//placeholder="Username"

		WebElement uname = driver.findElement(By.name("username"));

		uname.sendKeys("Admin");

		WebElement pword = driver.findElement(By.xpath("//input[@placeholder='Password']"));

		pword.sendKeys("admin123");

	}

	@And("^user tap the login button$")
	public void user_tap_the_login_button() {

		WebElement lgn = driver.findElement(By.xpath("//button[@type='submit']"));

		lgn.click();

	}

	@Then("^user enters the homepage$")
	public void user_enters_the_homepage() {

		String title = driver.getTitle(); //("OrangeHRM", title)
		
		Assert.assertEquals(title, "OrangeHRM");
		
		System.out.println("Actual Title is "+title);
		
		
	}

}
