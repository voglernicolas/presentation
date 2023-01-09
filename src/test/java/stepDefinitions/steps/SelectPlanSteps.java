package stepDefinitions.steps;

import base.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SelectPlanSteps extends DriverFactory {

    @And("I select plan {string}")
    public void iSelectPlan(String arg0) throws Exception {
        selectPlan.selectNewPlan(arg0);
    }

    @Then("I click on Siguiente")
    public void iClickOnSiguiente() throws Exception {
        selectPlan.clickSiguiente();
    }

    @And("I complete cantidad de adultos {string}")
    public void iCompleteCantidadDeAdultos(String arg0) throws Exception {
        selectPlan.cantidadAdultos(arg0);
    }

    @And("I complete cantidad de menores {string}")
    public void iCompleteCantidadDeMenores(String arg0) throws Exception {
        selectPlan.cantidadMenores(arg0);
    }
}
