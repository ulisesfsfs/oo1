package ar.edu.unlp.info.oo1.ejercicio11;
import java.util.*;
public class Inversor {

	private String nombre;
	private List<Inversion> inversiones;
	
	public double valorActual() {
		return this.inversiones.stream().forEach(i->i.valorActual());
	}
}
