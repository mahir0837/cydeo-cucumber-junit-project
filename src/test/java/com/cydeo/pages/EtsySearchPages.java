package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPages {

    public EtsySearchPages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//title[.='Etsy Canada - Shop for handmade, vintage, custom, and unique gifts for everyone']")
    public WebElement etsyTitle;

    @FindBy(xpath = "//input[@name='search_query']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
}
