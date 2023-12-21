package com.cydeo.utitlities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import java.util.Set;

public class BrowserUtils {

       /*
    This method will accept int (in seconds)
    and execute Thread.sleep method for given duration
    Arg: int second
     */

    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch(InterruptedException e){

        }
    }
    public static void switchWindowAndVerify(String expectedInURL, String expectedInTitle){
        //Return and store all window handles in a Set.
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {

            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }

        //5. Assert:Title contains “Etsy”

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }
    public static void verifyTitleContains(String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }
}
