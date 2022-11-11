package com.webapp.testLeafClass;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webapp.testLeafUtils.FunctionLibrary;
import com.webapp.testLeafClass.TestLeafEdit;

public class TestLeafWindow extends FunctionLibrary {

	public TestLeafWindow() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[.='Window']")
	WebElement winicon;

	@FindBy(xpath = "//button[contains(text(),'Open Home')]")
	WebElement ohp;

	@FindBy(xpath = "//button[contains(text(),'Open Multiple')]")
	WebElement omw;

	@FindBy(xpath = "//button[contains(text(),'Do not')]")
	WebElement dncm;

	@FindBy(xpath = "//button[contains(text(),'Wait for')]")
	WebElement wf5s;

	public void windowIcon() {

		winicon.click();

	}

	public void openHomePage() {
		String parent = driver.getWindowHandle();

		ohp.click();
		Set<String> windowHandles = driver.getWindowHandles();

		int size = windowHandles.size();
		System.out.println(size);

		for (String newwin : windowHandles) {
			driver.switchTo().window(newwin);

		}
		TestLeafEdit initElements2 = PageFactory.initElements(driver, TestLeafEdit.class);
		System.out.println("\nIN WINDOWS HANDLING EDIT FUNCTION:");
		initElements2.editIcon();
		initElements2.emailAddress();
		initElements2.appendText();
		initElements2.getDefText();
		initElements2.clearText();
		initElements2.confirmField();
		driver.close();
		driver.switchTo().window(parent);

	}

	public void openMultipleWindow() {
		String parent = driver.getWindowHandle();
		omw.click();
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println(size);
		for (String string : windowHandles) {
			WebDriver window = driver.switchTo().window(string);
			String currentUrl = window.getCurrentUrl();
			System.out.println(currentUrl);

		}
		driver.switchTo().window(parent);
	}

	public void doNotCloseMe() {
		String parent = driver.getWindowHandle();
		dncm.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
			if (!string.equals(parent)) {
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}

	public void waitForFiveSeconds() {

		String parent = driver.getWindowHandle();
		wf5s.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
			if (!string.equals(parent)) {
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}

	public void returnHomepage() {
		driver.navigate().back();

	}
}
