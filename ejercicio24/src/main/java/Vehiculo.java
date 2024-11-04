import java.time.LocalDate;

public class Vehiculo {
    private String nombreConductor;
    private String descripcion;
    private int capacidad;
    private LocalDate añoFabricacion;
    private double valor;


    public int añosAntiguedad(){
        return LocalDate.now().getYear()-this.añoFabricacion.getYear();
    }
}
