package ar.edu.unlam.pb2.figuras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TestFiguraCollection {

	@Test
	void figurasOrdenadas() {
		Rectangulo rectangulo1 = dadoQueExisteUnRectangulo(new Punto(), 5.0, 5.0);
		Rectangulo rectangulo2 = dadoQueExisteUnRectangulo(new Punto(), 2.0, 3.0);
		Elipse elipse1 = dadoQueExisteUnaElipse(new Punto(), 4.0, 7.0);
		Elipse elipse2 = dadoQueExisteUnaElipse(new Punto(), 2.0, 2.0);

		List<Figura> listaEsperada = new ArrayList<>();
		listaEsperada.add(rectangulo2);
		listaEsperada.add(elipse2);
		listaEsperada.add(rectangulo1);
		listaEsperada.add(elipse1);
		
		List<Figura> lista = cuandoLosCargoEnUnaListaYLosOrdeno(rectangulo1, rectangulo2, elipse1, elipse2);
		
		laListaDeberiaEstarOrdenada(lista, listaEsperada);

	}

	private void laListaDeberiaEstarOrdenada(List<Figura> lista, List<Figura> listaEsperada) {
		Assert.assertEquals(lista, listaEsperada);
	}

	private List<Figura> cuandoLosCargoEnUnaListaYLosOrdeno(Rectangulo rectangulo1, Rectangulo rectangulo2, Elipse elipse1,
			Elipse elipse2) {
		List<Figura> lista = new ArrayList<>();

		lista.add(rectangulo1);
		lista.add(rectangulo2);
		lista.add(elipse1);
		lista.add(elipse2);
		
		Collections.sort(lista);
		
		return lista;
	}

	private Elipse dadoQueExisteUnaElipse(Punto centro, Double rad1, Double rad2) {
		return new Elipse(centro, rad1, rad2);
	}

	private Rectangulo dadoQueExisteUnRectangulo(Punto esqInfDer, Double lad1, Double lad2) {
		return new Rectangulo(esqInfDer, lad1, lad2);
	}

}
