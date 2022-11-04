package testLeafPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestAlert {

	WebDriver driver;

	public TestAlert(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h5[text()='Alert']")
	WebElement alerticon;

	@FindBy(how = How.XPATH, using = "//button[text()='Alert Box']")
	WebElement alertbox;

	@FindBy(how = How.XPATH, using = "//button[text()='Confirm Box']")
	WebElement confmbox;

	@FindBy(how = How.XPATH, using = "//button[text()='Prompt Box']")
	WebElement prmptbox;

	@FindBy(how = How.XPATH, using = "//button[text()='Line Breaks?']")
	WebElement linebox;

	public void landingPage() {

		/* driver.findElement(By.xpath("//h5[text()='Alert']")).click(); */

		alerticon.click();

	}

	public void simpleAlert() {

		alertbox.click();

		Alert alert = driver.switchTo().alert();

		alert.accept();

	}

	public void confirmAlert() {

		confmbox.click();

		Alert alert = driver.switchTo().alert();

		alert.dismiss();

	}

	public void promptAlert() {

		prmptbox.click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("self");

		alert.accept();

	}

	public void lineBreaks() {

		linebox.click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		System.out.println(text);

		alert.accept();

		driver.navigate().back();

	}

}
