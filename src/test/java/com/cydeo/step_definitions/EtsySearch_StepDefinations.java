package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPages;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsySearch_StepDefinations {

    EtsySearchPages etsySearchPages = new EtsySearchPages();

    @Given("user is on the etsy page")
    public void user_is_on_the_etsy_page() {
        Driver.getDriver().get("https://www.etsy.com/");
    }

    @Then("user sees title is as excepted")
    public void user_sees_title_is_as_excepted() {

        String expectedTitle = "Etsy Canada - Shop for handmade, vintage, custom, and unique gifts for everyone";
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPages.searchBox.sendKeys("Wooden Spoon");
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsySearchPages.searchButton.click();
    }

    @Then("user sees Wooden spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
    BrowserUtils.verifyTitleContains("Wooden spoon");
    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchValue) {
        etsySearchPages.searchBox.sendKeys(searchValue);
    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String searchValue) {
        BrowserUtils.verifyTitleContains(searchValue);
    }

}
