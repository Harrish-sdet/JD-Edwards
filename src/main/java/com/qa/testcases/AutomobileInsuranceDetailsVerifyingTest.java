package com.qa.testcases;

import org.testng.annotations.Test;
import com.qa.pages.VehicleDataPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class AutomobileInsuranceDetailsVerifyingTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Automobile Insurance details verifying";
		testDescription = "Automobile Insurance details verifying";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "Login";
	}

	@Test
	public void generatedTest() {
			new VehicleDataPage()
				.clickAutomobileHeader("Click Automobile Header", "Click Automobile Header should succeed")
				.selectMake("Select Make", "Select Make should succeed", "Audi")
				.verifySelectedMake("Verify Selected Make", "Verify Selected Make should succeed", "Audi");
	}
}
