package ar.edu.unlp.info.oo1.ejercicio11;

public class InversionEnAcciones extends Inversion{

	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public double valorActual() {
		return this.cantidad*this.valorUnitario;
	}
}
