package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.*;
public class Ticket {

	private LocalDate fecha;
	private int cantidadDeProductos;
	private Double pesoTotal;
	private Double precioTotal;
	
	public Ticket(LocalDate fecha,int cantidadDeProductos,Double precioTotal,Double pesoTotal) {
		this.fecha=fecha;
		this.cantidadDeProductos=cantidadDeProductos;
		this.precioTotal=precioTotal;
		this.pesoTotal=pesoTotal;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Double impuesto() {
		return (Double)(21*this.precioTotal)/100;
	}
}
