package co.uk.motors.hooks;

import co.uk.motors.commons.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browsers {
    public String chromeBrowser = "Chrome";

    @Before
    public void setUp(){
        launchBrowser(chromeBrowser);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
