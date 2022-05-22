package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyTitleVerification;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    EtsyTitleVerification etsyTitleVerification = new EtsyTitleVerification();

    @When("User is on https:\\/\\/www.etsy.com")
    public void user_is_on_https_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");

    }
    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }
    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        etsyTitleVerification.searchBox.sendKeys(string);



    }
    @When("User clicks search button")
    public void user_clicks_search_button() {

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {

    }



}
