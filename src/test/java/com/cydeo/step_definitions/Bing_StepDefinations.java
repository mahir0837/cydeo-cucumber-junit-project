package com.cydeo.step_definitions;

import com.cydeo.pages.BingoSearchPages;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Bing_StepDefinations {

    BingoSearchPages searchPages = new BingoSearchPages();

    @Given("user is on the bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get("https://www.bing.com/");
    }

    @When("user enters orange in the Bing search box")
    public void user_enters_orange_in_the_bing_search_box() {
        searchPages.searchBox.sendKeys("orange" + Keys.ENTER);
    }

    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {
        Assert.assertEquals("orange - Search",Driver.getDriver().getTitle());
    }

    @When("user enters {string} in the Bing search box")
    public void userEntersInTheBingSearchBox(String arg0) {
        searchPages.searchBox.sendKeys(arg0 + Keys.ENTER);
    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {
        BrowserUtils.verifyTitle(arg0);
    }
}
