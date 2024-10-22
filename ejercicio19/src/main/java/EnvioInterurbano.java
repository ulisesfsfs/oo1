public class EnvioInterurbano extends  Envio{

    private Double distanciaKm;

    public Double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(Double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public Double getCosto(){

        if(this.distanciaKm<100){
            return 20.0 * this.getPeso();
        }
        else {
            if(this.distanciaKm <500){
                return 25.0 * this.getPeso();
            }
            else {
                return 30 * this.getPeso();
            }
        }
    }

}
