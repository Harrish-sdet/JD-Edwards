package com.qa.pages;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class InquiriesPage extends ProjectSpecificMethods {

	public InquiriesPage verifyLogin() {
	 	verifyTitle("Summary Availability - Work With Item Availability");
	 	reportStep("Title verified", "pass");
        return this;
    }
}
