package Steps;

import PageObject.BusquedaPageObject;

public class BusquedaSteps {
	
	BusquedaPageObject ob;
	
	public void ingresarNavegador() {
		ob.open();
	}
	
	public void ingresarBusquedaStep(String valor) {
		ob.ingresarBusqueda(valor);
	}
	
	public void ValidarResultadoStep() {
		ob.ValidarResultado();
	}
	

}
