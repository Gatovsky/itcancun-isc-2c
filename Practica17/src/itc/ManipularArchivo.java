package itc;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipularArchivo extends File{

    ManipularArchivo(){}

    @Override
    public void leerArchivo() throws IOException {
        //---apertura de Stream
        FileReader fr = new FileReader(getDirArchivo());

        int contador = fr.read();
        while (contador != -1){
            //---FileReader maneja valores numéricos. para poder visualizar se hace un casteo a char
            System.out.print((char) contador);
            contador = fr.read();
        }
        fr.close();
    }

    public void escribirArchivo() throws IOException{
        //--- al pasar el parámetro true se evita sobreescribir el archivo
        FileWriter fw = new FileWriter((getDirArchivo()), true);

        fw.write(getFrase());
        fw.close();


    }

}
