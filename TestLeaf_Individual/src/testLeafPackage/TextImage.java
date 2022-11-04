package testLeafPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TextImage {
	WebDriver driver;

	public TextImage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//div[@id='content']//li[4]//a//h5")
	WebElement imgicon;
	@FindBy(xpath = "//label[contains(text(),'Click on this')]//following-sibling::img")
	WebElement hmpageimg;
	@FindBy(xpath = "//label[contains(text(),'Click me using')]//following-sibling::img")
	WebElement clkmeimg;

	public void clickImage() {
		imgicon.click();

	}

	public void homePageImage() {
		String attribute = hmpageimg.getAttribute("onclick");
		System.out.println(attribute);

		if (attribute.contains("home.html")) {
			System.out.println("Image Redirected to HomePage");
		} else {
			System.out.println("Need To Check");
		}

	}

	public void clickUsingKeyboardOrMouse() {
		Actions act = new Actions(driver);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		act.click(clkmeimg).build().perform();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		if (!currentUrl.equals(currentUrl2)) {
			System.out.println("Image Verified");
		} else {
			System.out.println("Need To Check");
		}
		
	}
}