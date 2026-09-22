package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage clickCreateLeadLink() {
		click(locateElement(Locators.XPATH, "//a[normalize-space()='Create Lead']"));
		reportStep("Click Create Lead Link", "pass");
		return this;
	}

	public CreateLeadPage enterCompanyName(String companyName) {
		type(locateElement("createLeadForm_companyName"), companyName);
		reportStep("Enter Company Name", "pass");
		return this;
	}

	public CreateLeadPage enterForename(String forename) {
		type(locateElement("createLeadForm_firstName"), forename);
		reportStep("Enter Forename", "pass");
		return this;
	}
}
