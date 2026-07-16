package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomobilePage extends ProjectSpecificMethods {

	public AutomobilePage clickAutomobileInHeader() {
		click(locateElement("nav_automobile"));
		reportStep("Click Automobile In Header", "pass");
		return this;
	}

	public AutomobilePage selectMake(String make) {
		selectDropDownUsingText(locateElement("make"), make);
		reportStep("Select Make", "pass");
		return this;
	}

	public AutomobilePage enterEnginePerformance(String enginePerformance) {
		type(locateElement("engineperformance"), enginePerformance);
		reportStep("Enter Engine Performance", "pass");
		return this;
	}

	public AutomobilePage enterDateOfManufacture(String dateOfManufacture) {
		type(locateElement("dateofmanufacture"), dateOfManufacture);
		reportStep("Enter Date Of Manufacture", "pass");
		return this;
	}

	public AutomobilePage selectNumberOfSeats(String numberOfSeats) {
		selectDropDownUsingText(locateElement("numberofseats"), numberOfSeats);
		reportStep("Select Number Of Seats", "pass");
		return this;
	}

	public AutomobilePage selectFuelType(String fuelType) {
		selectDropDownUsingText(locateElement("fuel"), fuelType);
		reportStep("Select Fuel Type", "pass");
		return this;
	}

	public AutomobilePage enterListPrice(String listPrice) {
		type(locateElement("listprice"), listPrice);
		reportStep("Enter List Price", "pass");
		return this;
	}

	public AutomobilePage enterLicensePlateNumber(String licensePlateNumber) {
		type(locateElement("licenseplatenumber"), licensePlateNumber);
		reportStep("Enter License Plate Number", "pass");
		return this;
	}

	public AutomobilePage enterAnnualMileage(String annualMileage) {
		type(locateElement("annualmileage"), annualMileage);
		reportStep("Enter Annual Mileage", "pass");
		return this;
	}

	public AutomobilePage clickNext() {
		click(locateElement("Next"));
		reportStep("Click Next", "pass");
		return this;
	}
}
