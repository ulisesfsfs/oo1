import java.util.List;

public abstract class Cliente {

    private String direccion;
    private List<Envio> envios;

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getDireccion(){
        return this.direccion;

    }

    public void addEnvio(Envio envio){
        this.envios.add(envio);
    }
}
