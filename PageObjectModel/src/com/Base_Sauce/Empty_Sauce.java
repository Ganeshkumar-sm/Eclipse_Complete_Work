package com.Base_Sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_Sauce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// Login Page
		
		WebElement uname = driver.findElement(By.id("user-name"));
		
		uname.sendKeys("problem_user");
		
		WebElement pword = driver.findElement(By.id("password"));
		
		pword.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		// Product Select
		
		driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
		
		driver.findElement(By.xpath("//button[.='Add to cart']")).click();
					
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
				
		String label = driver.findElement(By.xpath("//span[.='Your Cart']")).getText();
		
		System.out.println("Cart Label Verified "+label);
		
		driver.findElement(By.id("checkout")).click();
		
		//CHECKOUT PAGE
		
		String checkoutlabel = driver.findElement(By.xpath("//span[@class='title']")).getText();
		
		System.out.println("Cart Label Verified "+checkoutlabel);
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ganeshkumar");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Soundharapandiyan");
				
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("625007");
		
		driver.findElement(By.id("continue")).click();
		
	}

}
