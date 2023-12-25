package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinations {

    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        System.out.println(fruitsAndVegetables);
        System.out.println(fruitsAndVegetables.get(1));
    }

    @Then("I will share my favorites")
    public void i_will_share_my_favorites(List<String>listOfPets) {
        System.out.println(listOfPets);
    }
    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String,String>driverInfo) {
        System.out.println(driverInfo);
        System.out.println(driverInfo.get("name"));
        System.out.println(driverInfo.get("address"));
        System.out.println(driverInfo.size());

    }
}
