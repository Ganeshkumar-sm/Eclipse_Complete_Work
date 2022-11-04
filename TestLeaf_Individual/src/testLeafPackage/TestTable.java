package testLeafPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TestTable {
	WebDriver driver;

	public TestTable(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h5[.='Table']")
	WebElement tbleIcon;

	@FindBys(@FindBy(xpath = "//section[@class='innerblock']/div[1]/table/tbody/tr[2]/td"))
	List<WebElement> column;

	@FindBys(@FindBy(xpath = "//section[@class='innerblock']/div[1]/table/tbody/tr"))
	List<WebElement> rows;

	@FindBy(xpath = "//section[@class='innerblock']/div[1]/table/tbody/tr[3]/td[2]")
	WebElement getvalue;

	@FindBys(@FindBy(xpath = "//section[@class='innerblock']/div[1]/table/tbody/tr/td[2]"))
	List<WebElement> chkbox;

	public void tableIcon() {

		tbleIcon.click();

	}

	public void noOfColumns() {

		int noColumn = column.size();

		System.out.println("No Of Columns: " + noColumn);
	}

	public void noOfRows() {

		int noRow = rows.size();

		System.out.println("No Of Rows: " + noRow);
	}

	public void getValue() {

		String text = getvalue.getText();

		System.out.println("Progress Value: " + text);
	}

	public void clickCheckBox() {
		for (WebElement webElement : rows) {
			String text = webElement.getText();
			System.out.println(text);
			if (text.contains("20")) {
				WebElement cc = driver
						.findElement(By.xpath("//section[@class='innerblock']/div[1]/table/tbody/tr[4]/td[3]"));
				cc.click();
			}

		}
		driver.navigate().back();
	}

}