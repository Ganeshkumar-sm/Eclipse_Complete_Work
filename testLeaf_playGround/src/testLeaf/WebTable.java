package testLeaf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\testLeaf_playGround\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		
		
	}

}
