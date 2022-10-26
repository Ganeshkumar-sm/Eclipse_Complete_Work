package com.Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.LoginPage;

public class Execution_Page {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\PageObjectModelDemo\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginPage ln = PageFactory.initElements(driver, LoginPage.class);
		ln.uname("Admin");
		ln.pword("admin123");
		ln.login();

	}

}
