package com.Runner_Pak;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base_Pak.Login_Class;

@SuppressWarnings("unused")
public class Execution_Class {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\PageFactoryDemo\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Login_Class ll = new Login_Class(driver);
		ll.fn_uName("Admin");
		ll.fn_passWrd("admin123");
		ll.fn_login();

	}

}
