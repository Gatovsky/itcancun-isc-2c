package itc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escribe un número");
        try{
            numero=Integer.parseInt(teclado.nextLine());
        }catch(Exception e){
            System.out.println("ERROR: No escribiste un número");
            System.out.println(e.getMessage());
        }
        System.out.println("El número es: "+numero);
    }
}