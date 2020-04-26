package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarValuationPage extends BasePage {
    public CarValuationPage(WebDriver driver){
        DriverLib.driver =driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(tagName = "h1")
    private WebElement pageTitle;
    @FindBy(xpath = "//*[@id=\"vyv-form\"]/div/div[2]/button")
    private WebElement submitForm;

    public void isPageTitleDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCorrectURLDisplayedForCarValuation(String carReg){
        driver.getCurrentUrl().contains(carReg.toLowerCase());
    }
    public void submitValueYourVehicleForm(){
        submitForm.click();

    }
}
