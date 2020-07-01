package PageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com")
public class BusquedaPageObject extends PageObject {
	
	public void ingresarBusqueda(String valor) {
		find(By.name("q")).sendKeys(valor);
		find(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	public void ValidarResultado() {
		String resultadostxt=find(By.id("result-stats")).getText();
		String[] num_resultado=resultadostxt.split(" ");
		int numero=Integer.parseInt(num_resultado[2].replaceAll(",", ""));
		System.out.println("cantidad de resultados arrojados "+numero);
		if(numero>5410000) {
			assertTrue("Se valida correctamente la cantidad de resultados arrojados",true);
		}else {
			assertTrue("la cantidad de resultados no es la correcta",false);
		}
	}

}
