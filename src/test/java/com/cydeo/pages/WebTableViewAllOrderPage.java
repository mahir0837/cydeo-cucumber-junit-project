package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableViewAllOrderPage {

    public WebTableViewAllOrderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;

}
