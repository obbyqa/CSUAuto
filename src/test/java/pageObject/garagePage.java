package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class garagePage extends setup {
    public garagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }
    @FindBy(how = How.XPATH, using = "//body/div[@id='upgrade']/div[@id='maincontent']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[3]")
    public WebElement goToMyGarageLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__39___BV_tab_button__']")
    public WebElement savedDealsLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__43___BV_tab_button__']")
    public WebElement recentlyViewedVehiclesLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__45___BV_tab_button__']")
    public WebElement myAppointmentsLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__47___BV_tab_button__']")
    public WebElement myTradesLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__49___BV_tab_button__']")
    public WebElement myAccountLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__70___BV_tab_button__']")
    public WebElement myAddressLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__97___BV_tab_button__']")
    public WebElement myPasswordLocator;
    @FindBy(how = How.XPATH, using = "//a[@id='__BVID__114___BV_tab_button__']")
    public WebElement myDocumentsLocator;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign Out')]")
    public WebElement signOutLocator;

    public void goToMyGarage(){
        goToMyGarageLocator.click();
    }
    public void goToSavedDeals(){
        savedDealsLocator.click();
    }
    public void goToRecentlyViewedVehicles(){
        recentlyViewedVehiclesLocator.click();
    }
    public void goToMyAppointments(){
        myAppointmentsLocator.click();
    }
    public void goToMyTrades(){
        myTradesLocator.click();
    }
    public void goToMyAccount(){
        myAccountLocator.click();
    }
    public void goToMyAddress(){
        myAddressLocator.click();
    }
    public void goToMyPassword(){
        myPasswordLocator.click();
    }
    public void goToMyDocuments(){
        myDocumentsLocator.click();
    }
    public void goToSignOut(){
        signOutLocator.click();
    }
}
