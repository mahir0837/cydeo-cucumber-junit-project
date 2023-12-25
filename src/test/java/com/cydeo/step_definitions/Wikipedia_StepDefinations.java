package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPages;
import com.cydeo.utitlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinations {

    WikipediaSearchPages searchPages = new WikipediaSearchPages();

    @Given("user is in the Wikipedia home page")
    public void user_is_in_the_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        searchPages.searchBox.sendKeys("Steve Jobs");
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        searchPages.wikiButton.click();
    }

    @Then("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertEquals("Steve Jobs - Wikipedia",Driver.getDriver().getTitle());
    }

    @Then("User sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
        Assert.assertEquals("Steve Jobs",searchPages.mainHeader.getText());
    }

    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header() {
        Assert.assertEquals("Steve Jobs",searchPages.imgHeader.getText());
    }
}
