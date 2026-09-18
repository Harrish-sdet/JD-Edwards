package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class CreateLeadPage extends ProjectSpecificMethods {

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

	public CreateLeadPage enterSurname(String surname) {
		type(locateElement("createLeadForm_lastName"), surname);
		reportStep("Enter Surname", "pass");
		return this;
	}

	public CreateLeadPage enterDepartmentName(String departmentName) {
		type(locateElement("createLeadForm_departmentName"), departmentName);
		reportStep("Enter Department Name", "pass");
		return this;
	}

	public CreateLeadPage enterEmailAddress(String emailAddress) {
		type(locateElement("createLeadForm_primaryEmail"), emailAddress);
		reportStep("Enter Email Address", "pass");
		return this;
	}

	public CreateLeadPage clickCreateLeadButton() {
		click(locateElement(Locators.XPATH, "//input[@name='submitButton']"));
		reportStep("Click Create Lead Button", "pass");
		return this;
	}
}
