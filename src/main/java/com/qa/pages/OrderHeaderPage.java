package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class OrderHeaderPage extends ProjectSpecificMethods {

	public OrderHeaderPage verifyHeaderPage() {
		verifyTitle("Enter Orders Header - Sales Order Header");
		reportStep("Title verified", "pass");
		return this;
	}

	public OrderHeaderPage clickAdd() {
		pause(2000);
		switchToFrame("e1menuAppIframe");
		WebElement locateElement = locateElement(Locators.XPATH,"//img[@id='hc_Add']");
		clickUsingJs(locateElement);
		reportStep("Add icon clicked", "pass");
		return this;
	}
	public OrderHeaderPage enterBatch(String batch) {
		pause(1000);
		type(locateElement(Locators.XPATH, "//input[@title='Branch/Plant']"),batch);
		reportStep("Batch entered", "pass");
		return this;
	}

	public OrderHeaderPage enterSoldTo(String soldTo) {
		type(locateElement(Locators.XPATH, "//input[@title='Long Address Number']"),soldTo);
		reportStep("sold to entered", "pass");
		return this;
	}

	public OrderHeaderPage enterShipTo(String shipTo) {
		type(locateElement(Locators.XPATH, "//input[@title='Long Address Number-Shipto']"),shipTo);
		reportStep("shipto entered", "pass");
		return this;
	}
	
	public OrderHeaderPage enterRequestDate(String requestDate) {
		type(locateElement(Locators.XPATH, "//input[@title='Requested Date']"),requestDate);
		reportStep("request date entered", "pass");
		return this;
	}
	
	public OrderHeaderPage enterCustomerPO(String customerPO) {
		type(locateElement(Locators.XPATH, "//input[@title='Customer PO']"),customerPO);
		reportStep("customerPO entered", "pass");
		return this;
	}
	public OrderHeaderPage clickOk() {
		click(locateElement("hc_OK"));
		reportStep("ok clicked", "pass");
		return this;
	}

	
}
