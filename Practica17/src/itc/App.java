package itc;
/*
programa que lee y escribe em un documento usando las clases FileReader & FileWriter
NOTA: estas clases realizan lectura únicamente caracter por caracter
 */
import javax.swing.JOptionPane;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        ManipularArchivo file = new ManipularArchivo();

        file.setDirArchivo(JOptionPane.showInputDialog("Ruta del archivo"));


        try {
            file.setFrase(JOptionPane.showInputDialog("Escriba un frase"));
            file.escribirArchivo();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            file.leerArchivo();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
