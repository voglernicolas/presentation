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
    public @FindBy(id = "txtNameStep1")
    static WebElement txtName;

    public @FindBy(id = "select2-ProvinceStep1-container")
    static WebElement optProvincia;
    public @FindBy(id = "select2-ProvinceStep1-results")
    static WebElement optProvincia2;

    public @FindBy(id = "PhoneCodeStep1")
    static WebElement codigoArea;

    public @FindBy(id = "PhoneNumberStep1")
    static WebElement phoneNumber;

    public @FindBy(id = "btnSubmitHealthStep1")
    static WebElement btnSubmitCotizacion;


    // Funciones
    public void sendTxtName(String nombre) throws Exception {
        sendKeysToWebElement(txtName, nombre);
    }

    public void selectProvincia(String provincia) throws Exception {
        waitAndClickElement(optProvincia);
        clickOnTextFromDropdownList(optProvincia2, provincia);
    }

    public void sendCodigoArea(String codigo) throws Exception {
        sendKeysToWebElement(codigoArea, codigo);
    }

    public void sendPhone(String phone) throws Exception {
        sendKeysToWebElement(phoneNumber, phone);
    }

    public void submitCotizacion() throws Exception {
        waitAndClickElement(btnSubmitCotizacion);
    }

}
