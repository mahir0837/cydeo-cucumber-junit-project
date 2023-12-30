package com.cydeo.step_definitions;

import com.cydeo.pages.R_VyTrackLoginPage;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class R_VyTrack_login_StepDefinations {


    R_VyTrackLoginPage loginPage = new R_VyTrackLoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {

//        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
//        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
//        loginPage.loginBtn.click();

        loginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        BrowserUtils.sleep(5);
        Assert.assertEquals("Dashboard",Driver.getDriver().getTitle());
    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));
    }

    @When("user enters the store manager information")
    public void userEntersTheStoreManagerInformation() {
        loginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }

    @When("user enters the {string} information")
    public void user_enters_the_information(String string) {
        loginPage.login(string);
    }

}
