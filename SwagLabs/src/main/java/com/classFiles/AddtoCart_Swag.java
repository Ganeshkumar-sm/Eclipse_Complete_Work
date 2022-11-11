package com.classFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart_Swag {
	WebDriver driver;

	AddtoCart_Swag() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement prod;
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addcart;

	public void productClick() {
		prod.click();

	}

	public void addToCart() {
		addcart.click();

	}

}
