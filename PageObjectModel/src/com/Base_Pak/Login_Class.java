package com.Base_Pak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Class {

	WebDriver driver;

	public Login_Class(WebDriver driver) {

		this.driver = driver;
	}

	By eleuname = By.xpath("//input[@placeholder='Username']");
	By elepwd = By.xpath("//input[@placeholder='Password']");
	By elelgn = By.xpath("//button[@type='submit']");

	public void fn_uName(String userName) {

		driver.findElement(eleuname).sendKeys(userName);
	}

	public void fn_passWrd(String passWrd) {

		driver.findElement(elepwd).sendKeys(passWrd);

	}

	public void fn_login() {

		driver.findElement(elelgn).click();

	}

}
