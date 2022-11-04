package testLeafPackage;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TestRadioButton {
	WebDriver driver;

	public TestRadioButton(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h5[.='Radio Button']")
	WebElement rdoicon;
	@FindBy(id = "yes")
	WebElement ency;
	@FindBy(id = "no")
	WebElement encn;
	@FindBys(@FindBy(xpath = "//label[contains(text(),'Are you')]//following-sibling::input"))
	List<WebElement> enclss;
	@FindBys(@FindBy(xpath = "//label[contains(text(),'Find default')]//following-sibling::input"))
	List<WebElement> check;
	@FindBy(xpath = "//label[contains(text(),'Select your')]//following-sibling::input[2]")
	WebElement agegroup;

	public void radioButtonIcon() {
		rdoicon.click();

	}

	public void enjoyingClass() {

		/*
		 * String sty = "yes"; String stn = "no"; Scanner scan = new Scanner(System.in);
		 * System.out.println("Type Yes or No"); String nextLine = scan.nextLine(); if
		 * (nextLine.equals(sty)) {
		 */
		ency.click();

		/*
		 * }else { encn.click(); }
		 */

	}

	public void defaultSelectedButton() {
		int count = 1;

		for (WebElement webElement : check) {
			
			if (webElement.isSelected()) {
				System.out.println(count + " Element is Selected");
			} else if (!webElement.isSelected()) {
				System.out.println(count + " Element is  not Selected");
			}
			count++;

		}count =1;

		for (WebElement webElement : check) {
			boolean selected = webElement.isSelected();
			if (selected == true) {
				System.out.println(count + " Element is Selected");
			}
			count++;
		
		}

	}

	public void selectOnlyChoiceWasnotSelected() {

		if (agegroup.isSelected()) {
			System.out.println("Button is Already Selected");
		} else {
			agegroup.click();
		}
		driver.navigate().back();
	}

}
