package com.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.qa.pages.LoginPage;

public class TC005_PickSlipPrint extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Print Pick Slip";
		testDescription = "Verify user can able to Print Pick Slip";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "PickSlip";
	}

	@Test(dataProvider = "fetchData")
	public void runPickSlip(String userName, String password,String version, String LeftOperand, String comparision,String rightOperand, String literal) {
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
				.clickPickSlip()
				.enterVersion(version)
				.selectCheckbox()
				.clickSelect()
				.clickDataSelection()
				.clickSubmit()
				.selectLeftOpereand(LeftOperand)
				.selectComparision(comparision)
				.selectRightOperannd(rightOperand)
				.enterLiteralValue(literal)
				.selectLiteral();
	}
}
