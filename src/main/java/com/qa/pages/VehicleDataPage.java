package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VehicleDataPage extends ProjectSpecificMethods {

	public VehicleDataPage clickAutomobileHeader(String stepDescription, String expectedResult) {
		click(locateElement("//*[@id='nav_automobile']"));
		reportStep(stepDescription, expectedResult);
		return this;
	}

	public VehicleDataPage selectMake(String stepDescription, String expectedResult, String make) {
		selectDropDownUsingText(locateElement("//*[@id='make']"), make);
		reportStep(stepDescription, expectedResult);
		return this;
	}

	public void verifySelectedMake(String stepDescription, String expectedResult, String expectedMake) {
		verifyExactText(locateElement("Make"), expectedMake);
		reportStep(stepDescription, expectedResult);
	}
}
