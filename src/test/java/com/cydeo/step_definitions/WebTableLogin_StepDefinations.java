package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPages;
import com.cydeo.pages.WebTableOrderPages;
import com.cydeo.pages.WebTableViewAllOrderPage;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WebTableLogin_StepDefinations {

    WebTableLoginPages loginPages = new WebTableLoginPages();

    @Given("user is on the web table login page")
    public void user_is_on_the_web_table_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters correct username")
    public void user_enters_correct_username() {
        loginPages.userNameInput.sendKeys("Test");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        loginPages.passwordInput.sendKeys("Tester");
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPages.loginButton.click();
    }

    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("orders"));
    }

    @When("user enters {string} username")
    public void user_enters_username(String userName) {
        loginPages.userNameInput.sendKeys(userName);
    }

    @When("user enters {string} password")
    public void user_enters_password(String password) {
        loginPages.passwordInput.sendKeys(password);
    }

    @When("user enters below correct credentials")
    public void user_enters_below_correct_credentials(Map<String, String> credentials) {
        loginPages.userNameInput.sendKeys(credentials.get("username"));
        loginPages.passwordInput.sendKeys(credentials.get("password"));
    }

    @Given("user is already logged in to the Web Table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        loginPages.login();
    }

    WebTableOrderPages orderPages = new WebTableOrderPages();

    @When("user is on the Order page")
    public void user_is_on_the_order_page() {
        orderPages.orderLink.click();
        BrowserUtils.sleep(2);
    }

    @Then("user sees bellow options under product dropdown")
    public void user_sees_bellow_options_under_product_dropdown(List<String> expectedOprions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(orderPages.webElementProductDropdown);
        Assert.assertEquals(expectedOprions, actualOptions);
    }

    @Then("user sees VISA as enabled payment options")
    public void userSeesVISAAsEnabledPaymentOptions() {
        Assert.assertTrue(orderPages.visaRadioButton.isEnabled());
    }

    @Then("user sees Master Card as enabled payment options")
    public void userSeesMasterCardAsEnabledPaymentOptions() {
        Assert.assertTrue(orderPages.masterCardRadioButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment options")
    public void userSeesAmericanExpressAsEnabledPaymentOptions() {
        Assert.assertTrue(orderPages.americanExpressRadioButton.isEnabled());
    }

    @Given("user is already logged in to The Web table app")
    public void userIsAlreadyLoggedInToTheWebTableApp() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        loginPages.login();
        orderPages.orderLink.click();


    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String qty) {
        orderPages.quantity.sendKeys(qty);
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        orderPages.calculateButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String customerName) {
        orderPages.customerName.sendKeys(customerName);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        orderPages.street.sendKeys(street);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        orderPages.city.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        orderPages.state.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        orderPages.zipCode.sendKeys(zip);
    }

    @And("user selects payment option {string}")
    public void userSelectsPaymentOption(String Visa) {
        BrowserUtils.clickRadioButton(orderPages.cardTypeRadio, Visa);
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String cardNumber) {
        orderPages.cardNo.sendKeys(cardNumber);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expDate) {
        orderPages.expDate.sendKeys(expDate);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {
        orderPages.processButton.click();
    }

    WebTableViewAllOrderPage allOrder = new WebTableViewAllOrderPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {
        Assert.assertEquals(allOrder.newCustomerCell.getText(),expectedName);
    }
}
