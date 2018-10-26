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
        Select dropdown = new Select(driver.find(country));
        dropdown.selectByValue("NZ");
        WebElement searchFieldState = driver.find(this.state);
        searchFieldState.sendKeys(state);
        WebElement searchFieldPhone = driver.find(this.phone);
        searchFieldPhone.sendKeys(phone);
        WebElement searchFieldEmail = driver.find(this.email);
        searchFieldEmail.sendKeys(email);
        WebElement searchFieldUserName = driver.find(this.userName);
        searchFieldUserName.sendKeys(userName);
        WebElement searchFieldPassword = driver.find(this.password);
        searchFieldPassword.sendKeys(password);
        WebElement button = driver.find(this.button);
        button.click();


    }

    public String getSearchFieldValue () {
        return driver.find(firstName).getAttribute("value");
    }
}
