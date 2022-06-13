package ar.edu.unlam.pb2.figuras;

public abstract class Figura implements Comparable<Figura>, Movible {
	private Punto punto;
	private Double lado1;
	private Double lado2;

	public Figura(Punto punto, Double lado1, Double lado2) {
		this.punto = punto;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public Punto getPunto() {
		return this.punto;
	}

	public void setLado1(Double lado) {
		this.lado1 = lado;
	}

	public Double getLado1() {
		return this.lado1;
	}

	public void setLado2(Double lado) {
		this.lado2 = lado;
	}

	public Double getLado2() {
		return this.lado2;
	}

	public abstract Double area();

	@Override
	public void mover(Double x, Double y) {
		this.punto.setXY(x, y);
	}

	@Override
	public int compareTo(Figura o) {
		if (this.area().equals(o.area())) {
			return 0;
		}

		if (this.area().compareTo(o.area()) > 0) {
			return 1;
		}
		return -1;
	}
}
