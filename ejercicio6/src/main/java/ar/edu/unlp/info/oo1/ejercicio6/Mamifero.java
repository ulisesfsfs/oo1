package ar.edu.unlp.info.oo1.ejercicio6;
import java.time.*;
public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private Mamifero Padre;
	private Mamifero Madre;
	
	public Mamifero(String id) {
		this.identificador=id;
	}
	
	public Mamifero() {
		
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Mamifero getPadre() {
		return Padre;
	}
	public void setPadre(Mamifero padre) {
		Padre = padre;
	}
	public Mamifero getMadre() {
		return Madre;
	}
	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.getMadre()!=null) {
			return this.getMadre().getPadre();
		}
		else
			return null;
	}
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre()!=null) {
			return this.getMadre().getMadre();
		}
		else
			return null;
	}
	public Mamifero getAbueloPaterno() {
		if(this.getPadre()!=null) {
			return this.getPadre().getPadre();
		}
		else
			return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre()!=null) {
			return this.getPadre().getMadre();
		}
		else
			return null;
	}
	
	public boolean Equals(Object mamifero) {
		if(mamifero instanceof Mamifero) {
			Mamifero mamiferoAux=(Mamifero)mamifero;
			if(this.identificador.equals(mamiferoAux.getIdentificador()) &&
					this.especie.equals(mamiferoAux.getEspecie()) &&
					this.fechaDeNacimiento.equals(mamiferoAux.getFechaDeNacimiento())&&
					this.Padre.Equals(mamiferoAux.getPadre())&&
					this.Madre.Equals(mamiferoAux.getMadre())){
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public Boolean tieneComoAncestroA(Mamifero mamifero) {
		
			
	}
	
	
	
	
	
}
