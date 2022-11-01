package pageObject;

import base.setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class signUpPage extends setup {
    public signUpPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='hero-overlay']/div/div[2]/span/form/div[2]/div/div/a")
    public WebElement goToCreateAnAccountLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='firstName']")
    public WebElement enterFirstNameLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='lastName']")
    public WebElement enterLastNameLocator;

    @FindBy(how= How.XPATH, using = "//input[@id='email']")
    public WebElement emailAddressLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='phoneNumber']")
    public WebElement enterPhoneNumberLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='password']")
    public WebElement enterPasswordLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='passwordConfirmation']")
    public WebElement enterConfirmPasswordLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='hero-overlay']/div/div[2]/span/form/button")
    public WebElement nextButtonLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='address']")
    public WebElement addressLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='city']")
    public WebElement cityLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='state']")
    public WebElement stateLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='zipCode']")
    public WebElement zipCodeLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='hero-overlay']/div/div[2]/button")
    public WebElement nextButton2Locator;

    @FindBy(how = How.XPATH, using = "//*[@id='address-selection-modal___BV_modal_body_']/div[3]/button/span")
    public WebElement useAddressAsEnteredLocator;

    public void goToCreateAnAccount(){
        goToCreateAnAccountLocator.click();
    }
    public void enterFirstName(){
        enterFirstNameLocator.sendKeys("QA");
    }
    public void enterLastName(){
        enterLastNameLocator.sendKeys("Test");
    }
    public void enterEmail(String email) {emailAddressLocator.sendKeys(email); }
    public void enterPassword(){
        enterPasswordLocator.sendKeys("Test1234$");
    }
    public void enterConfirmPassword(){
        enterConfirmPasswordLocator.sendKeys("Test1234$");
    }
    public void enterPhoneNumber(){
        enterPhoneNumberLocator.sendKeys("3476595804");
    }
    public void nextButton(){
        nextButtonLocator.click();
    }
    public void enterAddress(){
        addressLocator.sendKeys("482 Autumn Avenue");
    }
    public void enterCity(){
        cityLocator.sendKeys("Brooklyn");
    }
    public void enterState(){
        Select dropDown = new Select(stateLocator);
        dropDown.selectByValue("NY");
    }
    public void enterZipCode(){
        zipCodeLocator.sendKeys("11208");
    }
    public void nextButton2(){
        nextButton2Locator.click();
    }
    public void useAddressAsEntered(){
        useAddressAsEnteredLocator.click();
    }

}
