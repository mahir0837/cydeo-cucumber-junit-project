package com.cydeo.utitlities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.List;
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
    /**
     * This method accepts a dropdown element and returns a List<String> that contains all options values as String.
     * @param dropdownElement
     * @return actualMonth_as_STRING
     */
    public static List<String> dropdownOptions_as_STRING(WebElement dropdownElement) {

        Select month = new Select(dropdownElement);
        //Storing all the ACTUAL options into a List of WebElements
        List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();

        //Creating an EMPTY list of String to store ACTUAL <option> as String
        List<String> actualMonth_as_STRING = new ArrayList<>();

        //Looping through the List<WebElement>, getting all options' texts, and storing them into List<String>
        for (WebElement each : actualMonth_as_WEBELEMENT) {

            actualMonth_as_STRING.add(each.getText());

        }

        return actualMonth_as_STRING;
    }
    public static List<String> dropdownProduct_as_STRING(WebElement productsInDropdowns) {
        Select selectProduct=new Select(productsInDropdowns);
        List<WebElement>products_web_Element=selectProduct.getOptions();
        List<String>products_String=new ArrayList<>();
        for (WebElement each : products_web_Element) {
            products_String.add(each.getText());
        }
        return products_String;
    }
    public static void clickRadioButton(List<WebElement>radioButton,String attributeValue){
        for (WebElement each : radioButton) {
            if (each.getAttribute("value").equals(attributeValue)){
                each.click();
            }
        }
    }
}
