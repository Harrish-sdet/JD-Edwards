package com.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.qa.pages.LoginPage;

public class TC003_SalesOrder extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "VerifySalesOrder";
		testDescription = "Verify Sales Order";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "Login";
	}

	@Test(dataProvider = "fetchData")
	public void runOrder(String userName, String password) {
		new LoginPage()
				.enterUsername(userName)
				.enterPassword(password)
				.clickSignIn()
				.clickNavigator()
				.clickEnterpriseOneMenus()
				.clickOrderManagement()
				.clickSalesOrderManagement()
				.clickDailySalesProcessing()
				.clickOrderProcessing()
				.clickOrderHeader();
	}
}
