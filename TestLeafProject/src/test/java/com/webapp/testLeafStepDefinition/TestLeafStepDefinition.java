package com.webapp.testLeafStepDefinition;

import org.openqa.selenium.WebDriver;

import com.webapp.testLeafClass.TestLeafAlert;
import com.webapp.testLeafClass.TestLeafButton;
import com.webapp.testLeafClass.TestLeafCalendar;
import com.webapp.testLeafClass.TestLeafCheckbox;
import com.webapp.testLeafClass.TestLeafDropDown;
import com.webapp.testLeafClass.TestLeafEdit;
import com.webapp.testLeafClass.TestLeafFrame;
import com.webapp.testLeafClass.TestLeafHyperlink;
import com.webapp.testLeafClass.TestLeafImage;
import com.webapp.testLeafClass.TestLeafRadioButton;
import com.webapp.testLeafClass.TestLeafTable;
import com.webapp.testLeafClass.TestLeafWindow;
import com.webapp.testLeafUtils.FunctionLibrary;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class TestLeafStepDefinition extends FunctionLibrary {

	TestLeafAlert alert;
	TestLeafButton button;
	TestLeafCalendar calendar;
	TestLeafCheckbox checkbox;
	TestLeafDropDown dropdown;
	TestLeafEdit edit;
	TestLeafFrame frame;
	TestLeafHyperlink hyperlink;
	TestLeafImage image;
	TestLeafRadioButton radio;
	TestLeafTable table;
	TestLeafWindow window;

	@Given("^User Launch the Preffered Browser$")
	public void user_Launch_the_Preffered_Browser() {
		FunctionLibrary.launchBrowser();
	}

	@Then("^User get into the URL$")
	public void user_get_into_the_URL() {
		FunctionLibrary.getIntoUrl();
	}

	@Given("^User Clicks the Alert icon$")
	public void user_Clicks_the_Alert_icon() {

		alert.landingPage();
	}

	@When("^User Complete All the Task in the Alert Page$")
	public void user_Complete_All_the_Task_in_the_Alert_Page() {
		alert.simpleAlert();
		alert.confirmAlert();
		alert.promptAlert();
		alert.lineBreaks();
	}

	@Then("^User Return to the Homepage from the Alert Page$")
	public void user_Return_to_the_Homepage_from_the_Alert_Page() {
		alert.returnHomepage();
	}

	@Given("^User Clicks the button icon$")
	public void user_Clicks_the_button_icon() {
		button.buttonIcon();
	}

	@When("^User Complete All the Task in the button Page$")
	public void user_Complete_All_the_Task_in_the_button_Page() {
		button.homePageButton();
		button.positionButton();
		button.colorButton();
		button.sizeButton();
	}

	@Then("^User Return to the Homepage from the button Page$")
	public void user_Return_to_the_Homepage_from_the_button_Page() {
		button.returnHomepage();
	}

	@Given("^User Clicks the Calendar icon$")
	public void user_Clicks_the_Calendar_icon() {
		calendar.calendarIcon();
	}

	@When("^User Complete All the Task in the Calendar Page$")
	public void user_Complete_All_the_Task_in_the_Calendar_Page() {
		calendar.calendarField();
	}

	@Then("^User Return to the Homepage from the Calendar Page$")
	public void user_Return_to_the_Homepage_from_the_Calendar_Page() {
		calendar.returnHomepage();
	}

	@Given("^User Clicks the Checkbox icon$")
	public void user_Clicks_the_Checkbox_icon() {
		checkbox.chechBoxIcon();
	}

	@When("^User Complete All the Task in the Checkbox Page$")
	public void user_Complete_All_the_Task_in_the_Checkbox_Page() {
		checkbox.selectKnownLanguages();
		checkbox.confirmSelenium();
		checkbox.deselectTheSelected();
		checkbox.selectAll();
	}

	@Then("^User Return to the Homepage from the Checkbox Page$")
	public void user_Return_to_the_Homepage_from_the_Checkbox_Page() {
		checkbox.returnHomepage();
	}

	@Given("^User Clicks the Dropdown icon$")
	public void user_Clicks_the_Dropdown_icon() {
		dropdown.dropDownIcon();
	}

	@When("^User Complete All the Task in the Dropdown Page$")
	public void user_Complete_All_the_Task_in_the_Dropdown_Page() {
		dropdown.usingIndex();
		dropdown.usingText();
		dropdown.usingValue();
		dropdown.noOfOptions();
		dropdown.usingSendkeys();
		dropdown.usingAny();

	}

	@Then("^User Return to the Homepage from the Dropdown Page$")
	public void user_Return_to_the_Homepage_from_the_Dropdown_Page() {
		dropdown.returnHomepage();
	}

	@Given("^User Clicks the Edit icon$")
	public void user_Clicks_the_Edit_icon() {
		edit.editIcon();

	}

	@When("^User Complete All the Task in the Edit Page$")
	public void user_Complete_All_the_Task_in_the_Edit_Page() {
		edit.emailAddress();
		edit.appendText();
		edit.getDefText();
		edit.clearText();
		edit.confirmField();
	}

	@Then("^User Return to the Homepage from the Edit Page$")
	public void user_Return_to_the_Homepage_from_the_Edit_Page() {
		edit.returnHomepage();
	}

	@Given("^User Clicks the Frame icon$")
	public void user_Clicks_the_Frame_icon() {
		frame.frameIcon();

	}

	@When("^User Complete All the Task in the Frame Page$")
	public void user_Complete_All_the_Task_in_the_Frame_Page() {
		frame.insideFrame();
		frame.insideNestedFrame();
		frame.noOfFrames();
	}

	@Then("^User Return to the Homepage from the Frame Page$")
	public void user_Return_to_the_Homepage_from_the_Frame_Page() {
		frame.returnHomepage();
	}

	@Given("^User Clicks the Hyperlink icon$")
	public void user_Clicks_the_Hyperlink_icon() {
		hyperlink.hyperLinkIcon();
	}

	@When("^User Complete All the Task in the Hyperlink Page$")
	public void user_Complete_All_the_Task_in_the_Hyperlink_Page() {
		hyperlink.headerNameVerifying();
		hyperlink.verifyingHomePageLink();
		hyperlink.verifyingFindThePage();
		hyperlink.verifyingBrokenPage();
		hyperlink.findingAllLinks();

	}

	@Then("^User Return to the Homepage from the Hyperlink Page$")
	public void user_Return_to_the_Homepage_from_the_Hyperlink_Page() {
		hyperlink.returnHomepage();
	}

	@Given("^User Clicks the Image icon$")
	public void user_Clicks_the_Image_icon() {
		image.clickImage();
	}

	@When("^User Complete All the Task in the Image Page$")
	public void user_Complete_All_the_Task_in_the_Image_Page() {
		image.homePageImage();

	}

	@Then("^User Return to the Homepage from the Image Page$")
	public void user_Return_to_the_Homepage_from_the_Image_Page() {
		image.clickUsingKeyboardOrMouse();
	}

	@Given("^User Clicks the RadioButton icon$")
	public void user_Clicks_the_RadioButton_icon() {
		radio.radioButtonIcon();

	}

	@When("^User Complete All the Task in the RadioButton Page$")
	public void user_Complete_All_the_Task_in_the_RadioButton_Page() {
		radio.enjoyingClass();
		radio.defaultSelectedButton();
		radio.selectOnlyChoiceWasnotSelected();
	}

	@Then("^User Return to the Homepage from the RadioButton Page$")
	public void user_Return_to_the_Homepage_from_the_RadioButton_Page() {
		radio.returnHomepage();
	}

	@Given("^User Clicks the Table icon$")
	public void user_Clicks_the_Table_icon() {
		table.tableIcon();
	}

	@When("^User Complete All the Task in the Table Page$")
	public void user_Complete_All_the_Task_in_the_Table_Page() {
		table.noOfColumns();
		table.noOfRows();
		table.getValue();
		table.clickCheckBox();
	}

	@Then("^User Return to the Homepage from the Table Page$")
	public void user_Return_to_the_Homepage_from_the_Table_Page() {
		table.returnHomepage();
	}

	@Given("^User Clicks the Window icon$")
	public void user_Clicks_the_Window_icon() {
		window.windowIcon();
	}

	@When("^User Complete All the Task in the Window Page$")
	public void user_Complete_All_the_Task_in_the_Window_Page() {
		window.openHomePage();
		window.openMultipleWindow();
		window.doNotCloseMe();
		window.waitForFiveSeconds();
	}

	@Then("^User Return to the Homepage from the Window Page$")
	public void user_Return_to_the_Homepage_from_the_Window_Page() {
		window.returnHomepage();
	}

}
