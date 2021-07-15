package menu;


public class DirProgramas {
    DirProgramas(){}

    public static String[][] programas(byte sel) throws IndexOutOfBoundsException{
        if (sel == 1) {
            //--Herencia
            return new String[][]{
                    {"Practica9-unofficial/out/artifacts/Practica9_unofficial_jar/Practica9-unofficial.jar", "Practica9-unofficial/src/practica9UnOfficial/Main.java"}
            };
        }

        if (sel == 2) {
            //--Polimorfismo
            return new String[][]{
                    {"Practica10/out/artifacts/Practica10_jar/Practica10.jar", "Practica10/src/practica10/Main.java"},
                    {"Polimorfismo_Inclusion/out/artifacts/Polimorfismo_Inclusion_jar/Polimorfismo_Inclusion.jar", "Polimorfismo_Inclusion/src/Polimorfismo/Main.java"}
            };
        }

        if (sel == 3) {
            //--Interfaces
            return new String[][]{
                    {"Practica13/out/artifacts/Practica13_jar/Practica13.jar", "Practica13/src/practica13/Main.java"},
                    {"Practica14/out/artifacts/Practica14_jar/Practica14.jar", "Practica14/src/practica14/Main.java"}

            };
        }

        if (sel == 4) {
            //--Excepciones
            return new String[][]{
                    {"Practica17/out/artifacts/Practica17_jar/Practica17.jar", "Practica17/src/practica17/Main.java"},
                    {"Practica18/out/artifacts/Practica18_jar/Practica18.jar", "Practica18/src/practica18/Main.java"},
                    {"Practica19/out/artifacts/Practica19_jar/Practica19.jar", "Practica19/src/practica19/Main.java"}
            };
        }

        if (sel == 5) {
            //--Archivos
            return new String[][]{
                    {"Practica20-2/out/artifacts/Practica20_2_jar/Practica20-2.jar", "Practica20-2/src/practica20_2/Main.java"},
                    {"Practica21/out/artifacts/Practica21_jar/Practica21.jar", "Practica21/src/practica21/Main.java"},
                    {"Practica22/out/artifacts/Practica22_jar/Practica22.jar", "Practica22/src/practica22/Main.java"}
            };
        }

        return new String[][]{{}};

    }
}
