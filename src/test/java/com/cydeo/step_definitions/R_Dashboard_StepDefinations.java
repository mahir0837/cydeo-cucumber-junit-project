package com.cydeo.step_definitions;

import com.cydeo.pages.R_DashboardPage;
import com.cydeo.utitlities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class R_Dashboard_StepDefinations {

    R_DashboardPage dashboardPage=new R_DashboardPage();
    @Then("user should be able to see following modules")
    public void user_should_be_able_to_see_following_modules(List<String>expectedModules) {

        BrowserUtils.sleep(2);
        List<String>actualModules=new ArrayList<>();
        for (WebElement each : dashboardPage.allTopModules) {
            actualModules.add(each.getText());
        }
        Assert.assertEquals(expectedModules,actualModules);
    }
}
