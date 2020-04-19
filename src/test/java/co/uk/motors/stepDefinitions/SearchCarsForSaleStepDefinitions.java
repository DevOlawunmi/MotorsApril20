package co.uk.motors.stepDefinitions;

import co.uk.motors.pages.BasePage;

import co.uk.motors.pages.HomePage;
import co.uk.motors.pages.ProductDetailsPage;
import co.uk.motors.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchCarsForSaleStepDefinitions extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);
    ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);
    @Given("a user is on Motors homepage")
    public void a_user_is_on_Motors_homepage() {
        launchURL();

    }

    @When("user enters {string}")
    public void user_enters(String postcode) {
homePage.enterPostcode(postcode);
    }

    @When("user selects {string} from the vehicle make options")
    public void user_selects_from_the_vehicle_make_options(String carMake) {
homePage.selectVehicleMake(carMake);
    }

    @When("user selects {string} from the minimum price list")
    public void user_selects_from_the_minimum_price_list(String miniPrice) {
homePage.selectMinimumPrice(miniPrice);
    }

    @When("user selects {string} from the maximum price list")
    public void user_selects_from_the_maximum_price_list(String maxiPrice) {
        homePage.selectMaximumPrice(maxiPrice);

    }

    @When("user clicks on the search button")
    public void user_clicks_on_the_search_button() {
searchResultPage = homePage.clickOnSearchButton();
    }

    @Then("a list of vehicle {string} in {string} is displayed")
    public void a_list_of_vehicle_in_is_displayed(String search, String postcode) {
searchResultPage.isCorrectURLDisplayedForSearch(search);
searchResultPage.isSearchResultPageDisplayed();

    }

    @Then("user clicks on one of the result links")
    public void user_clicks_on_one_of_the_result_links() {
productDetailsPage= searchResultPage.clickOnAnyResult();
    }


    @When("user accepts all cookies")
    public void userAcceptsAllCookies() {
        homePage.cookieConsent();
    }
}
