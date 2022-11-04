package testLeafPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {
	WebDriver driver;
	Select slt;

	public TestDropDown(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h5[.='Drop down']")
	WebElement icnclk;
	@FindBy(xpath = "//select[@id='dropdown1']")
	WebElement dd1;
	@FindBy(xpath = "//select[@name='dropdown2']")
	WebElement dd2;
	@FindBy(xpath = "//select[@id='dropdown3']")
	WebElement dd3;
	@FindBy(xpath = "//select[@class='dropdown']")
	WebElement dd4;
	@FindBy(xpath = "//div[@class='example'][5]/select")
	WebElement dd5;
	@FindBy(xpath = "//div[@class='example'][6]/select")
	WebElement dd6;

	@FindBys(@FindBy(xpath = "//select[@class='dropdown']/option"))
	List<WebElement> dd7;

	public void dropDownIcon() {
		icnclk.click();
	}

	public void usingIndex() {
		slt = new Select(dd1);
		slt.selectByIndex(1);

	}

	public void usingText() {
		slt = new Select(dd2);
		slt.selectByVisibleText("UFT/QTP");
	}

	public void usingValue() {
		slt = new Select(dd3);
		slt.selectByValue("4");
	}

	public void noOfOptions() {
		int count = 0;
		slt = new Select(dd4);
		List<WebElement> options = slt.getOptions();
		int size = options.size();
		System.out.println("No of Options : " + size);

		for (WebElement webElement : dd7) {
			String text = webElement.getText();

			System.out.println(++count + ") " + text);
		}
	}

	public void usingSendkeys() {
		
	slt = new Select(dd5);
		dd5.sendKeys("Loadrunner");
		//dd5.submit();
	}

	public void usingAny() {
		slt = new Select(dd6);
		slt.selectByVisibleText("Loadrunner");
		driver.navigate().back();
	}
}
