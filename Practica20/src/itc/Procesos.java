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

    //---Método de llenado definido que devuelve un Array
    public static int[] guardarArrayNum() throws NumberFormatException, ArrayIndexOutOfBoundsException{
        int[] arrayNumeros = new int[longitud()];

        for (int i = 0; i <= arrayNumeros.length-1; i++){
            arrayNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número al array\nen la posición "+ i));
        }
        return arrayNumeros;
    }


    //---Método de llenado dinámico usando un ArrayList
    public static ArrayList<Integer> guardarArrayListNum() throws NumberFormatException {
        ArrayList<Integer> arrayListNum = new ArrayList<>();
        int contador = 1;
        int numero;

        do {
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            arrayListNum.add(numero);
        }while (contador <= 10);

        return arrayListNum;
    }

    //---Sobre carga de métodos para sumar y/o multiplicar; ya sea que reciban un Array o ArraList
    public static int sumarNumeros(ArrayList<Integer> arrayListNum) throws ArithmeticException{
        int suma = 0;
        for (int numero : arrayListNum){
            suma += numero;
        }
        return suma;
    }

    public static int sumarNumeros(int[] arrayNum) throws ArithmeticException{
        int suma = 0;
        for (int numero = 0; numero <= arrayNum.length-1; numero++)
            suma += arrayNum[numero];
        return suma;
    }

    public static int productoNumeros(ArrayList<Integer> arrayListNum) throws ArithmeticException{
        int producto = 1;
        for (int numero : arrayListNum){
            producto *= numero;
        }
        return producto;
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

