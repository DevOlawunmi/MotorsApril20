package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage (WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
