package com.framework.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;

/**
 * Base class for every test case. It owns the test lifecycle (browser launch
 * before each test, browser close after each test) and exposes the Excel data
 * provider.
 *
 * NEW PROJECT SETUP:
 *   Update the three placeholder constants below to point the framework at your
 *   application under test. They are the only project-specific values here; the
 *   sample defaults run the bundled demo against https://www.saucedemo.com/.
 */
public class ProjectSpecificMethods extends SeleniumBase {

	/** Browser to run on: "chrome", "firefox", "edge" or "ie". */
	protected static final String BROWSER = "chrome";

	/** Run the browser without a visible UI window. */
	protected static final boolean HEADLESS = false;

	/** Base URL of the application under test. */
	protected static final String APP_URL = "https://mirajde-web.birlasoft.com/jde/E1Menu.maf";

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() {
		startApp(BROWSER, HEADLESS, APP_URL);
		setNode();
	}

	@AfterMethod
	public void postCondition() {
		close();
	}

}
