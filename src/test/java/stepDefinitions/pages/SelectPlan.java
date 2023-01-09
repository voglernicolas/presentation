package stepDefinitions.pages;

import base.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SelectPlan extends BaseMethods {

    public SelectPlan() {
        super();
    }

    // Selectores
    public @FindBy(id = "txtPersons")
    static WebElement cAdultos;

    public @FindBy(id = "txtChildren")
    static WebElement cMenores;

    public @FindBy(id = "btnSubmitHealthStep2")
    static WebElement btnSiguiente;


    // Funciones

    public void cantidadAdultos(String adultos) throws Exception {
        sendKeysToWebElement(cAdultos, adultos);
    }

    public void cantidadMenores(String menores) throws Exception {
        sendKeysToWebElement(cMenores, menores);
    }

    public void selectNewPlan(String plan) throws Exception {
        WebElement element = driver.findElement(By.xpath("//span[contains(.,'" + plan + "')]"));
        waitAndClickElement(element);
        Thread.sleep(5000);
    }

    public void clickSiguiente() throws Exception {
        waitAndClickElement(btnSiguiente);
    }

}