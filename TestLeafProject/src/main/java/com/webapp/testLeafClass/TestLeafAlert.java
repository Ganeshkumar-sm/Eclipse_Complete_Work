package com.webapp.testLeafClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapp.testLeafUtils.FunctionLibrary;

public class TestLeafAlert extends FunctionLibrary {
	

	public TestLeafAlert() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Alert']")
	WebElement alerticon;

	@FindBy(how = How.XPATH, using = "//button[text()='Alert Box']")
	WebElement alertbox;

	@FindBy(how = How.XPATH, using = "//button[text()='Confirm Box']")
	WebElement confmbox;

	@FindBy(how = How.XPATH, using = "//button[text()='Prompt Box']")
	WebElement prmptbox;

	@FindBy(how = How.XPATH, using = "//button[text()='Line Breaks?']")
	WebElement linebox;

	public void landingPage() {

		/* driver.findElement(By.xpath("//h5[text()='Alert']")).click(); */

		alerticon.click();

	}

	public void simpleAlert() {

		alertbox.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

	}

	public void confirmAlert() {

		confmbox.click();

		Alert alert = driver.switchTo().alert();

		alert.dismiss();

	}

	public void promptAlert() {

		prmptbox.click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("self");

		alert.accept();

	}

	public void lineBreaks() {

		linebox.click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		System.out.println(text);

		alert.accept();

		

	}
	public void returnHomepage() {
		
		driver.navigate().back();

	}
}
