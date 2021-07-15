package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();

        String[][] programasPolimorfos = {
                {"Practica10/src/practica10/Main.java",
                        "Practica10/out/artifacts/Practica10_jar/Practica10.jar"},
                {"Polimorfismo_Inclusion/src/Polimorfismo/Main.java",
                        "Polimorfismo_Inclusion/out/artifacts/Polimorfismo_Inclusion_jar/Polimorfismo_Inclusion.jar"}
        };
        String jar= "";
        String java= "";
        for (String[] pP : programasPolimorfos) {
            if (pP == programasPolimorfos[entrada - 1]) {
                ///System.out.println(Arrays.toString(pP));
                System.out.println();
                jar = pP[0];
                java = pP[1];
                break;

            }
        }
        System.out.println("Jar: "+jar);
        System.out.println("Java: "+java);
    }
}
