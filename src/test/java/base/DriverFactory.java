package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.pages.Main;

public class DriverFactory {

    public static WebDriver driver;

    public static Main main;

    @Before
    public WebDriver getDriver() {

        // driver and browser set up
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // config default browser
        driver.manage().window().maximize();
        driver.get("https://purchase-testing.klimber.com/ar/Emergencias/Index");

        // page factory
        main = PageFactory.initElements(driver, Main.class);

        return driver;
    }



}
