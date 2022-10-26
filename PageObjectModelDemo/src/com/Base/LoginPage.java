package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
	WebElement unme;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement lon;

	public void uname(String user_name) {

		unme.sendKeys(user_name);

	}

	public void pword(String pass_wrd) {

		pwd.sendKeys(pass_wrd);

	}

	public void login() {

		lon.click();

	}

}
