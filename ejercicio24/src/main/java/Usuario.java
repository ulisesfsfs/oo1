public abstract class Usuario {
    private String nombre;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract double getPorcentajeComision();

    public void agregarSaldo(double monto){
        this.saldo+=(monto-(this.getPorcentajeComision()*this.saldo)/100);
    }
}
