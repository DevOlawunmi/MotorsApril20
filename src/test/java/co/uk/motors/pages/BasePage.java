package co.uk.motors.pages;

import co.uk.motors.commons.DriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
// Is this the utilities page?

public class BasePage extends DriverLib {
    private String BASE_URL = "https://www.motors.co.uk/";
    public Select select;

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }
    public void selectElementByVisibleText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectElementByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);
    }
    public void selectElementByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }
    public void waitForElementToBeDisplayed(WebElement element){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
