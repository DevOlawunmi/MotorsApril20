package co.uk.motors.stepDefinitions;

import co.uk.motors.pages.BasePage;
import co.uk.motors.pages.HomePage;
import co.uk.motors.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class RegisterToSellACarSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);


    @And("user enters valid {string}")
    public void userEntersValid(String email) {
homePage.enterEmail(email);
    }

    @When("a user clicks on Sell")
    public void aUserClicksOnSell() {
homePage.clickOnSellTab();
    }

    @And("user clicks on the signUp button")
    public void userClicksOnTheSignUpButton() {
signInPage = homePage.clickOnSignUpButton();
    }

    @Then("the sign in page is displayed")
    public void theSignInPageIsDisplayed() {
signInPage.isSignInPageDisplayed();
    }
}

