public class Conductor extends Usuario{
    private Vehiculo vehiculo;

    public double getPorcentajeComision(){
        if(this.vehiculo.añosAntiguedad()<5){
            return 1;
        }
        else{
            return 10;
        }
    }
}
