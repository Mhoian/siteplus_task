package com.automation.tests;

import com.automation.driver.Driver;
import com.automation.pages.Page;
import com.automation.utils.Json;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
@Listeners(Listener.class)
public class Tests {

    // WebDriver wrapper
    public Driver driver;


    @BeforeMethod
    public void setUp (Method method, ITestResult testResult) {
        driver = new Driver(method.getName());
        driver.get("https://www.cheapdomains.com.au/register/member_register_test.php");
        testResult.setAttribute("driver", driver);
    }

    @Test
    public void validResultRegistrationTest() {
        Json json = new Json("valid_test_data.json");
        Page page = new Page(driver);
        page.setSearchFieldEnter(json.getString("firstName"), json.getString("lastName"),
                                json.getString("address"), json.getString("city"),
                                json.getString("postCode"), json.getString("state"),
                                json.getString("phone"), json.getString("email"),
                                json.getString("username"),json.getString("password"));
        page.getSearchFieldValue();


    }


    @Test
    public void inValidResultRegistrationTest() {
        Json json = new Json("inValid_test_data.json");
        Page page = new Page(driver);
        page.setSearchFieldEnter(json.getString("firstName"), json.getString("lastName"),
                json.getString("address"), json.getString("city"),
                json.getString("postCode"), json.getString("state"),
                json.getString("phone"), json.getString("email"),
                json.getString("username"),json.getString("password"));
        page.getSearchFieldValue();

    }

    @AfterMethod
    public void tearDown(Method method) {
        try {
            driver.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }


}
