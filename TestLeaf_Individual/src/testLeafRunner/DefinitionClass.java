package testLeafRunner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import testLeafPackage.TestAlert;
import testLeafPackage.TestButton;
import testLeafPackage.TestCalendar;
import testLeafPackage.TestCheckbox;
import testLeafPackage.TestDropDown;
import testLeafPackage.TestEdit;
import testLeafPackage.TestFrame;
import testLeafPackage.TestHyperLink;
import testLeafPackage.TestRadioButton;
import testLeafPackage.TestTable;
import testLeafPackage.TestWindows;
import testLeafPackage.TextImage;

public class DefinitionClass {

	static Properties property;
	static WebDriver driver;

	public DefinitionClass() {

		property = new Properties();

		try {
			property.load(new FileReader("./Data Reader/Data.properties"));
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void launchBrowser() {

		String prop = property.getProperty("browser");

		if (prop.toUpperCase().equals("CHROME")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (prop.toUpperCase().equals("IE")) {

			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

		}

		else if (prop.toUpperCase().equals("FIREFOX")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}

		else {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USERi\\eclipse-workspace\\TestLeaf_Individual\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		driver.get(property.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {

		DefinitionClass dc = new DefinitionClass();
		dc.launchBrowser();

		TestAlert initElements = PageFactory.initElements(driver, TestAlert.class);
		System.out.println("\nALERT FUNCTION:");
		initElements.landingPage();
		initElements.simpleAlert();
		initElements.confirmAlert();
		initElements.promptAlert();
		initElements.lineBreaks();

		TestEdit initElements2 = PageFactory.initElements(driver, TestEdit.class);
		System.out.println("\nEDIT FUNCTION:");
		initElements2.editIcon();
		initElements2.emailAddress();
		initElements2.appendText();
		initElements2.getDefText();
		initElements2.clearText();
		initElements2.confirmField();
		
		TestHyperLink initElements3 = PageFactory.initElements(driver, TestHyperLink.class);
		System.out.println("\nHYPERLINK FUNCTION:");
		initElements3.hyperLinkIcon();
		initElements3.headerNameVerifying();
		initElements3.verifyingHomePageLink();
		initElements3.verifyingFindThePage();
		initElements3.verifyingBrokenPage();
		initElements3.findingAllLinks();
		
		TestButton initElements4 = PageFactory.initElements(driver, TestButton.class);
		System.out.println("\nBUTTON FUNCTION:");
		initElements4.buttonIcon();
		initElements4.homePageButton();
		initElements4.positionButton();
		initElements4.colorButton();
		initElements4.sizeButton();
		
		TextImage initElements5 = PageFactory.initElements(driver, TextImage.class);
		System.out.println("\nIMAGE FUNCTION:");
		initElements5.clickImage();
		initElements5.homePageImage();
		initElements5.clickUsingKeyboardOrMouse();
		
		TestDropDown initElements6 = PageFactory.initElements(driver, TestDropDown.class);
		System.out.println("\nDROP DOWN FUNCTION:");
		initElements6.dropDownIcon();
		initElements6.usingIndex();
		initElements6.usingText();
		initElements6.usingValue();
		initElements6.noOfOptions();
		initElements6.usingSendkeys();
		initElements6.usingAny();
		
		TestRadioButton initElements7 = PageFactory.initElements(driver, TestRadioButton.class);
		System.out.println("\nRADIO BUTTON FUNCTION:");
		initElements7.radioButtonIcon();
		initElements7.enjoyingClass();
		initElements7.defaultSelectedButton();
		initElements7.selectOnlyChoiceWasnotSelected();
		
		TestCheckbox initElements8 = PageFactory.initElements(driver, TestCheckbox.class);
		System.out.println("\nCHECKBOX FUNCTION:");
		initElements8.chechBoxIcon();
		initElements8.selectKnownLanguages();
		initElements8.confirmSelenium();
		initElements8.deselectTheSelected();
		initElements8.selectAll();
		
		TestFrame initElements9 = PageFactory.initElements(driver, TestFrame.class);
		System.out.println("\nFRAME FUNCTION:");
		initElements9.frameIcon();
		initElements9.insideFrame();
		initElements9.insideNestedFrame();
		initElements9.noOfFrames();
		
		TestTable initElements10 = PageFactory.initElements(driver, TestTable.class);
		System.out.println("\nTABLE FUNCTION:");
		initElements10.tableIcon();
		initElements10.noOfColumns();
		initElements10.noOfRows();
		initElements10.getValue();
		initElements10.clickCheckBox();
		
		TestWindows initElements11 = PageFactory.initElements(driver, TestWindows.class);
		System.out.println("\nWINDOW FUNCTION:");
		initElements11.windowIcon();
		initElements11.openHomePage();
		initElements11.openMultipleWindow();
		initElements11.doNotCloseMe();
		initElements11.waitForFiveSeconds();
		
		TestCalendar initElements12 = PageFactory.initElements(driver, TestCalendar.class);
		System.out.println("\nCALENDAR FUNCTION:");
		initElements12.calendarIcon();
		initElements12.calendarField();
		
		
		

	}
}
