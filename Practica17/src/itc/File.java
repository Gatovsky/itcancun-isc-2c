package itc;

import java.io.IOException;

public abstract class File {
    private String dirArchivo;
    private String frase;

    File(){}

    public String getDirArchivo() {
        return this.dirArchivo;
    }

    public void setDirArchivo(String dirArchivo) {
        this.dirArchivo = dirArchivo;
    }

    public String getFrase(){
        return this.frase;
    }

    public void setFrase(String frase){
        this.frase = frase;
    }

    public abstract void leerArchivo() throws IOException;

    public abstract void escribirArchivo() throws IOException;

}
