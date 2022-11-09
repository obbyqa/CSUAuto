package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.garagePage;
import pageObject.homePage;

public class garageStep extends setup {

    garagePage gp = new garagePage(driver);
    @When("I click on the Saved Deals button")
    public void iClickOnTheSavedDealsButton() {
        gp.goToSavedDeals();
    }

    @Then("I should see my Saved Deals")
    public void iShouldSeeMySavedDeals() {

    }

    @When("I click on the Recently Viewed Vehicles button")
    public void iClickOnTheRecentlyViewedVehiclesButton() {
        gp.goToRecentlyViewedVehicles();
    }

    @Then("I should see my Recently Viewed Vehicles")
    public void iShouldSeeMyRecentlyViewedVehicles() {

    }

    @When("I click on the My Trades button")
    public void iClickOnTheMyTradesButton() {
        gp.goToMyTrades();
    }

    @Then("I should see My Trades")
    public void iShouldSeeMyTrades() {

    }

    @When("I click on the My Account button")
    public void iClickOnTheMyAccountButton() {
        gp.goToMyAccount();
    }

    @Then("I should see My Account")
    public void iShouldSeeMyAccount() {
    }

    @And("I click on the Go to My Garage button")
    public void iClickOnTheGoToMyGarageButton() {
        gp.goToMyGarage();
    }

    @When("I click on the My Appointments button")
    public void iClickOnTheMyAppointmentsButton() {
        gp.goToMyAppointments();
    }

    @Then("I should see My Appointments")
    public void iShouldSeeMyAppointments() {

    }

    @When("I click on the My Address button")
    public void iClickOnTheMyAddressButton() {
        gp.goToMyAddress();

    }

    @Then("I should see My Address")
    public void iShouldSeeMyAddress() {
    }

    @When("I click on the My Password button")
    public void iClickOnTheMyPasswordButton() {
        gp.goToMyPassword();
    }

    @Then("I should see My Password")
    public void iShouldSeeMyPassword() {

    }

    @When("I click on the My Documents button")
    public void iClickOnTheMyDocumentsButton() {
        gp.goToMyDocuments();
    }

    @Then("I should see My Documents")
    public void iShouldSeeMyDocuments() {
    }

    @When("I click on the Sign Out button")
    public void iClickOnTheSignOutButton() {
        gp.goToSignOut();
    }

    @Then("I should successfully sign out")
    public void iShouldSuccessfullySignOut() {
    }
}
