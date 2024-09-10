package ar.edu.unlp.info.oo1.ejercicio5;

public class Circulo {

	private Double radio=0.0;
	private Double diametro=0.0;
	
	public Double getDiametro() {
		return this.getDiametro();
	}
	
	public void setDiametro(Double diametro) {
		this.diametro=diametro;
	}
	
	public Double getRadio() {
		return this.radio;
	}
	
	public void setRadio(Double radio) {
		this.radio=radio;
	}
	
	public Double getPerimetro() {
		return Math.PI*this.getDiametro();
	}
	
	public Double getArea() {
		return Math.PI*(this.getRadio()*this.getRadio());
	}
	
}
