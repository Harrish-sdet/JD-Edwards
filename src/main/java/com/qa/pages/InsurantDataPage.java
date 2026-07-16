package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InsurantDataPage extends ProjectSpecificMethods {

	public void verifyEnterInsurantDataVisible(String expectedHeading) {
		verifyExactText(locateElement("Enter Insurant Data"), expectedHeading);
		reportStep("Verify Enter Insurant Data Visible", "pass");
	}
}
