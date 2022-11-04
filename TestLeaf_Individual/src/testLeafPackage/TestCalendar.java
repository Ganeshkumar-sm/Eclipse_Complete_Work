package testLeafPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCalendar {
	WebDriver driver;

	public TestCalendar(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h5[.='Calendar']")
	WebElement iconclick;
	@FindBy(xpath = "//input[@id='datepicker']")
	WebElement calenele;
	@FindBy(xpath = "//a[@data-handler='prev']")
	WebElement prev;
	@FindBy(xpath = "//a[@data-handler='next']")
	WebElement next;
	@FindBy(xpath = "/html/body/div[2]//child::table//child::tbody/tr[2]/td[5]")
	WebElement date;

	public void calendarIcon() {
		iconclick.click();

	}

	public void calendarField() {
		calenele.click();
		
		date.click();
		System.out.println("Date Selected");
		driver.navigate().back();

	}
}
