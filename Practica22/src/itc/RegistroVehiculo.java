package itc;

public class RegistroVehiculo {
    private String matricula;
    private String marca;
    private double cargaMax;
    private String modelo;

    public RegistroVehiculo(){}

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setCargaMax(double cargaMax){
        this.cargaMax = cargaMax;
    }

    public Double getCargaMax(){
        return  this.cargaMax;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return this.modelo;
    }
}
