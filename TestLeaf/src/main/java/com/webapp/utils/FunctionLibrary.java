package com.webapp.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionLibrary {

	Properties pro;
	WebDriver driver;

	public FunctionLibrary() {

		try {
			pro.load(new FileInputStream("./src/main/java/com/webapp/confi/configuration.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void launchBrowser() {

		String prop = pro.getProperty("browser");

		if (prop.toUpperCase().equals("CHROME")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (prop.toUpperCase().equals("IE")) {

			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

		}

		else {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}
		
		driver.get(pro.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtility.Browser_Load));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TimeUtility.Page_Load));
		

	}

}
