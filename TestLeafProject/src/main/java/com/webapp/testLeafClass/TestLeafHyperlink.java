package com.webapp.testLeafClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapp.testLeafUtils.FunctionLibrary;

public class TestLeafHyperlink extends FunctionLibrary{

	public TestLeafHyperlink() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[.='HyperLink']")
	WebElement hyplnk;
	@FindBy(xpath = "//h1[@itemprop='name']")
	WebElement ttl;;
	@FindBy(how = How.XPATH, using = "(//a[.='Go to Home Page'])[1]")
	WebElement hmpge1;
	@FindBy(xpath = "//a[contains(text(),'Find where')]")
	WebElement fndpge;
	@FindBy(xpath = "//a[contains(text(),'Verify')]")
	WebElement brknlnk;
	@FindBy(xpath = "(//a[.='Go to Home Page'])[2]")
	WebElement hmpge2;
	@FindBys(@FindBy(xpath = "//section[@class='innerblock']//a"))
	List<WebElement> nuoflnk;

	public void hyperLinkIcon() {

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current Page URL: " + currentUrl);

		hyplnk.click();

	}

	public void headerNameVerifying() {

		String header = ttl.getText();
		System.out.print(header + ":");

		if (header.equals("Play with HyperLinks")) {

			System.out.println(" Header Name Verified");
		} else {
			System.out.println("Manually Verified Check Code Again");
		}

	}

	public void verifyingHomePageLink() {

		String attribute = hmpge1.getAttribute("href");
		System.out.println("Link of the 'Go To Home Page': " + attribute);

		if (attribute.contains("home.html")) {
			System.out.println("'Go To Home Page' Link Verified");
		} else {
			System.out.println("Need to Check");
		}

	}

	public void verifyingFindThePage() {

		String linkurl = fndpge.getAttribute("href");
		fndpge.click();

		String btnurl = driver.getCurrentUrl();

		driver.navigate().back();

		if (btnurl.contains(linkurl)) {
			System.out.println("Redirecting Page Verified");
		} else {
			System.out.println("Check the Code Again");
		}

	}

	public void verifyingBrokenPage() {

		String brk = brknlnk.getAttribute("href");
		if (brk.contains("error")) {
			System.out.println("Page is Broken");
		} else {
			System.out.println("Check the Code Again");
		}
	}

	public void findingAllLinks() {
		int link = 0;
		for (WebElement webElement : nuoflnk) {
			webElement.getTagName();

			link++;
		}

		System.out.println("No Of Links = " + link);
		
	}
	public void returnHomepage() {
		driver.navigate().back();

	}
}
