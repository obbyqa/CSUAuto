package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class loginStep extends setup {

    loginPage lp = new loginPage(driver);

    @Given("I am at CSU homepage")
    public void iAmAtCSUHomepage() {


    }

    @And("I click on the {string} linktext the top nav")
    public void iClickOnTheLinktextTheTopNav(String arg0) {
        lp.goToSignIn();
    }

    @And("I enter my valid email address")
    public void iEnterMyValidEmailAddress() {
        lp.enterEmailAddress("razibcs@yopmail.com");
    }

    @And("I enter my valid password")
    public void iEnterMyValidPassword() {
        lp.enterPassword("Test1234");
    }

    @When("I click on {string} button from login page")
    public void iClickOnButtonFromLoginPage(String arg0) {
        lp.clickSignIn();
    }

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
    }

    @And("I enter my invalid email address")
    public void iEnterMyInvalidEmailAddress() {
        lp.enterEmailAddress("razibinvalid@yopmail.com");
    }

    @Then("I should not be able to successfully login")
    public void iShouldNotBeAbleToSuccessfullyLogin() {

    }

    @And("I enter my invalid password")
    public void iEnterMyInvalidPassword() {
        lp.enterPassword("invalid1234");
    }
}
