package com.automation.tests;

import com.automation.driver.Driver;
import com.automation.driver.Screenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Driver driver = (Driver) iTestResult.getAttribute("driver");
        Screenshot screenshot = new Screenshot(driver, iTestResult.getName());
        screenshot.takeScreenshot();
    }

}
