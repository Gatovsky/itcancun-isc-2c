package itc;
/*
programa que lee y escribe em un documento usando las clases FileReader & FileWriter
NOTA: estas clases realizan lectura únicamente caracter por caracter
 */
import javax.swing.JOptionPane;
import java.io.IOException;


public class App {

    public static ManipularArchivo menu(int sel){
        ManipularArchivo file = null;
        switch (sel){
            case 1:
                try {
                    file = new ManipularArchivo();
                    file.setDirArchivo(JOptionPane.showInputDialog("Ruta del archivo"));
                    file.leerArchivo();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
            case 2:
                try {
                    file = new ManipularArchivo();
                    file.setDirArchivo(JOptionPane.showInputDialog("Ruta del archivo"));
                    file.setFrase(JOptionPane.showInputDialog("Escriba un frase"));
                    file.escribirArchivo();
                }catch (IOException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
        }
        return file;
    }
    public static void main(String[] args) {
        int sel = 0;
        boolean salir = false;

        do {
            try {

              sel = Integer.parseInt(JOptionPane.showInputDialog("1 - Leer archivo\n" +
                      "2 - Escribir archivo\n" +
                      "3 - salir"));
              if(sel == 3){
                  salir = true;
              }
              menu(sel);

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error tipo de dato");
            }
        }while (!salir);

    }
}
