package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.*;
public class Carpeta {

	private String nombre;
	private List<Email> emails;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void almacenar(Email email) {
		this.emails.add(email);
	}
	
	public void mover(Email email,Carpeta destino) {
		this.emails.remove(email);
		destino.almacenar(email);
	}
	
}
