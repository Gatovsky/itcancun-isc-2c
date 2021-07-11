package practica20_2;
/*
Trabajando con FileWriter
 */

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void menuIf(){
        String saltoLinea = "\n";
        String tabulador = "\t";
        FileWriter fileW;

        try {
            fileW = new FileWriter("/home/hector/miprimerarchivo.txt", true);
            String texto = JOptionPane.showInputDialog("Texto");
            fileW.write(texto+saltoLinea);
            fileW.flush();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void main(String[] args){
        int sel;
        boolean salir = false;
        do{
            try {
                sel = Integer.parseInt(JOptionPane.showInputDialog("1 - Escribir en archivo\n 2 - Salir"));
                if (sel == 2){
                    salir = true;
                }
                if (sel == 1){
                    menuIf();
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while (!salir);

    }

}
