public class Corporativo extends  Cliente{

    private String nombre;
    private Double CUIT;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCUIT() {
        return CUIT;
    }

    public void setCUIT(Double CUIT) {
        this.CUIT = CUIT;
    }
}
