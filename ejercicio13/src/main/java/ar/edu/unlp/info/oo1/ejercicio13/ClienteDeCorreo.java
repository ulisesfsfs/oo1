package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.*;
public class ClienteDeCorreo {

	private List<Carpeta> carpetas;
	
	
	public void recibir(Email email) {
		this.carpetas.stream()
		.filter(c->c.getNombre().equals("inbox"))
				.toList()
				.get(0).almacenar(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().findFirst()
	}
}
