package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InsurantDataPage extends ProjectSpecificMethods {

	public void verifyPageTitle(String expectedTitle) {
		verifyTitle(expectedTitle);
		reportStep("Verify Page Title", "pass");
	}
}
