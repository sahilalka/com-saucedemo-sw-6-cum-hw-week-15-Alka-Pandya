package com.saucedemo.steps;

import com.saucedemo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new LoginPage().enterUserName(username);

    }

    @And("^I Enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
    }

    @And("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String arg0)  {
        String expectedText = "Products";
        Assert.assertEquals(expectedText, new LoginPage().getTextFromProductsTitle());
    }

    @And("^Verify that six products are displayed on page$")
    public void verifyThatSixProductsAreDisplayedOnPage() {
        int expectedProductNumber = 6;
        Assert.assertEquals(expectedProductNumber,  new LoginPage().countProductOnList());
    }

}
