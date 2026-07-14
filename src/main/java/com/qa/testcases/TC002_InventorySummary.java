package com.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.qa.pages.LoginPage;

public class TC002_InventorySummary extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Verify Inventory Summary";
		testDescription = "Verify Inventory Summary";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "Login";
	}

	@Test(dataProvider = "fetchData")
	public void runInventorySummary(String userName, String password) {
		new LoginPage()
				.enterUsername(userName)
				.enterPassword(password)
				.clickSignIn()
				.clickNavigator()
				.clickEnterpriseOneMenus()
				.clickLogisticsManagement()
				.clickInventoryManagement()
				.clickDailyProcessing()
				.clickInquiries()
				.clickSummary()
				.verifyLogin();
	}
}
