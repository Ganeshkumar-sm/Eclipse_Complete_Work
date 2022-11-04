package com.webapp.testleafclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.webapp.utils.FunctionLibrary;

public class Alert extends FunctionLibrary {

	WebDriver driver;

	public Alert(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h5[.='Alert']")
	WebElement alicon;

	@FindBy(how = How.XPATH, using = "//button[text()='Alert Box']")
	WebElement alertbx;

	@FindBy(how = How.XPATH, using = "//button[text()='Confirm Box']")
	WebElement confmbx;

	@FindBy(how = How.XPATH, using = "//button[text()='Prompt Box']")
	WebElement prmptbx;

	@FindBy(how = How.XPATH, using = "//button[text()='Line Breaks?']")
	WebElement linebx;
	
	public void alertIcon() {
		
		alicon.click();
		
	}
	
	public void simpleAlert() {
		
		alertbx.click();
			
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		alert.accept();
	
	}
	
	public void confirmAlert() {
		

	}
	
	public void promptAlert() {
		

	}
	
	public void lineBreaks() {
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
