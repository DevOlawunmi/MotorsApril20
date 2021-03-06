package co.uk.motors.hooks;

import co.uk.motors.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Browsers {
    public String chromeBrowser = "Chrome";
private Scenario scenario;
    @Before
    public void setUp(Scenario scenario){
        this.scenario = scenario;
        launchBrowser(chromeBrowser);
    }
    @After
    public void tearDown(){
        if (scenario.isFailed())

        {
            try{
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot,"screenshot.png","failurePage");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
