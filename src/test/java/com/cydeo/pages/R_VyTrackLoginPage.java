package com.cydeo.pages;

import com.cydeo.utitlities.ConfigurationReader;
import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class R_VyTrackLoginPage {

    public R_VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement loginErrorMessage;

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


    public void login(String userType){

        userType= userType.replace(" ","_");

        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");

        login(username,password);

    }
}
