package co.uk.motors.stepDefinitions;

import co.uk.motors.pages.BasePage;
import co.uk.motors.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ValueMyCarSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    @When("user clicks on the valuation tab")
    public void userClicksOnTheValuationTab() {
    }

    @And("user enters {string} of the car")
    public void userEntersOfTheCar(String arg0) {
    }

    @And("user enters value of car {string}")
    public void userEntersValueOfCar(String arg0) {

    }

    @And("user clicks on Value Your Car button")
    public void userClicksOnValueYourCarButton() {
    }

    @Then("the Car Valuation page is displayed")
    public void theCarValuationPageIsDisplayed() {
    }

    @And("user clicks on Value my car")
    public void userClicksOnValueMyCar() {
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
}


