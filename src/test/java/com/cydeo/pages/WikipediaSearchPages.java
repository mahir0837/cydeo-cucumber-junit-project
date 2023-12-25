package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPages {

    public WikipediaSearchPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement wikiButton;

    @FindBy(xpath = "//h1/span[.='Steve Jobs']")
    public WebElement mainHeader;

    @FindBy(xpath = "//th/div[.='Steve Jobs']")
    public WebElement imgHeader;
}
