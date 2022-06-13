package ar.edu.unlam.pb2.figuras;

public class Punto {
	private Double x;
	private Double y;

	public Punto() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public void setXY(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Punto getPunto() {
		return this;
	}

	public Double getX() {
		return this.x;
	}

	public Double getY() {
		return this.y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		Punto punto = (Punto) o;
		
		if(this.x.equals(punto.getX()) && this.y.equals(punto.getY()))
			return true;
		
		return false;	
	}
}
