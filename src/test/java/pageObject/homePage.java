package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homePage extends setup {

    public homePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//i[@id='main-menu-btn']")
    public WebElement hamburgerMenuLocator;

    @FindBy(how = How.XPATH, using = "//*[@id='menu-popover-wrapper']/div/ul/li[1]/a/div/span")
    public WebElement homeButtonLocator;

    @FindBy(how = How.XPATH, using = "//*/text()[normalize-space(.)='Lifetime Warranty']/parent::*")
    public WebElement lifetimeWarrantyButtonLocator;

    public void goToHamburger(){
        hamburgerMenuLocator.click();
    }

    public void goToHomepage(){
        homeButtonLocator.click();
    }

    public void goToWarranty(){
        lifetimeWarrantyButtonLocator.click();
    }

}




