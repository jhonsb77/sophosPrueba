package Definitions;

import org.openqa.selenium.By;

import Steps.BusquedaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaDefinition {
	
	@Steps
	BusquedaSteps ob;
	
	@Given("^Ingresar a la URL de google$")
	public void IngresarURL() throws Exception {
		ob.ingresarNavegador();
	}
	
	@When("^Realizar la busqueda \"([^\"]*)\"$")
	public void IngresarBusqueda(String valor) throws Exception {
		ob.ingresarBusquedaStep(valor);
	}
	
	@Then("^Validar la cantidad de resultados arrojados$")
	public void ValidarResultado() {
		ob.ValidarResultadoStep();
	}
	
}
