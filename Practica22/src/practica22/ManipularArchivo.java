package itc;

import java.awt.Desktop;
import java.io.*;
import java.util.ArrayList;

public class ManipularArchivo extends Archivo{

    @Override
    public void leerArchivo() throws IOException {
        FileReader fr = new FileReader(getRuta());
        BufferedReader br = new BufferedReader(fr);

        String linea = br.readLine();

        //---cuando el fichero termina BufferedReader devuelve null, a diferencia de FileReader que devuelve -1.
        while (linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
        br.close();
    }

    @Override
    public void escribirArchivo(ArrayList<RegistroVehiculo> arrayListRegistroVehiculo) throws IOException {
        FileWriter fw = new FileWriter(getRuta(), true);
        BufferedWriter bw = new BufferedWriter(fw);

        //---Si el archivo está vacío se agregan los nombres de las columnas
        if(archivoVacio(getRuta())){
            bw.write("Matricula\tMarca\tCarga_Maxima\tModelo");
            bw.newLine();
            bw.flush();
        }

        for(RegistroVehiculo registro: arrayListRegistroVehiculo){
            bw.write(registro.getMatricula()+"\t"+registro.getMarca()+
                    "\t"+registro.getCargaMax()+"\t"+registro.getModelo());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    @Override
    public boolean archivoVacio(String archivo) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
        return bufferedReader.readLine() == null;
    }

    @Override
    public void abrirArchivo(String archivo) throws IOException {
        //---método que abre el archivo únicamente después de finalizar la ejecución de este programa
        File file = new File(archivo);
        Desktop.getDesktop().open(file);
    }
}
