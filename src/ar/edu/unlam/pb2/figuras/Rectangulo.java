package ar.edu.unlam.pb2.figuras;

public class Rectangulo extends Figura {
	private Punto esqSupDer;

	public Rectangulo() {
		super(new Punto(), 0.0, 0.0);
		this.esqSupDer = new Punto();
	}

	public Rectangulo(Punto esqInfIzq, Double lado1, Double lado2) {
		super(esqInfIzq, lado1, lado2);
		esqSupDer = calcularEsqSupDer(esqInfIzq, lado1, lado2);
	}

	private Punto calcularEsqSupDer(Punto esqInfIzq, Double lado1, Double lado2) {
		return new Punto(esqInfIzq.getX() + lado1, esqInfIzq.getY() + lado2);
	}

	public Punto getEsqSupDer() {
		return this.esqSupDer;
	}

	public void setEsqSupDer(Punto punto) {
		this.esqSupDer = punto;
	}

	@Override
	public void mover(Double x, Double y) {
		super.mover(x, y);
		esqSupDer = calcularEsqSupDer(this.getPunto(), this.getLado1(), this.getLado2());
	}

	@Override
	public Double area() {
		return this.getLado1() * this.getLado2();
	}
}
