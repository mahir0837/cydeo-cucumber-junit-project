package com.cydeo.pages;

import com.cydeo.utitlities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class R_DashboardPage {

    public R_DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".title.title-level-1")
    public List<WebElement>allTopModules;

    @FindBy(css = "#user-menu>a")
    public WebElement nameOfUser;
}
