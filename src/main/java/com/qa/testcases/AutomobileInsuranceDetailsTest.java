package com.qa.testcases;

import org.testng.annotations.Test;
import com.qa.pages.AutomobilePage;
import com.qa.pages.InsurantDataPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class AutomobileInsuranceDetailsTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Enter automobile insurance details and proceed to next page";
		testDescription = "Enter automobile insurance details and proceed to next page";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "AutomobileInsuranceDetails";
	}

	// TODO: data-driven test — add one row to this framework's Excel data source
	// (see excelFileName above) with header row: make, enginePerformance, dateOfManufacture, numberOfSeats, fuelType, listPrice, licensePlateNumber, annualMileage, expectedHeading
	// Values captured from this scenario: "Audi", "120", "07/10/2026", "4", "Diesel", "30000", "ABC123", "10000", "Enter Insurant Data"
	@Test(dataProvider = "fetchData")
	public void verifyNavigationToInsurantData(String make, String enginePerformance, String dateOfManufacture, String numberOfSeats, String fuelType, String listPrice, String licensePlateNumber, String annualMileage, String expectedHeading) {
			new AutomobilePage()
				.clickAutomobileInHeader()
				.selectMake(make)
				.enterEnginePerformance(enginePerformance)
				.enterDateOfManufacture(dateOfManufacture)
				.selectNumberOfSeats(numberOfSeats)
				.selectFuelType(fuelType)
				.enterListPrice(listPrice)
				.enterLicensePlateNumber(licensePlateNumber)
				.enterAnnualMileage(annualMileage)
				.clickNext();
			new InsurantDataPage()
				.verifyEnterInsurantDataVisible(expectedHeading);
	}
}
