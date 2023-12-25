package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPages;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinations {

    GoogleSearchPages searchPages = new GoogleSearchPages();

    @When("user is on the Google search page")
    public void user_is_on_the_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);

        Driver.closeDriver();

    }

    @When("user searches for apple")
    public void user_searches_for_apple() {
        searchPages.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        BrowserUtils.verifyTitle("apple - Google Search");
    }

}
