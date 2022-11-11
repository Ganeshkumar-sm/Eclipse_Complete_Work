package com.functionalLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionSetup {

	static String browser = "chrome";
	public static WebDriver driver;

	public void launchBrowser() {
		if (browser.toUpperCase().equals("CHROME")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.toUpperCase().equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else if (browser.toUpperCase().equals("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USERi\\eclipse-workspace\\TestLeaf_Individual\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

		}

	}

	public void launchUrl(String url) {

		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

	}

}
