package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{

	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo()-monto)>=0;
	}
}
