package co.uk.motors.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //there's a space after the postcode classname
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

    public void cookieConsent(){
        waitForElementToBeDisplayed(acceptCookies);
        acceptCookies.click();
    }


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

}
