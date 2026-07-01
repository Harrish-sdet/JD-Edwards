# Selenium Java Test Automation Framework

A reusable Selenium + TestNG framework for building UI test automation suites.
It provides a clean Page Object Model structure, a rich library of Selenium
wrapper methods, data-driven testing via Excel, and rich HTML reporting with
ExtentReports. This repository ships as a **starter template** with one working
sample test so a new team can verify the setup and start adding their own pages
and tests immediately.

## Tech Stack

| Concern          | Tool / Library            |
|------------------|---------------------------|
| Language         | Java                      |
| Browser driver   | Selenium 4                |
| Test runner      | TestNG 7                  |
| Reporting        | ExtentReports             |
| Data source      | Apache POI (Excel `.xlsx`)|
| Build            | Maven                     |

## Project Structure

```
src/main/java/
  com/framework/                         <-- REUSABLE FRAMEWORK (do not delete)
    selenium/api/base/
      DriverInstance.java                Thread-safe WebDriver & wait management
      SeleniumBase.java                  All Selenium wrapper methods (click, type,
                                         dropdowns, alerts, frames, waits, upload...)
    selenium/api/design/
      Browser.java, Element.java         Interfaces describing the wrapper contract
      Locators.java                      Enum of supported locator strategies
    testng/api/base/
      ProjectSpecificMethods.java        Test lifecycle + Excel data provider
                                         (edit the placeholder constants here)
      RetryEngine.java                   Optional retry-on-failure analyzer
    utils/
      DataLibrary.java                   Reads Excel test data
      Reporter.java                      ExtentReports lifecycle + reportStep()

  com/qa/                                <-- SAMPLE PROJECT (replace with your own)
    pages/
      LoginPage.java                     Sample page object
      ProductsPage.java                  Sample page object
    testcases/
      TC001_VerifyLogin.java             Sample data-driven test

data/
  Login.xlsx                             Sample test data for TC001
testng.xml                               Suite definition
pom.xml                                  Maven dependencies & build
```

## Getting Started

1. **Prerequisites:** JDK 11+ and Maven installed.
2. **Install dependencies:**
   ```
   mvn clean install -DskipTests
   ```
3. **Run the sample suite:**
   ```
   mvn test
   ```
   The sample `TC001_VerifyLogin` logs in to the public demo site
   `https://www.saucedemo.com/` using the credentials in `data/Login.xlsx`
   and verifies the Products page. Use it to confirm your environment is set up
   correctly.
4. **View the report:** open the generated `reports/<timestamp>/result.html`.

## Starting a New Project

1. Open `com/framework/testng/api/base/ProjectSpecificMethods.java` and update
   the placeholder constants:
   ```java
   protected static final String  BROWSER  = "chrome";   // chrome | firefox | edge | ie
   protected static final boolean HEADLESS = false;
   protected static final String  APP_URL  = "https://your-app-url.com/";
   ```
2. Replace the sample `com/qa/pages` and `com/qa/testcases` with your own
   (use the sample `LoginPage` / `TC001_VerifyLogin` as templates).
3. Add an Excel file per test under `data/` (file name = `excelFileName` set in
   the test's `@BeforeTest`). Row 1 is treated as headers; data starts at row 2.
4. Register your test classes in `testng.xml`.

## Writing a Test — Pattern

- **Page object:** extend `ProjectSpecificMethods`, keep one user action per
  method, and return the next page object (or `this`) for fluent chaining.
- **Test case:** extend `ProjectSpecificMethods`, set report metadata and the
  Excel file name in `@BeforeTest`, then drive the page objects in an
  `@Test(dataProvider = "fetchData")` method that receives one Excel row per run.
- Use `reportStep(message, "pass"|"fail"|"info"|"warning")` to log steps and
  capture screenshots in the Extent report.
