package itc;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Procesos {

    public static int[] guardarArrayNum() throws NumberFormatException, ArrayIndexOutOfBoundsException, InputMismatchException{
        int[] arrayNumeros = new int[10];

        for (int i = 1; i <= 10; i++){
            arrayNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número al array\nen la posición "+ i));
        }
        return arrayNumeros;
    }


    public static ArrayList<Integer> guardarArrayListNum() throws InputMismatchException {
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

    public static int sumarNumeros(ArrayList<Integer> arrayListNum) throws ArithmeticException{
        int suma = 0;
        for (int numero : arrayListNum){
            suma += numero;
        }
        return suma;
    }

    public static int sumarNumeros(int[] arrayNum) throws ArithmeticException{
        int suma = 0;
        for (int numero = 1; numero <= arrayNum.length; numero++)
            suma += numero;
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
        for (int numero = 1; numero <= arrayNum.length; numero++){
            producto *= numero;
        }
        return producto;
    }
}

