package com.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.qa.pages.LoginPage;

/**
 * Sample test case demonstrating how to wire a data-driven test using the
 * reusable framework.
 *
 * How it works:
 *  - {@code setValues()} sets the metadata used by the Extent report and the
 *    name of the Excel file (in /data) that feeds the data provider.
 *  - The {@code @Test} method receives one row of Excel data per invocation
 *    via the inherited "fetchData" data provider, then drives the page objects.
 *
 * Copy this class as the starting point for new tests.
 */
public class TC001_VerifyLogin extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogin";
		testDescription = "Verify login with valid credentials lands on the Products page";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "Login";
	}

	@Test(dataProvider = "fetchData")
	public void verifyLogin(String userName, String password) {
		new LoginPage()
				.enterUsername(userName)
				.enterPassword(password)
				.clickSignIn()
				.verifyLogin();
	}
}
