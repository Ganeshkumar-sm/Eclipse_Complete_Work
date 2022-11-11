package com.webapp.testLeafClass;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webapp.testLeafUtils.FunctionLibrary;

public class TestLeafButton extends FunctionLibrary {

	
	public TestLeafButton() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[.='Button']")
	WebElement btnicon;
	
	@FindBy(id = "home")
	WebElement btnhomepage;
	
	@FindBy(id = "position")
	WebElement btnposition;
	
	@FindBy(id = "color")
	WebElement btncolor;
	
	@FindBy(id = "size")
	WebElement btnsize;

	public void buttonIcon() {
		
		btnicon.click();
	}

	public void homePageButton() {
		//String homeUrl = driver.getCurrentUrl();
		
		//btnhomepage.click();
		
		String attribute = btnhomepage.getAttribute("onclick");
		
		if (attribute.contains("home.html")) {
			System.out.println("Homepage Button Verified");
		}else {
			System.out.println("Need to Check");
		}
		
	}

	public void positionButton() {
		Point location = btnposition.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		System.out.println("X = "+x+", Y = "+y);
		
		Dimension size = btnposition.getSize();
		System.out.println("Size of the Button is "+size);
	}

	public void colorButton() {
		String attribute = btncolor.getAttribute("style");
		System.out.println(attribute);
	}

	public void sizeButton() {
		Dimension size = btnsize.getSize();
		System.out.println("Size of the Button is "+size);
		
	}
	public void returnHomepage() {
		driver.navigate().back();

	}
}
