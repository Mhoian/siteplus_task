package com.automation.pages;

import com.automation.driver.Driver;
import com.automation.driver.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page {
    private By firstName = By.name("first_name");
    private By lastName = By.name("last_name");
    private By address = By.name("address");
    private By city = By.name("city");
    private By postCode = By.name("post_code");
    private By country = By.cssSelector("#country_name");
    private By state = By.name("state");
    private By phone = By.name("phone");
    private By email = By.name("email");
    private By userName = By.name("username");
    private By password = By.name("password");
    private By button = By.cssSelector("input.textstyle1:nth-child(1)");
    private By radioPersonal= By.cssSelector("#account_type_personal");
    private By sateDropdown = By.cssSelector("#state_field");
    private By businessName = By.id("business");
    private By businessNumber = By.id("business_number_element");
    private By radioBusiness = By.cssSelector("#account_type_business");

    Screenshot screenshot;
    Driver driver;
    public Page(Driver driver){
        this.driver = driver;
    }

    public void setSearchFieldEnter(String firstName, String lastName, String address, String city,
                                    String postCode, String state, String phone, String email, String userName, String password) {
        WebElement searchFieldFirstName = driver.find(this.firstName);
        searchFieldFirstName.sendKeys(firstName);
        WebElement searchFieldLastName = driver.find(this.lastName);
        searchFieldLastName.sendKeys(lastName);
        WebElement searchFieldAddress = driver.find(this.address);
        searchFieldAddress.sendKeys(address);
        WebElement searchFieldCity = driver.find(this.city);
        searchFieldCity.sendKeys(city);
        WebElement searchFieldPostCode = driver.find(this.postCode);
        searchFieldPostCode.sendKeys(postCode);
        Select dropdownCountry = new Select(driver.find(country));
        dropdownCountry.selectByValue("NZ");
        WebElement searchFieldState = driver.find(this.state);
        searchFieldState.sendKeys(state);
        WebElement searchFieldPhone = driver.find(this.phone);
        searchFieldPhone.sendKeys(phone);
        WebElement searchFieldEmail = driver.find(this.email);
        searchFieldEmail.sendKeys(email);
        WebElement radio = driver.find(radioPersonal);
        radio.click();
        WebElement searchFieldUserName = driver.find(this.userName);
        searchFieldUserName.sendKeys(userName);
        WebElement searchFieldFirstName2 = driver.find(this.firstName);
        searchFieldFirstName2.sendKeys(firstName);
        WebElement searchFieldPassword = driver.find(this.password);
        searchFieldPassword.sendKeys(password);
        WebElement button = driver.find(this.button);
        button.click();
    }

    public void setSearchFieldEnterByState(String firstName, String lastName, String address, String city,
                                    String postCode, String phone, String email, String userName, String password) {
        WebElement searchFieldFirstName = driver.find(this.firstName);
        searchFieldFirstName.sendKeys(firstName);
        WebElement searchFieldLastName = driver.find(this.lastName);
        searchFieldLastName.sendKeys(lastName);
        WebElement searchFieldAddress = driver.find(this.address);
        searchFieldAddress.sendKeys(address);
        WebElement searchFieldCity = driver.find(this.city);
        searchFieldCity.sendKeys(city);
        WebElement searchFieldPostCode = driver.find(this.postCode);
        searchFieldPostCode.sendKeys(postCode);
        Select dropdown = new Select(driver.find(country));
        dropdown.selectByValue("AU");
        Select stateDropdown = new Select(driver.find(sateDropdown));
        stateDropdown.selectByValue("SA");
        WebElement searchFieldPhone = driver.find(this.phone);
        searchFieldPhone.sendKeys(phone);
        WebElement searchFieldEmail = driver.find(this.email);
        searchFieldEmail.sendKeys(email);
        WebElement radio = driver.find(radioPersonal);
        radio.click();
        WebElement searchFieldUserName = driver.find(this.userName);
        searchFieldUserName.sendKeys(userName);
        WebElement searchFieldFirstName2 = driver.find(this.firstName);
        searchFieldFirstName2.sendKeys(firstName);
        WebElement searchFieldPassword = driver.find(this.password);
        searchFieldPassword.sendKeys(password);
        WebElement button = driver.find(this.button);
        button.click();
    }

    public void setSearchFieldEnterByBusiness(String firstName, String lastName, String address, String city,
                                              String postCode, String state, String phone, String email,
                                              String businessName, String businessNumber, String userName, String password) {
        WebElement searchFieldFirstName = driver.find(this.firstName);
        searchFieldFirstName.sendKeys(firstName);
        WebElement searchFieldLastName = driver.find(this.lastName);
        searchFieldLastName.sendKeys(lastName);
        WebElement searchFieldAddress = driver.find(this.address);
        searchFieldAddress.sendKeys(address);
        WebElement searchFieldCity = driver.find(this.city);
        searchFieldCity.sendKeys(city);
        WebElement searchFieldPostCode = driver.find(this.postCode);
        searchFieldPostCode.sendKeys(postCode);
        Select dropdownCountry = new Select(driver.find(country));
        dropdownCountry.selectByValue("NZ");
        WebElement searchFieldState = driver.find(this.state);
        searchFieldState.sendKeys(state);
        WebElement searchFieldPhone = driver.find(this.phone);
        searchFieldPhone.sendKeys(phone);
        WebElement searchFieldEmail = driver.find(this.email);
        searchFieldEmail.sendKeys(email);
        WebElement radio = driver.find(radioPersonal);
        radio.click();
        WebElement checkBoxBusiness = driver.find(radioBusiness);
        checkBoxBusiness.click();
        WebElement searchFieldBusinessName = driver.find(this.businessName);
        searchFieldBusinessName.sendKeys(businessName);
        WebElement searchFieldBusinessNumber = driver.find(this.businessNumber);
        searchFieldBusinessNumber.sendKeys(businessNumber);
        WebElement searchFieldUserName = driver.find(this.userName);
        searchFieldUserName.sendKeys(userName);
        WebElement searchFieldFirstName2 = driver.find(this.firstName);
        searchFieldFirstName2.sendKeys(firstName);
        WebElement searchFieldPassword = driver.find(this.password);
        searchFieldPassword.sendKeys(password);
        WebElement button = driver.find(this.button);
        button.click();
    }

    public void setSearchFieldEnterStandart(String firstName, String lastName, String address, String city,
                                            String postCode, String state, String phone, String email,
                                            String businessName, String businessNumber, String userName, String password) {
        WebElement searchFieldFirstName = driver.find(this.firstName);
        searchFieldFirstName.sendKeys(firstName);
        WebElement searchFieldLastName = driver.find(this.lastName);
        searchFieldLastName.sendKeys(lastName);
        WebElement searchFieldAddress = driver.find(this.address);
        searchFieldAddress.sendKeys(address);
        WebElement searchFieldCity = driver.find(this.city);
        searchFieldCity.sendKeys(city);
        WebElement searchFieldPostCode = driver.find(this.postCode);
        searchFieldPostCode.sendKeys(postCode);
        Select dropdownCountry = new Select(driver.find(country));
        dropdownCountry.selectByValue("NZ");
        WebElement searchFieldState = driver.find(this.state);
        searchFieldState.sendKeys(state);
        WebElement searchFieldPhone = driver.find(this.phone);
        searchFieldPhone.sendKeys(phone);
        WebElement searchFieldEmail = driver.find(this.email);
        searchFieldEmail.sendKeys(email);
        WebElement searchFieldBusinessName = driver.find(this.businessName);
        searchFieldBusinessName.sendKeys(businessName);
        WebElement searchFieldBusinessNumber = driver.find(this.businessNumber);
        searchFieldBusinessNumber.sendKeys(businessNumber);
        WebElement searchFieldUserName = driver.find(this.userName);
        searchFieldUserName.sendKeys(userName);
        WebElement searchFieldFirstName2 = driver.find(this.firstName);
        searchFieldFirstName2.sendKeys(firstName);
        WebElement searchFieldPassword = driver.find(this.password);
        searchFieldPassword.sendKeys(password);
        WebElement button = driver.find(this.button);
        button.click();
    }

    public void setSearchFieldEnterByPersonal(String firstName, String lastName, String address, String city,
                                    String postCode, String state, String phone, String email, String userName, String password) {
        WebElement searchFieldFirstName = driver.find(this.firstName);
        searchFieldFirstName.sendKeys(firstName);
        WebElement searchFieldLastName = driver.find(this.lastName);
        searchFieldLastName.sendKeys(lastName);
        WebElement searchFieldAddress = driver.find(this.address);
        searchFieldAddress.sendKeys(address);
        WebElement searchFieldCity = driver.find(this.city);
        searchFieldCity.sendKeys(city);
        WebElement searchFieldPostCode = driver.find(this.postCode);
        searchFieldPostCode.sendKeys(postCode);
        Select dropdownCountry = new Select(driver.find(country));
        dropdownCountry.selectByValue("NZ");
        WebElement searchFieldState = driver.find(this.state);
        searchFieldState.sendKeys(state);
        WebElement searchFieldPhone = driver.find(this.phone);
        searchFieldPhone.sendKeys(phone);
        WebElement searchFieldEmail = driver.find(this.email);
        searchFieldEmail.sendKeys(email);
        WebElement radio = driver.find(radioPersonal);
        radio.click();
        WebElement searchFieldUserName = driver.find(this.userName);
        searchFieldUserName.sendKeys(userName);
        WebElement searchFieldPassword = driver.find(this.password);
        searchFieldPassword.sendKeys(password);
        WebElement button = driver.find(this.button);
        button.click();
    }

    public boolean isError(){
        return  driver.safeAlertDissmiss();
    }
}
