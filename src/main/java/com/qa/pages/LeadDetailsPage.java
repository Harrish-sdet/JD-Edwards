package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class LeadDetailsPage extends ProjectSpecificMethods {

	public void verifyCompanyName(String expectedCompanyName) {
		verifyExactText(locateElement(Locators.XPATH, "//span[normalize-space()='Company Name']"), expectedCompanyName);
		reportStep("Verify Company Name", "pass");
	}
}
