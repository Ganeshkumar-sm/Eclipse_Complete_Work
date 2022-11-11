package com.classFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.functionalLibrary.FunctionSetup;

public class Login_Swag extends FunctionSetup {

	public Login_Swag() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement unmae;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pwrd;

	@FindBy(id = "login-button")
	WebElement lgn;

	@FindBy(xpath = "//span[.='Products']")
	WebElement label;

	public void enterUsernamePassword(String uname, String pword) {
		unmae.sendKeys(uname);

		pwrd.sendKeys(pword);
	}

	public void clickLoginButton() {
		lgn.click();

	}

	public void homePageLableValidate() {

		String homePageUrl = driver.getCurrentUrl();

		System.out.println("HomePage URL: " + homePageUrl);

		String textLabel = label.getText();

		System.out.println("HomePage Label: " + textLabel);
		
		
	}

}
