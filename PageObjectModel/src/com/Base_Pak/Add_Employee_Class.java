package com.Base_Pak;

import org.openqa.selenium.By;

public class Add_Employee_Class {
	
	By addEmplbl_ele = By.xpath("//a[text()='Add Employee']");
	By firstName_ele = By.xpath("//input[@placeholder='First Name']");
	By midName_ele = By.xpath("//input[@placeholder='Middle Name']");
	By lasName_ele = By.xpath("//input[@placeholder='Last Name']");
	By empId_ele = By.xpath("//label[text()='Employee Id']//parent::div//following-sibling::div//child::input");
	By bt_ele = By.xpath("//button[@type='submit']");
	By con_ele = By.xpath("//span[contains(text(),'Configuration')]"); // dropdown
		
	
	
	
}
