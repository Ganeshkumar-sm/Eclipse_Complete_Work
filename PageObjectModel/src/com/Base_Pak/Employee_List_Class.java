package com.Base_Pak;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Employee_List_Class {
	
	WebDriver driver;
	
	By lbl = By.xpath("//h6[text()='PIM']"); // = text validation
	
	By ddtext = By.xpath("//ul[@role='menu'and@class='oxd-dropdown-menu']//child::li");// = dropdown text getting 
	
	By name_ele = By.xpath("//label[text()='Employee Name']//parent::div//following-sibling::div//child::input"); // = emp name fld
	
	By id_ele = By.xpath("//label[text()='Employee Id']//parent::div//following-sibling::div//child::input"); // = emp id fld
	
	By status_ele = By.xpath("//label[text()='Employment Status']//parent::div//following-sibling::div/div/div/div[1]"); // = emp status fld
	
	By incld_ele = By.xpath("//div[text()='Current Employees Only']"); // = include fld
	
	By supername_ele = By.xpath("//label[text()='Supervisor Name']//parent::div//following-sibling::div/div/div//child::input"); // = supervisor name fld
	
	By jobtitle_ele = By.xpath("//label[text()='Job Title']//parent::div//following-sibling::div/div/div//child::div[@class='oxd-select-text-input']"); // = job title fld
	
	By subunit_ele = By.xpath("//label[text()='Sub Unit']//parent::div//following-sibling::div/div/div//child::div[@class='oxd-select-text-input']"); // = sub unit fld
	
	By bton_ele = By.xpath("//button[@type='submit']"); // = search btn
	
		
	public void label() {
		
		WebElement labelText = driver.findElement(lbl);
		
		String txtLabel = labelText.getText();
		
		System.out.println(txtLabel);

	}
	
	public void id_dropdown() {
		
		List<WebElement> dropdown = driver.findElements(ddtext);
		
		for (WebElement dpdn : dropdown) {
			
			String ddText = dpdn.getText();
			
			System.out.println(ddText);
		}
		

	}
	
	public void employeeName(String emp_name) {
		
		driver.findElement(name_ele).sendKeys(emp_name);
		

	}
	
	public void employeeId(CharSequence[] emp_id) {
		
		driver.findElement(id_ele).sendKeys(emp_id);

	}
	
	public void employeeStatus() {
		

	}
	
	public void include() {
		

	}
	
	public void supervisorName() {
		

	}
	
	public void jobTitle() {
		

	}
	
	public void subUnit() {
		

	}
	
	public void searchButton() {
		

	}
	
	
}
