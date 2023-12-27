package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPages extends WebTableBasePage{

    public WebTableOrderPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "product")
    public WebElement webElementProductDropdown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioButton;
    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioButton;
    @FindBy(name = "name")
    public WebElement customerName;
    @FindBy(name = "quantity")
    public WebElement quantity;
    @FindBy(name = "street")
    public WebElement street;
    @FindBy(name = "cardNo")
    public WebElement cardNo;
    @FindBy(css = "input[name='city']")
    public WebElement city;
    @FindBy(css = "input[name='cardExp']")
    public WebElement expDate;
    @FindBy(css = "input[name='state']")
    public WebElement state;
    @FindBy(css = "input[name='zip']")
    public WebElement zipCode;
    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;
    @FindBy(name = "card")
    public List<WebElement>cardTypeRadio;
    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;
}
