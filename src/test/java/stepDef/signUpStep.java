package stepDef;

import base.setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageObject.loginPage;
import pageObject.signUpPage;

import java.time.Duration;

public class signUpStep extends setup {

    signUpPage sp = new signUpPage(driver);

    Faker faker = new Faker();

    @And("I click on the {string} linktext")
    public void iClickOnTheLinktext(String arg0) {
        sp.goToCreateAnAccount();
    }

    @And("I enter a valid first name")
    public void iEnterAValidFirstName() {
        sp.enterFirstName();
    }

    @And("I enter a valid last name")
    public void iEnterAValidLastName() {
        sp.enterLastName();
    }

    @And("I enter a valid phone number")
    public void iEnterAValidPhoneNumber() {
        sp.enterPhoneNumber();
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
        String fakeFirstName = faker.name().firstName().toLowerCase();
        String fakeLastName = faker.name().lastName().toLowerCase();
        String fakeRandomNumber = faker.number().digits(3);
        String fakeDomain = "@carsaver-qatest.com";
        String fakeEmail = fakeFirstName + fakeLastName + fakeRandomNumber + fakeDomain;
        sp.enterEmail(fakeEmail);
        System.out.println("My full fake email is -->" + fakeEmail);
        
    }

    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        sp.enterPassword();
    }

    @And("I enter a valid confirm password")
    public void iEnterAValidConfirmPassword() {
        sp.enterConfirmPassword();
    }

    @And("I click on the {string} button")
    public void iClickOnTheButton(String arg0) {
        sp.nextButton();
        sp.nextButton2();
    }

    @And("I enter a valid address")
    public void iEnterAValidAddress() {
        sp.enterAddress();
    }

    @And("I enter a valid city")
    public void iEnterAValidCity() {
        sp.enterCity();

    }

    @And("I select a state")
    public void iSelectAState() {
        sp.enterState();
    }

    @And("I enter a valid zip code")
    public void iEnterAValidZipCode() {
        sp.enterZipCode();
    }

    @When("I click on the {string} button on the Address page")
    public void iClickOnThe(String arg0) {
        sp.nextButton2();
    }

    @When("I click on the {string}")
    public void iClickOnTheUseAddressAsEntered(String arg0) {
        sp.useAddressAsEntered();
    }
}
