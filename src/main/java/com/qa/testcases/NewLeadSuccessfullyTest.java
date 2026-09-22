package com.qa.testcases;

import org.testng.annotations.Test;
import com.qa.pages.LoginPage;
import com.qa.pages.HomePage;
import com.qa.pages.CreateLeadPage;
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
	// (see excelFileName above) with header row: username, password, companyName, forename
	// Values captured from this scenario: "DemoCSR2", "crmsfa", "Techno solutions", "John"
	@Test(dataProvider = "fetchData")
	public void runNewLeadSuccessfully(String username, String password, String companyName, String forename) {
			new LoginPage()
				.enterUsername(username)
				.enterPassword(password)
				.clickSignIn();
			new HomePage()
				.clickCrmSfaImageLink()
				.clickLeadsMenu();
			new CreateLeadPage()
				.clickCreateLeadLink()
				.enterCompanyName(companyName)
				.enterForename(forename);
	}
}
