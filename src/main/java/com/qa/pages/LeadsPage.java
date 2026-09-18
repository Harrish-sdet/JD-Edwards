package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.framework.selenium.api.design.Locators;

public class LeadsPage extends ProjectSpecificMethods {

	public LeadsPage clickCreateLeadLink() {
		click(locateElement(Locators.XPATH, "//a[normalize-space()='Create Lead']"));
		reportStep("Click Create Lead Link", "pass");
		return this;
	}
}
