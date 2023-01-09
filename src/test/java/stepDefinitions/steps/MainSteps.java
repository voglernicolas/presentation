package stepDefinitions.steps;

import base.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps extends DriverFactory {

    @Given("Im on step {int}")
    public void imOnStep(int arg0) {

    }

    @When("I complete Nombre form {string}")
    public void iCompleteNombreForm(String arg0) throws Exception {
        main.sendTxtName(arg0);
    }

    @And("I complete Provincia {string}")
    public void iCompleteProvincia(String arg0) throws Exception {
        main.selectProvincia(arg0);
    }

    @Then("Click en {string}")
    public void clickEn(String arg0) throws Exception {
        main.submitCotizacion();
    }

    @And("I select Codigo Area {string}")
    public void iSelectCodigoArea(String arg0) throws Exception {
        main.sendCodigoArea(arg0);
    }

    @And("I complete Celular with {string}")
    public void iCompleteCelularWith(String arg0) throws Exception {
        main.sendPhone(arg0);
    }
}
