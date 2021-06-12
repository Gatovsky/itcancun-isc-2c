/** Área de figuras con clase herencia**/

package itc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("----------------- Calculador de áreas ---------------------");
        System.out.print("Seleccionar C[írculo], R[ectángulo], o T[riángulo] > ");
        char entrada = input.next().toLowerCase().charAt(0);

        switch (entrada) {
            case 'c' -> {
                Circulo c1 = new Circulo();
                System.out.print("Radio del círculo > ");
                c1.setRadio(input.nextDouble());
                c1.calcularArea();

                System.out.println("El área del círculo con radio " + c1.getRadio() + " es de " + c1.getArea());
            }
            case 'r' -> {
                Rectangulo r1 = new Rectangulo();
                System.out.print("Base del rectángulo > ");
                r1.setBase(input.nextDouble());
                System.out.print("Altura del rectángulo > ");
                r1.setAltura(input.nextDouble());
                r1.CalcularArea();

                System.out.println("El area del rectángulo es " + r1.getArea());
            }
            case 't' -> {
                Triangulo t1 = new Triangulo();
                System.out.print("Base del triángulo > ");
                t1.setBase(input.nextDouble());
                System.out.print("Altura del triángulo > ");
                t1.setAltura(input.nextDouble());
                t1.calcularArea();

                System.out.println("El área del triángulo es " + t1.getArea());
            }
            default -> {
                System.out.println("Selección inválida, adiós UwU");
            }
        }

    }
}
