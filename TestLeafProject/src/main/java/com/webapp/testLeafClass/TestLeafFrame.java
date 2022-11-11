package com.webapp.testLeafClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapp.testLeafUtils.FunctionLibrary;

public class TestLeafFrame extends FunctionLibrary {
	

	public TestLeafFrame() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[.='Frame']")
	WebElement frameicn;
	@FindBy(how = How.ID, using = "Click")
	WebElement clme;
	@FindBy(how = How.ID, using = "Click1")
	WebElement clme2;

	public void frameIcon() {
		frameicn.click();

	}

	public void insideFrame() {
		driver.switchTo().frame(0);
		clme.click();
	}

	public void insideNestedFrame() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		clme2.click();
	}

	public void noOfFrames() {
		driver.switchTo().defaultContent();
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size = findElements.size();
		System.out.println("No of Frames: "+size);
		
		
	}
	public void returnHomepage() {
		driver.navigate().back();

	}
}
