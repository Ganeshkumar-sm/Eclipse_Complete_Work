package com.webapp.testLeafClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapp.testLeafUtils.FunctionLibrary;

public class TestLeafEdit extends FunctionLibrary {

	public TestLeafEdit() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//h5[.='Edit']")
	WebElement edticn;

	@FindBy(id = "email")
	WebElement entertab;

	@FindBy(xpath = "//input[@value='Append ']")
	WebElement apptab;

	@FindBy(xpath = "//input[@value='TestLeaf']")
	WebElement gettxttab;

	@FindBy(xpath = "//input[@value='Clear me!!']")
	WebElement clmetab;

	@FindBy(xpath = "//input[@disabled='true']")
	WebElement distab;

	public void editIcon() {

		edticn.click();
	}

	public void emailAddress() {

		entertab.sendKeys(pro.getProperty("editemailid"));

		System.out.println("Entered E-Mail Id: " + pro.getProperty("editemailid"));
	}

	public void appendText() {

		apptab.sendKeys(pro.getProperty("editappend"));

		System.out.println("Entered Text: " + pro.getProperty("editappend"));

	}

	public void getDefText() {

		String attribute = gettxttab.getAttribute("value");

		System.out.println("Default Text = " + attribute);

	}

	public void clearText() {

		clmetab.clear();

	}

	public void confirmField() {

		boolean enabled = distab.isEnabled();

		System.out.println("isEnabled: " + enabled);

		if (enabled == true) {

			System.out.println("Edit Fiels is Enabled");
		} else {
			System.out.println("Edit Fiels is Disabled");
		}

	}

	public void returnHomepage() {
		driver.navigate().back();

	}
}
