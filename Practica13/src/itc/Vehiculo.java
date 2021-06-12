package itc;


public class Vehiculo implements InterfaceVehiculo{
    protected int velocidades;
    protected boolean encendido;
    protected String numeroSerie;
    protected int llantas;
    protected int puertas;
    protected String color;
    protected int capPersonas;
    protected int velocidad;


    @Override
    public void frenar() {
        if(encendido && velocidad>0){
            this.velocidad--;
        }
    }

    @Override
    public void acelerar(int velocidad) {
        if(encendido && velocidad<VELOCIDAD_MAXIMA){
            this.velocidad=velocidad;
        }
    }

    @Override
    public void encender() {
        if(!encendido){
            this.encendido=true;
        }
    }

    @Override
    public void apagar() {
        if(encendido){
            this.encendido=false;
        }
    }
}