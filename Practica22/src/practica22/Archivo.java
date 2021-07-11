package itc;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Archivo {
    private String ruta;
    private String entrada; //---usar solo en caso de no implementar un ArrayList

    public Archivo(){}

    public void setRuta(String ruta){
        this.ruta = ruta;
    }

    public String getRuta(){
        return this.ruta;
    }

    public void setEntrada(String entrada){
        this.entrada = entrada;
    }

    public String getEntrada() {
        return this.entrada;
    }


    public abstract void leerArchivo() throws IOException;

    public abstract void escribirArchivo(ArrayList<RegistroVehiculo> arrayListRegistroVehiculo) throws IOException;

    public abstract boolean archivoVacio(String archivo) throws IOException;

    public abstract void abrirArchivo(String archivo) throws IOException;

}
