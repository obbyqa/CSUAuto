package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.homePage;

public class hamburgerStep extends setup {

    homePage hp = new homePage(driver);
    @When("I click on the {string} menu")
    public void iClickOnTheMenu(String arg0) {
        hp.goToHamburger();
    }

    @Then("I should see two options")
    public void iShouldSeeTwoOptions() {

    }

    @Then("I should redirect to the CSU homepage")
    public void iShouldRedirectToTheCSUHomepage() {
        hp.goToHomepage();
    }

    @Then("I should redirect to the warranty page")
    public void iShouldRedirectToTheWarrantyPage() {
        hp.goToWarranty();
    }
}
