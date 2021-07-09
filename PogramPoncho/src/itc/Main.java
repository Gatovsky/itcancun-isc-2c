
package itc;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
        int suma;
        int producto;

       //---Llamada de métodos
        try {
            int[] numeros = Procesos.guardarArrayCicloIndefinido();
            suma = Procesos.sumarNumeros(numeros);
            producto = Procesos.productoNumeros(numeros);

            JOptionPane.showMessageDialog(null, " la suma de los números es: " + suma);
            JOptionPane.showMessageDialog(null, "El producto de los números es: " + producto);


        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Tipo de dato inválido. No se puede convertir a Integer el dato:\n"+ e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Está intentando agregar un elemento fuera de rango." +
                    "\nel Array no admite más elementos: "+ e.getMessage());

        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Error aritmético " + e.getMessage());
        }

       }

}
