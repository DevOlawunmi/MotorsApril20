package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(className = "r__head")
private List<WebElement> results;
    @FindBy(className = "sr__header__count")
    private WebElement pageTitle;

    public void isCorrectURLDisplayedForSearch(String search){
        driver.getCurrentUrl().contains(search.toLowerCase());
    }
    public void isSearchResultPageDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public ProductDetailsPage clickOnAnyResult(){
        Random random = new Random();
       int randomResult = random.nextInt(results.size()-1);
       results.get(randomResult).click();
       return new ProductDetailsPage(driver);

    }
}
