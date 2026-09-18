package com.qa.testcases;

import org.testng.annotations.Test;
import com.qa.pages.LoginPage;
import com.qa.pages.HomePage;
import com.qa.pages.LeadsPage;
import com.qa.pages.CreateLeadPage;
import com.qa.pages.LeadDetailsPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class NewLeadSuccessfullyTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Create a new lead successfully";
		testDescription = "Create a new lead successfully";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "NewLeadSuccessfully";
	}

	// TODO: data-driven test — add one row to this framework's Excel data source
	// (see excelFileName above) with header row: username, password, companyName, forename, surname, departmentName, emailAddress, expectedCompanyName
	// Values captured from this scenario: "DemoCSR2", "crmsfa", "Birlasoft", "Anil", "Kumar", "Agentic AI Developer", "Test-AI@demo.com", "Birlasoft"
	@Test(dataProvider = "fetchData")
	public void verifyNavigationToLeadDetails(String username, String password, String companyName, String forename, String surname, String departmentName, String emailAddress, String expectedCompanyName) {
			new LoginPage()
				.enterUsername(username)
				.enterPassword(password)
				.clickSignIn();
			new HomePage()
				.clickCrmSfaImageLink()
				.clickLeadsMenu();
			new LeadsPage()
				.clickCreateLeadLink();
			new CreateLeadPage()
				.enterCompanyName(companyName)
				.enterForename(forename)
				.enterSurname(surname)
				.enterDepartmentName(departmentName)
				.enterEmailAddress(emailAddress)
				.clickCreateLeadButton();
			new LeadDetailsPage()
				.verifyCompanyName(expectedCompanyName);
	}
}
