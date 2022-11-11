package com.webapp.stepdefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;

	@Given("^user enter the URL$")
	public void user_enter_the_URL() throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

	}

	@When("^user enter the username and password$")
	public void user_enter_the_username_and_password() {

		WebElement uname = driver.findElement(By.id("email"));

		uname.sendKeys("gshkumar015@gmail.com");

		WebElement pwrd = driver.findElement(By.id("pass"));

		pwrd.sendKeys("01061995Ganesh");

	}

	@And("^user click the login button$")
	public void user_click_the_login_button() {
		

		WebElement login = driver.findElement(By.name("login"));

		login.click();

	}

	@Then("^user verifies the homepage$")
	public void user_verifies_the_homepage() {

		System.out.println(driver.getTitle());

	}

}
