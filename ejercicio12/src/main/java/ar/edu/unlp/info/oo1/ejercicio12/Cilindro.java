package ar.edu.unlp.info.oo1.ejercicio12;

public class Cilindro extends Pieza{

	private int radio;
	private int altura;
	
	
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public double getVolumen() {
		return (Math.pow(radio,2)) * this.getAltura()*Math.PI;
	}
	
	public double getSuperficie() {
		return (2*Math.PI*this.getRadio() * this.getAltura()) + (2*Math.PI*(Math.pow(radio, 2)));
	}
}
