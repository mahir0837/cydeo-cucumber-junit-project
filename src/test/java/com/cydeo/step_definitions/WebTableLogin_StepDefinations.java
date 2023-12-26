package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPages;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.Driver;
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

    @When("user is on the Order page")
    public void user_is_on_the_order_page() {
        loginPages.orderButton.click();
    }

    @Then("user sees bellow options under product dropdown")
    public void user_sees_bellow_options_under_product_dropdown(List<String> productsInDropdowns) {

        List<String> productList = BrowserUtils.dropdownProduct_as_STRING(loginPages.dropdownProduct);
        Assert.assertEquals(productsInDropdowns, productList);
    }
}
