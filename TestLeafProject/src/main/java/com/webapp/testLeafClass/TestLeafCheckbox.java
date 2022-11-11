package com.webapp.testLeafClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapp.testLeafUtils.FunctionLibrary;

public class TestLeafCheckbox extends FunctionLibrary{
	

	public TestLeafCheckbox(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//h5[.='Checkbox']")
	WebElement checkbox_icon_ele;

	@FindBys(@FindBy(xpath = "//label[contains(text(),'Select the')]//following-sibling::input"))
	List<WebElement> lang_ele;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Confirm ')]//following-sibling::input")
	WebElement confm_ele;

	@FindBys(@FindBy(xpath = "//label[contains(text(),'DeSelect only')]//following-sibling::input"))
	List<WebElement> deselect_ele;

	@FindBys(@FindBy(xpath = "//label[contains(text(),'Select all')]//following-sibling::input"))
	List<WebElement> selectall_ele;

	public void chechBoxIcon() {
		checkbox_icon_ele.click();
	}

	public void selectKnownLanguages() {
		int count = 1;
		for (WebElement webElement : lang_ele) {
			if (count == 2) {
				System.out.println("I don't know 'VB'");
			} else {
				webElement.click();
			}
			count++;
		}

	}

	public void confirmSelenium() {
		boolean selected = confm_ele.isSelected();
		if (selected == true) {
			System.out.println("Icon is Selected");
		} else {
			confm_ele.click();
		}

	}

	public void deselectTheSelected() {
		int count = 1;
		for (WebElement webElement : deselect_ele) {
			boolean selected = webElement.isSelected();
			if (selected == true) {
				webElement.click();
				System.out.println(count + " Element is Deselected");
			} else {
				System.out.println(count + " Element is not selected");
			}
			count++;
		}
	}

	public void selectAll() {
		for (WebElement webElement : selectall_ele) {
			webElement.click();
		}
		
	}
	public void returnHomepage() {
		driver.navigate().back();

	}
}
