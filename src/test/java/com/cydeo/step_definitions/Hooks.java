package com.cydeo.step_definitions;

import com.cydeo.utitlities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to create "pre" and "post" condition
for all the Scenarios and even Steps
 */
public class Hooks {

    @Before(order = 1)
    public void setUpMethod() {
        System.out.println("---->@Before: RUNNING BEFORE EACH SCENARIO");
    }

//    @Before(value = "@login",order = 2)
//    public void login_method(){
//        System.out.println("--->@Before: RUNNING BEFORE ONLY LOGIN SCENARIO");
//    }

    /*
    @After will be executed automatically after Every scenario in the project
     */
    @After
    public void tearDownMethod(Scenario scenario) {
        if (scenario.isFailed()){

            byte [] screenShoot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShoot,"image/png",scenario.getName());

        }

        System.out.println("---->@After: RUNNING after EACH SCENARIO");
        Driver.closeDriver();
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("---->@BeforeStep: RUNNING BEFORE EACH STEP SCENARIO");
    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("---->@AfterStep: RUNNING after EACH STEP SCENARIO");
    }
}
