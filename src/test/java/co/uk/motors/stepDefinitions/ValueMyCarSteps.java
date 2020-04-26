package co.uk.motors.stepDefinitions;

import co.uk.motors.pages.BasePage;
import co.uk.motors.pages.CarValuationPage;
import co.uk.motors.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ValueMyCarSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CarValuationPage carValuationPage  = PageFactory.initElements(driver, CarValuationPage.class);

    @When("user clicks on the valuation tab")
    public void userClicksOnTheValuationTab() {
        homePage.clickOnValueMyCarTab();
    }

    @And("user enters {string} of the car")
    public void userEntersOfTheCar(String carRegistration) {
        homePage.enterCarRegistration(carRegistration);
    }

    @And("user enters mileage of car {string}")
    public void userEntersMileageOfCar(String mileage) {
        homePage.enterCarMileage(mileage);
    }

    @And("user clicks on Value Your Car button")
    public void userClicksOnValueYourCarButton() {
        carValuationPage=homePage.clickOnValueYourCarButton();
    }
    @Then("the Car Valuation page is displayed with {string}")
    public void theCarValuationPageIsDisplayedWith(String carReg) {

        carValuationPage.isPageTitleDisplayed();
        carValuationPage.isCorrectURLDisplayedForCarValuation(carReg);
    }

    @And("user clicks on Value my car")
    public void userClicksOnValueMyCar() {
        carValuationPage.submitValueYourVehicleForm();
    }

    @And("confirmation page is displayed")
    public void confirmationPageIsDisplayed() {
    }

    @And("user clicks on This is my vehicle")
    public void userClicksOnThisIsMyVehicle() {

    }

    @And("vehicle worth is displayed")
    public void vehicleWorthIsDisplayed() {
            }

    @And("user enters the {string}")
    public void userEntersThe(String postcode) {
        homePage.enterPostcodeForValuation(postcode);
    }


}


