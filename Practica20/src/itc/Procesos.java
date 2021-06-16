package itc;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Procesos {

    public static int[] guardarArrayNum() throws NumberFormatException, ArrayIndexOutOfBoundsException{
        int[] arrayNumeros = new int[10];

        for (int i = 0; i <= arrayNumeros.length-1; i++){
            arrayNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número al array\nen la posición "+ i));
        }
        return arrayNumeros;
    }


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
        }
        return producto;
    }
}

