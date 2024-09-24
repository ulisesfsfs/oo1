
package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{

	private double descubierto;
	
	public CuentaCorriente() {
		this.setDescubierto(0);
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}
	
	public void setDescubierto(double monto) {
		this.descubierto=monto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo() - monto)>=this.getDescubierto();
	}
	
}
