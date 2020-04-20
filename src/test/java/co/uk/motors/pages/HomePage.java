package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "PostCode")
    private WebElement postcodeField;
    @FindBy (xpath ="//*[@id=\"Make\"]")
    private WebElement vehicleMake;
    @FindBy (id = "MinPrice")
    private WebElement minimumPrice;
    @FindBy (id = "MaxPrice")
    private WebElement maximumPrice;
    @FindBy (className = "sp__btn-title")
    private WebElement searchButton;
    @FindBy (id = "gdprAgree")
    private WebElement acceptCookies;
    @FindBy (xpath = "//*[@id=\"searchOptions\"]/div/div/button[3]/div[1]")
    private WebElement sellTab;
    @FindBy (xpath = "//*[@id=\"searchPanel\"]/section/div/section/div[1]/div/div/input")
    private WebElement emailInputField;
    @FindBy (xpath = "//*[@id=\"searchPanel\"]/section/div/section/div[1]/button")
    private WebElement signUpButton;
    @FindBy (xpath = "//*[@id=\"searchPanel\"]/section/div/section/div[2]/div/div[1]/div")
    private WebElement errorMessage;

    public void cookieConsent(){
        waitForElementToBeDisplayed(acceptCookies);
        acceptCookies.click();
    }

// Search Car For Sale Methods
public void enterPostcode(String postcode){
    waitForElementToBeDisplayed(postcodeField);
    postcodeField.clear();
    postcodeField.sendKeys(postcode);
}
public void selectMinimumPrice(String miniPrice){
    selectElementByVisibleText(minimumPrice, miniPrice);
}
public void selectMaximumPrice(String maxiPrice){
    selectElementByVisibleText(maximumPrice,maxiPrice);
}
public void selectVehicleMake(String carMake){
    selectElementByVisibleText(vehicleMake, carMake);
}
public SearchResultPage clickOnSearchButton(){
    searchButton.click();
    return new SearchResultPage(driver);
}

//Register to Sell a Car Methods

public void clickOnSellTab(){
        sellTab.click();
}
public void enterEmail(String email){
        emailInputField.sendKeys(email);
}
public SignInPage clickOnSignUpButton(){
        signUpButton.click();
        return new SignInPage(driver);

}public void isErrorMessageDisplayed(){
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
