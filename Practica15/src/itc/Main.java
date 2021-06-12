package itc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arreglo=new int[10];
        Scanner t= new Scanner(System.in);
        int x=10,y=0;
        boolean correcto=true;
        System.out.println("Hola, todo va bien");
        do{
            try{
                System.out.println("Escriebe el divisor");
                y=t.nextInt();
                t.nextLine();
                x=x/y;
                correcto=false;
            }catch(Exception e){
                System.out.println("Escribe un número mayor de 0 ");
            }
        }while(correcto);
        System.out.println("X= "+x);
    }
}