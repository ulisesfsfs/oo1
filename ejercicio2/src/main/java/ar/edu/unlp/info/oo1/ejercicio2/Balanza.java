package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {

	private int cantidadDeProductos=0;
	private Double precioTotal=0.0;
	private Double pesoTotal=0.0;
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0.0;
		this.pesoTotal=0.0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal+=producto.getPeso();
		this.precioTotal+=producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(LocalDate.now(),this.cantidadDeProductos,this.precioTotal,this.pesoTotal);
	}
}
