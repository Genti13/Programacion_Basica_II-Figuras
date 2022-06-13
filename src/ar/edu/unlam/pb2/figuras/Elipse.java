package ar.edu.unlam.pb2.figuras;

public class Elipse extends Figura{

	public Elipse(){
		super(new Punto(), 0.0,0.0);
	}
	
	public Elipse(Punto centro, Double rad1, Double rad2){
		super(centro,rad1,rad2);
	}
	
	@Override
	public Double area() {
		return this.getLado1() * this.getLado2() * 3.14;
	}
}
