package itc;

import java.util.Scanner;
/**
 *
 * @author vanit
 */
public class Main {
    public static void main(String[] args){
        boolean escape = false;
        Scanner input = new Scanner(System.in);
        System.out.println("------ Sindicato Nueva Normalidad --------");

        while (!escape){
            System.out.println("Ingresa toke A[autobus], T[taxi] o E[escape]\n");
            System.out.print("---------> ");
            char seleccion = input.next().toLowerCase().charAt(0);

            switch(seleccion){
                case 'a' -> {
                    Autobus bus1 = new Autobus();
                    System.out.println("Ingresa los tokens sin espacios en blanco\n");
                    System.out.print("Número de Plazas ---> ");
                    bus1.setNumeroPlazas(input.nextInt());
                    input.nextLine();
                    System.out.print("Matrícula ---> ");
                    bus1.setMatricula(input.nextLine());
                    System.out.print("Modelo ---> ");
                    bus1.setModelo(input.nextLine());
                    System.out.print("Caballos de vapor ---> ");
                    bus1.setPotenciaCV(input.nextInt());
                    input.nextLine();
                    System.out.println();

                    System.out.println("Número de Plazas: "+ bus1.getNumeroPlazas());
                    System.out.println("Matrícula: "+ bus1.getMatricula());
                    System.out.println("Modelo: "+ bus1.getModelo());
                    System.out.println("Caballos de Vapor: "+ bus1.getPotenciaCV());
                }

                case 't' -> {
                    Taxi taxi1 = new Taxi();
                    System.out.println("Ingresa los tokens sin espacios en blanco\n");
                    System.out.print("Número de licencia ---> ");
                    taxi1.setNumLicencia(input.nextInt());
                    input.nextLine();
                    System.out.print("Matrícula ---> ");
                    taxi1.setMatricula(input.nextLine());
                    System.out.print("Modelo ---> ");
                    taxi1.setModelo(input.nextLine());
                    System.out.print("Caballos de vapor ---> ");
                    taxi1.setPotenciaCV(input.nextInt());
                    System.out.println();

                    System.out.println("Número de Licencia: "+ taxi1.getNumLicencia());
                    System.out.println("Matrícula: "+ taxi1.getMatricula());
                    System.out.println("Modelo: "+ taxi1.getModelo());
                    System.out.println("Caballos de Vapor: "+ taxi1.getPotenciaCV());
                }

                case 'e' ->
                    escape = true;


                default ->
                    System.out.println("Oops! Selección inválida, intenta de nuevo UwU");



            }
        }
    }
    
}
