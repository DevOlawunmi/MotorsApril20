package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy( tagName = "h1")
    private WebElement pageTitle;

    public void isCorrectURLDisplayed(String account){
driver.getCurrentUrl().contains(account.toLowerCase());
    }

    public void isSignInPageDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }








}
