package stepDefinitions;

import base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class MasterHooks extends DriverFactory {

    @Before
    public void setup() throws MalformedURLException { driver = getDriver(); }

    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
        driver = null;
    }
}
