package itc;
/*
Trabajando con FileReader y Buffered
 */

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void accesoArchivo(){

        try {

            FileReader fileR = new FileReader("/home/hector/miprimerarchivo.txt");
            BufferedReader br = new BufferedReader(fileR);
            String linea = br.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }

        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void main(String[] args){
        int sel;
        boolean salir = false;
        do{
            try {
                sel = Integer.parseInt(JOptionPane.showInputDialog("1 - Leer archivo\n2 - Salir"));
                if (sel == 2){
                    salir = true;
                }
                if (sel == 1){
                    accesoArchivo();
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while (!salir);

    }

}
