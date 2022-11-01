package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage extends setup {
    // anything from the login page
    // UI Web elements

    public loginPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='upgrade']/nav/div/div[2]/div[1]/a")
    public WebElement goToSignInPageLocator;

    @FindBy(how= How.XPATH, using = "//input[@id='email']")
    public WebElement emailLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='password']")
    public WebElement passwordLocator;

    @FindBy(how= How.XPATH, using = "//*[@id='hero-overlay']/div/div[2]/span/form/button")
    public WebElement signInLocator;

    // Any functions that are required in this page
    public void verifyHomePageTitle(){
        String act = driver.getTitle();
        String exp = "Sign in here";
        Assert.assertEquals(exp, act);
        System.out.println("Verify I am in login page is success");
    }
    public void goToSignIn(){
        goToSignInPageLocator.click();
    }
    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordLocator.sendKeys(password);
    }
    public void clickSignIn(){
        signInLocator.click();
    }

}
