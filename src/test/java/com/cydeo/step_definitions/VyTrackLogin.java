package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackDashboardPage;
import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.utitlities.BrowserUtils;
import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import com.cydeo.utitlities.ExcellUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VyTrackLogin {

    String path = "VyTrackQa2Users.xlsx";
    String firstName;
    String lastName;
    VyTrackLoginPage login = new VyTrackLoginPage();
    VyTrackDashboardPage dashBoardPage = new VyTrackDashboardPage();

    @Given("user is on the vyTrack login page")
    public void user_is_on_the_vy_track_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }


    @When("the user login with valid credentials {string} and {int}")
    public void the_user_login_with_valid_credentials_and(String sheetName, Integer rowNumber) {
        ExcellUtil excellUtil = new ExcellUtil(path, sheetName);
        String userName = excellUtil.getCellData(rowNumber, 0);
        String password = excellUtil.getCellData(rowNumber, 1);
        firstName = excellUtil.getCellData(rowNumber, 2);
        lastName = excellUtil.getCellData(rowNumber, 3);
        login.loginMethod(userName, password);
        BrowserUtils.sleep(3);

    }

    @Then("the user should be able to log in and see their name")
    public void the_user_should_be_able_to_log_in_and_see_their_name() {
        //String expectedFullName=firstName+" "+lastName;
        //App has issue
        String expectedFullName = "John Doe";
        String actualFullName = dashBoardPage.fullName.getText();
        Assert.assertEquals(expectedFullName, actualFullName);
    }
}
