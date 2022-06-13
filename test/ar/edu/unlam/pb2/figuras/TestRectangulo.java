package ar.edu.unlam.pb2.figuras;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestRectangulo {

	@Test
	void nuevoRectangulo() {
		Rectangulo rectangulo = cuandoCreoUnRectangulo();
		elRectanguloDeberiaSerNuevo(rectangulo);
	}

	@Test
	void rectanguloExistente() {
		Rectangulo rectangulo = dadoQueExisteUnRectangulo(new Punto(), 3.0, 4.0);
		elRectanguloDeberiaTenerSusValoresCorrectos(rectangulo);
	}

	@Test
	void areaDelRectangulo() {
		Rectangulo rectangulo = dadoQueExisteUnRectangulo(new Punto(), 3.0, 4.0);
		Double area = cuandoCalculoElAreaDelRectangulo(rectangulo);
		suAreaDeberiaSerCorrecta(area);
	}

	@Test
	void muevoElRectangulo() {
		Rectangulo rectangulo = dadoQueExisteUnRectangulo(new Punto(), 3.0, 4.0);
		cuandoMuevoElRectangulo(rectangulo, 3.0, 6.0);
		elRectanguloDeberiaHaberseMovido(rectangulo);
	}

	private void cuandoMuevoElRectangulo(Rectangulo rectangulo, Double x, Double y) {
		rectangulo.mover(x, y);
	}

	private Double cuandoCalculoElAreaDelRectangulo(Rectangulo rectangulo) {
		return rectangulo.area();
	}

	private void elRectanguloDeberiaHaberseMovido(Rectangulo rectangulo) {
		Assert.assertTrue(rectangulo.getEsqSupDer().equals(new Punto(6.0, 10.0))
				&& rectangulo.getPunto().equals(new Punto(3.0, 6.0)));

	}

	private void suAreaDeberiaSerCorrecta(Double area) {
		Assert.assertEquals(area, 12.0, .01);

	}

	private void elRectanguloDeberiaTenerSusValoresCorrectos(Rectangulo rectangulo) {
		Assert.assertTrue(
				rectangulo.getPunto().equals(new Punto()) && rectangulo.getEsqSupDer().equals(new Punto(3.0, 4.0))
						&& rectangulo.getLado1().equals(3.0) && rectangulo.getLado2().equals(4.0));
	}

	private void elRectanguloDeberiaSerNuevo(Rectangulo rectangulo) {
		Assert.assertEquals(rectangulo.area(), (Double) 0.0);
	}

	private Rectangulo dadoQueExisteUnRectangulo(Punto esqInfIzq, Double lad1, Double lad2) {
		return new Rectangulo(esqInfIzq, lad1, lad2);
	}

	private Rectangulo cuandoCreoUnRectangulo() {
		return new Rectangulo();
	}

}
