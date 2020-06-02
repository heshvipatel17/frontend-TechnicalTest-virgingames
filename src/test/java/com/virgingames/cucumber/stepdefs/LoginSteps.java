package com.virgingames.cucumber.stepdefs;

import com.virgingames.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Then("^I should see \"([^\"]*)\" displayed in one of the button$")
    public void iShouldSeeDisplayedInOneOfTheButton(String loginTxt) {
        Assert.assertEquals(new HomePage().verifyLoginText(),loginTxt);
        new HomePage().verifyLoginBtnIsDisplayed();

    }
}
