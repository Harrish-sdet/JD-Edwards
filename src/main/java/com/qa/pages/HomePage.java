package com.qa.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

/**
 * Sample Page Object for the products/inventory screen of the demo application
 * (https://www.saucedemo.com/) shown after a successful login.
 *
 * Demonstrates verification and read style helpers from the reusable layer.
 */
public class HomePage extends ProjectSpecificMethods {

	 public HomePage verifyLogin() {
		 	verifyTitle("JD Edwards EnterpriseOne");
		 	reportStep("Title verified", "pass");
	        return this;
	    }
	 
	 public HomePage clickNavigator() {
	        click(locateElement("drop_mainmenuParent"));
	        reportStep("Navigator clicked", "pass");
	        return this;
	    }

	    // 2. Click EnterpriseOne Menus
	    public HomePage clickEnterpriseOneMenus() {
	        click(locateElement(Locators.XPATH, "//span[text()='EnterpriseOne Menus']"));
	        reportStep("Enterprise one clicked", "pass");
	        return this;
	    }

	    public HomePage clickLogisticsManagement() {
	    	pause(2000);
	        click(locateElement(Locators.XPATH, "//span[text()='Logistics Management']"));
	        reportStep("Logistics Management Clicked", "pass");
	        return this;
	    }

	    public HomePage clickOrderManagement() {
	        click(locateElement(Locators.XPATH, "//span[text()='Order Management']"));
	        reportStep("Clicked OrderManagement", "pass");
	        return this;
	    }

	    // 4. Click Inventory Management
	    public HomePage clickInventoryManagement() {
	        click(locateElement(Locators.XPATH, "//span[text()='Inventory Management']"));
	        reportStep("Clicked Inventory Management", "pass");
	        return this;
	    }
	    
	    public HomePage clickSalesOrderManagement() {
	    	pause(1000);
	        click(locateElement(Locators.XPATH, "//span[text()='Sales Order Management']"));
	        reportStep("Clicked sales order management", "pass");
	        return this;
	    }

	    // 5. Click Daily Processing
	    public HomePage clickDailyProcessing() {
	    	
	        click(locateElement(Locators.XPATH, "//span[text()='Daily Processing']"));
	        reportStep("Clicked Daily Processing", "pass");
	        return this;
	    }
	    
	    public HomePage clickDailySalesProcessing() {
	    	pause(2000);
	        click(locateElement(Locators.XPATH, "//span[text()='Daily Sales Order Management Processing']"));
	        reportStep("Clicked daily Sales Processing", "pass");
	        return this;
	    }
	    
	    public HomePage clickInquiries() {
	        click(locateElement(Locators.XPATH, "//span[text()='Inventory Inquiries']"));
	        reportStep("Clicked Inquiries", "pass");
	        return this;
	    }
	    
	    public 	InquiriesPage clickSummary() {
	        click(locateElement(Locators.XPATH, "//a[text()='Summary Availability']"));
	        reportStep("Clicked summary", "pass");
	        return new InquiriesPage();
	    }
	    
	    public HomePage clickOrderProcessing() {
	    	pause(1000);
	        click(locateElement(Locators.XPATH, "//span[text()='Sales Order Processing']"));
	        reportStep("Order processing clicked", "pass");
	        return this;
	    }
	    
	    public 	OrderHeaderPage clickOrderHeader() {
	    	pause(1000);
	        click(locateElement(Locators.XPATH, "//a[text()='Enter Orders Header']"));
	        reportStep("ClickOrder Header", "pass");
	        return new OrderHeaderPage();
	    }
	    
	    public 	PickSlipPage clickPickSlip() {
	    	pause(1000);
	        click(locateElement(Locators.XPATH, "//a[text()='Print Pick Slips']"));
	        reportStep("Clicked in Pick Slip", "pass");
	        return new PickSlipPage();
	    }
	 
	 
	
}

