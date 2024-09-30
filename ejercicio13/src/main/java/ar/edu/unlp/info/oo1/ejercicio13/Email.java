package ar.edu.unlp.info.oo1.ejercicio13;
import java.util.*;
public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public List<Archivo> adjuntos(){
		return this.adjuntos;
	}
	
	public int getTamaño() {
		int tamaño=this.getTitulo().length() + this.getCuerpo().length();
		tamaño+=this.adjuntos.stream().
				mapToDouble(a->a.tamaño()).
				sum();
		return tamaño;
	}
}
