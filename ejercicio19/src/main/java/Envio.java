import java.time.LocalDate;

public abstract class Envio {

    private LocalDate fechaDespacho;
    private String dirOrigen;
    private String dirDestino;
    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(LocalDate fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public String getDirOrigen() {
        return dirOrigen;
    }

    public void setDirOrigen(String dirOrigen) {
        this.dirOrigen = dirOrigen;
    }

    public String getDirDestino() {
        return dirDestino;
    }

    public void setDirDestino(String dirDestino) {
        this.dirDestino = dirDestino;
    }

    public abstract Double getCosto();
}
