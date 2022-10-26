package com.hrm.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmStepDefinition {
	WebDriver driver;

	@Given("^user enter the valid url$")
	public void user_enter_the_valid_url() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() {

		WebElement uname = driver.findElement(By.id("txtUsername"));

		uname.sendKeys("Admin");

		WebElement pword = driver.findElement(By.id("txtPassword"));

		pword.sendKeys("admin123");

	}

	@And("^user click the login button$")
	public void user_click_the_login_button() {

		WebElement lgn = driver.findElement(By.name("Submit"));

		lgn.click();

	}

	@Then("^user verifies the homepage$")
	public void user_verifies_the_homepage() {

		WebElement lbl = driver.findElement(By.xpath("//*[contains(text(),'Dashboard')]"));

		String db = lbl.getText();

		System.out.println(db);

	}

}
