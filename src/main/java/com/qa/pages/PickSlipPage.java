package com.qa.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class PickSlipPage extends ProjectSpecificMethods {

	public PickSlipPage enterVersion(String version) {
		pause(1000);
		switchToFrame("e1menuAppIframe");
		typeAndEnter(locateElement(Locators.XPATH, "//input[@title='Version']"),version);
		reportStep("version entered", "pass");
		return this;
	}

	public PickSlipPage selectCheckbox() {
		pause(1000);
		click(locateElement(Locators.XPATH,"//table[@class='gridrowEven']//input[@type='checkbox']"));
		reportStep("checkbox selected", "pass");
		return this;
	}

	public PickSlipPage clickSelect() {
		click(locateElement("hc_Select"));
		reportStep("selected", "pass");
		return this;
	}
	
	public PickSlipPage clickDataSelection() {
		click(locateElement(Locators.XPATH, "//label[text()='Data Selection']"));
		reportStep("Date selected", "pass");
		return this;
	}
	
	public PickSlipPage clickSubmit() {
		click(locateElement(Locators.XPATH, "//span[@class='FieldLabelSmall']"));
		reportStep("Submit button clicked", "pass");
		return this;
	}
	
	public PickSlipPage selectLeftOpereand(String leftOperand) {
		pause(1000);
		
		selectDropDownUsingText(locateElement(Locators.XPATH,"//select[@id='LeftOperand1']"), leftOperand);
		reportStep("LeftOpereand selected", "pass");
		return this;
	}
	
	public PickSlipPage selectComparision(String comparision) {
//		switchToFrame("e1menuAppIframe");
		
		selectDropDownUsingText(locateElement(Locators.XPATH,"//select[@id='Comparison1']"), comparision);
		reportStep("comparision selected", "pass");
		return this;
	}
	
	public PickSlipPage selectRightOperannd(String rightOperand) {
//		switchToFrame("e1menuAppIframe");
		
		selectDropDownUsingText(locateElement(Locators.XPATH,"//select[@id='RightOperand1']"), rightOperand);//Literal
		reportStep("rightOpereand selected", "pass");
		return this;
	}
	
	public PickSlipPage enterLiteralValue(String literal) {
		type(locateElement(Locators.XPATH,"//input[@id='LITtf']"), literal);
		reportStep("literal value entered", "pass");
		return this;
	}
	
	
	
	public PickSlipPage selectLiteral() {
		click(locateElement("hc_Select"));
		reportStep("literal selected", "pass");
		return this;
	}
	
	public PickSlipPage clickOk() {
		click(locateElement("hc_OK"));
		reportStep("Ok Clicked", "pass");
		return this;
	}

	
}
