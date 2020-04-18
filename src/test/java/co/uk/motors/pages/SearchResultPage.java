package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(className = ".image.image--v")
private List<WebElement> results;

    public void isCorrectURLDisplayedForSearch(String search){
        driver.getCurrentUrl().contains(search.toLowerCase());
    }
}
