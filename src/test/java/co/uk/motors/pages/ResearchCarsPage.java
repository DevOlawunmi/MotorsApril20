package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResearchCarsPage extends BasePage {
    public ResearchCarsPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (tagName = "h1")
    private WebElement pageTitle;

    public void isCorrectURLDisplayedForReview(String car){
        driver.getCurrentUrl().contains(car);
    }

    public void isReviewPageDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCarNameDisplayedForReview(String car){
        String title = pageTitle.getText();
        title.contains(car);
    }
}
