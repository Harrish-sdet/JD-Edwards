package com.qa.testcases;

import org.testng.annotations.Test;
import com.qa.pages.LoginPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class NewLeadTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Create a new Lead";
		testDescription = "Create a new Lead";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "NewLead";
	}

	// TODO: data-driven test — add one row to this framework's Excel data source
	// (see excelFileName above) with header row: username
	// Values captured from this scenario: "dilipkumar.rajendran@testleaf.com"
	@Test(dataProvider = "fetchData")
	public void runNewLead(String username) {
			new LoginPage()
				.enterUsername(username)
				.clickSignIn();
	}
}
