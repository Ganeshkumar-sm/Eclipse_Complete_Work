package testLeafPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestEdit  {

	WebDriver driver;
	Properties property;

	public TestEdit(WebDriver driver) {
		this.driver = driver;
		
		property = new Properties();

		try {
			property.load(new FileReader("./Data Reader/Data.properties"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@FindBy(how = How.XPATH, using = "//h5[.='Edit']")
	WebElement edticn;

	@FindBy(id = "email")
	WebElement entertab;

	@FindBy(xpath = "//input[@value='Append ']")
	WebElement apptab;

	@FindBy(xpath = "//input[@value='TestLeaf']")
	WebElement gettxttab;

	@FindBy(xpath = "//input[@value='Clear me!!']")
	WebElement clmetab;

	@FindBy(xpath = "//input[@disabled='true']")
	WebElement distab;

	public void editIcon() {

		edticn.click();
	}

	public void emailAddress() {

		entertab.sendKeys(property.getProperty("editemailid"));
		
		System.out.println("Entered E-Mail Id: "+ property.getProperty("editemailid"));
	}

	public void appendText() {

		apptab.sendKeys(property.getProperty("editappend"));
		
		System.out.println("Entered Text: "+ property.getProperty("editappend"));

		
	}

	public void getDefText() {

		
		String attribute = gettxttab.getAttribute("value");
		
		System.out.println("Default Text = "+attribute);

	}

	public void clearText() {

		clmetab.clear();

	}

	public void confirmField() {

		boolean enabled = distab.isEnabled();

		System.out.println("isEnabled: "+enabled);

		if (enabled == true) {

			System.out.println("Edit Fiels is Enabled");
		} else {
			System.out.println("Edit Fiels is Disabled");
		}
		
		driver.navigate().back();

	}

}
