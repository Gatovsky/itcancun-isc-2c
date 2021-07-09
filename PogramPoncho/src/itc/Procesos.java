
package itc;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Procesos {

    public  static int longitud(){
        return Integer.parseInt(JOptionPane.showInputDialog("Longitud del Array"));
    }

    //---Método de llenado indefinido
    public static int[] guardarArrayCicloIndefinido(){
        int[] arrayN = new int[longitud()];
        int contador = 0;
        boolean salir = false;

        do{
            try{
                arrayN[contador] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número al array\nen la posición "+ contador));
                contador++;
                char escape = JOptionPane.showInputDialog(null, "Salir s/n?").charAt(0);
                if (escape == 's' || escape == 'S'){
                    salir = true;
                }

            }catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Fuera del límite de array: "+e.getLocalizedMessage());
                //---Reiniciar el contador para evitar un bucle desde un índice fuera de rango
                contador = 0;

            }catch (StringIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "La respuesta no debe ser un valor vacío ");
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Imposible darle valor numérico a: "+ e.getMessage());
            }
        }while (!salir);

        return arrayN;
    }
    
    public static int sumarNumeros(int[] arrayNum) {
        int suma = 0;
        for (int numero = 0; numero <= arrayNum.length-1; numero++)
            suma += arrayNum[numero];
        return suma;
    }

    
    public static int productoNumeros(int[] arrayNum) throws ArithmeticException{
        int producto = 1;
        for (int numero = 0; numero <= arrayNum.length-1; numero++){
            producto *= arrayNum[numero];
            System.out.println("Valor en el índice "+numero+ ": "+ arrayNum[numero]);
        }
        return producto;
    }
}
 

        