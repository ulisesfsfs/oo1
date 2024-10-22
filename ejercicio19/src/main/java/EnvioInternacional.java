public class EnvioInternacional extends Envio{

    public Double getCosto(){
        if(this.getPeso()<=1000){
            return 5000 + (10*this.getPeso());
        }
        else{
            return 5000 + (12*this.getPeso());
        }
    }
}
