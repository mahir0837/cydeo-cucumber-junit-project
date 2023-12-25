package com.cydeo.pages;

import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class R_VyTrackLoginPage {

    public R_VyTrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement usernameInput;

    @FindBy(css = "input#prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement signInInput;

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInInput.click();
    }
}
