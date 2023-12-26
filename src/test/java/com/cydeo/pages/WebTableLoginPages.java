package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPages {

    public WebTableLoginPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement userNameInput;
    @FindBy(name = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderButton;
    @FindBy(name = "product")
    public WebElement dropdownProduct;

    /**
     * This MEthod will login with bellow credentials
     * @username : Test
     * @password : Tester
     */
    public void login(){
        this.userNameInput.sendKeys("Test");
        this.passwordInput.sendKeys("Tester");
        this.loginButton.click();
    }
}
