package ar.edu.unlp.info.oo1.ejercicio5;

public class Cuadrado {

	private Double lado=0.0;
	
	public void setLado(Double lado) {
		this.lado=lado;
	}
	public Double getLado() {
		return this.lado;
	}
	
	public Double getPerimetro() {
		return this.getLado()*4;
	}
	
	public Double getArea() {
		return this.lado*this.lado;
	}
	
	
}
