package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {

	private int cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;
	
	public void ponerEnCero() {
		this.cantidadDeProductos=0;
		this.precioTotal=0.0;
		this.pesoTotal=0.0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal+=producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		return new Ticket();
	}
}
