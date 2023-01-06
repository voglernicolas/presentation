package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.pages.Main;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static WebDriver driver;

    public static Main main;

    @Before
    public WebDriver getDriver() throws MalformedURLException {

        // local execution
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();

        ChromeOptions opt = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), opt);


        // config default browser
        driver.manage().window().maximize();
        driver.get("https://purchase-testing.klimber.com/ar/Emergencias/Index");

        // page factory
        main = PageFactory.initElements(driver, Main.class);

        return driver;
    }



}
