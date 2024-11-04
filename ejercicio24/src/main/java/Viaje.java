import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public class Viaje {
    private String origen;
    private String destino;
    private double costo;
    private  Vehiculo vehiculo;
    private LocalDate fecha;
    private List<Usuario> pasajeros;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
