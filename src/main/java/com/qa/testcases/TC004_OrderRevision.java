package com.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.qa.pages.LoginPage;

public class TC004_OrderRevision extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "OrderRevision";
		testDescription = "Verify Order Revision";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "OrderHeader";
	}

	@Test(dataProvider = "fetchData")
	public void verifyLogin(String userName, String password,String batch, String soldTo, String shipTo,String requestDate, String customerPO) {
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
				.clickOrderHeader()
				.clickAdd()
				.enterBatch(batch)
				.enterSoldTo(soldTo)
				.enterShipTo(soldTo)
				.enterRequestDate(requestDate)
				.enterCustomerPO(customerPO)
				.clickOk();
	}
}
