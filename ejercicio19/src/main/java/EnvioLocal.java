public class EnvioLocal extends  Envio{

    private boolean entregaRapida;

    public boolean isEntregaRapida() {
        return entregaRapida;
    }

    public void setEntregaRapida(boolean entregaRapida) {
        this.entregaRapida = entregaRapida;
    }

    public Double getCosto(){
        if(this.entregaRapida){
            return 1500.0;
        }
        else{
            return 1000.0;
        }
    }
}
