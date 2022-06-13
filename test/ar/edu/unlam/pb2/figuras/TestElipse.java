package ar.edu.unlam.pb2.figuras;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestElipse {

	@Test
	void nuevaElipse() {
		Elipse elipse = cuandoCreoUnaElipse();
		laElipseDeberiaSerNueva(elipse);
	}

	@Test
	void elipseExistente() {
		Elipse elipse = dadoQueExisteUnaElipse(new Punto(), 5.0, 3.0);
		laElipseDeberiaTenerSusValoresCorrectos(elipse);
	}

	@Test
	void areaDeElipse() {
		Elipse elipse = dadoQueExisteUnaElipse(new Punto(), 5.0, 3.0);
		Double area = cuandoCalculoelAreaDeLaElipse(elipse);
		suAreaDeberiaSerCorrecta(area);
	}

	@Test
	void muevoLaElipse() {
		Elipse elipse = dadoQueExisteUnaElipse(new Punto(), 5.0, 3.0);
		cuandoMuevoLaElipse(elipse, 3.0, 6.0);
		laElipseSeDeberiaMover(elipse);
	}

	private Double cuandoCalculoelAreaDeLaElipse(Elipse elipse) {
		return elipse.area();
	}

	private void cuandoMuevoLaElipse(Elipse elipse, Double x, Double y) {
		elipse.mover(x, y);
	}

	private void suAreaDeberiaSerCorrecta(Double area) {
		Assert.assertEquals(area, (Double) 47.1, .01);
	}

	private void laElipseSeDeberiaMover(Elipse elipse) {
		Assert.assertTrue(elipse.getPunto().equals(new Punto(3.0, 6.0)));
	}

	private void laElipseDeberiaTenerSusValoresCorrectos(Elipse elipse) {
		Assert.assertTrue(
				elipse.getPunto().equals(new Punto()) && elipse.getLado1() == 5.0 && elipse.getLado2() == 3.0);
	}

	private void laElipseDeberiaSerNueva(Elipse elipse) {
		Assert.assertTrue(elipse.area().equals(0.0));
	}

	private Elipse dadoQueExisteUnaElipse(Punto punto, Double rad1, Double rad2) {
		return new Elipse(punto, rad1, rad2);
	}

	private Elipse cuandoCreoUnaElipse() {
		return new Elipse();
	}

}
