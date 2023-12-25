package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

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

    @After
    public void tearDownMethod() {
        System.out.println("---->@After: RUNNING after EACH SCENARIO");
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
