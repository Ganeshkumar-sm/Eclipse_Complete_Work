package com.Base_Pak;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Empty_Page {

	public static void main(String[] args) {
		/*
		 * @FindBy(xpath = "//span[text()='Configuration ']") WebElement cfg;
		 * 
		 * @FindBy(xpath = "//ul[@role='menu'and@class='oxd-dropdown-menu']//li")
		 * WebElement dd;
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		String text = driver.findElement(By.xpath("//h5[.='Login']")).getText();

		if (text.equals("Login")) {
			System.out.println("....Label Validated....");
		}

		WebElement link = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
		String tagName = link.getTagName();

		if (tagName.equals("p")) {

			System.out.println("....Link Validated....");

		}
		WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));

		uname.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.navigate().refresh();

		WebElement cfg = driver.findElement(By.xpath("//span[text()='Configuration ']"));
		WebElement dd = driver.findElement(By.xpath("//ul[@role='menu'and@class='oxd-dropdown-menu']//li"));
		cfg.click();

		Select slt = new Select(dd);
		List<WebElement> options = slt.getOptions();

		for (WebElement listDd : options) {

			System.out.println(listDd);
		}
		System.out.println("Options Validated");
	}
}
