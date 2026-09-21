package com.qa.testcases;

import org.testng.annotations.Test;
import com.qa.pages.AutomobilePage;
import com.qa.pages.InsurantDataPage;
import com.framework.testng.api.base.ProjectSpecificMethods;
import org.testng.annotations.BeforeTest;

public class AutomobileInsuranceVehicleDetailsTest extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Verify Automobile Insurance vehicle details";
		testDescription = "Verify Automobile Insurance vehicle details";
		authors = "QA Team";
		category = "Smoke";
		excelFileName = "AutomobileInsuranceVehicleDetails";
	}

	// TODO: data-driven test — add one row to this framework's Excel data source
	// (see excelFileName above) with header row: make, enginePerformance, dateOfManufacture, numberOfSeats, fuelType, listPrice, licensePlateNumber, annualMileage, expectedTitle
	// Values captured from this scenario: "Audi", "120", "07/10/2026", "4", "Diesel", "30000", "ABC123", "10000", "Enter Insurant Data"
	@Test(dataProvider = "fetchData")
	public void verifyNavigationToInsurantData(String make, String enginePerformance, String dateOfManufacture, String numberOfSeats, String fuelType, String listPrice, String licensePlateNumber, String annualMileage, String expectedTitle) {
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
				.verifyPageTitle(expectedTitle);
	}
}
