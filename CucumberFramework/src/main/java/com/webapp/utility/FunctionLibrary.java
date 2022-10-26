package com.webapp.utility;

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

	static Properties prop;
	static WebDriver driver;

	public FunctionLibrary() {
		prop = new Properties();

		try {
			prop.load(new FileInputStream("./src/main/java/com.webapp/config/config.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void launchBrowser() {

		String browse = prop.getProperty("browser");

		if (browse.toUpperCase().equals("CHROME")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browse.toUpperCase().equals("IE")) {
			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

		} else {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.TIME_IMPLICIT_WAIT));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUtils.TIME_PAGE_WAIT));

	}
}
