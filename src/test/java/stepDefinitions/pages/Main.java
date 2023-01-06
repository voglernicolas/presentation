package stepDefinitions.pages;

import base.BaseMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Main extends BaseMethods {

    public Main() {
        super();
    }

    // Selectores
    // Left main
    public @FindBy(xpath = "")
    static WebElement leftDescrip;

    // Funciones

    // Nav
    public void checkForYou() throws IOException, InterruptedException {
        //waitAndClickElement(menuForYou);
        //waitAndClickElement(forYouDownload);
    }
}
