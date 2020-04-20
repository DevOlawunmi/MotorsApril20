package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CarReviewsPage extends BasePage {
    public CarReviewsPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
