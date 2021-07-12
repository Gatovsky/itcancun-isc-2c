package menu;

import java.util.*;

public class DirProgramas {

    private final Map<Byte, String> programasHerencia = new HashMap<Byte, String>() {{
        put((byte) 1, "Practica9-unofficial/src/practica9UnOfficial/Main.java");
    }};

    private final Map<Byte, String> programasPolimorfos = new HashMap<Byte, String>() {{
        put((byte) 1, "Practica10/src/practica10/Main.java");
        put((byte) 2, "Polimorfismo_Inclusion/src/Polimorfismo/Main.java");
    }};

    private final Map<Byte, String> programasInterface = new HashMap<Byte, String>() {{
        put((byte) 1, "Practica13/src/practica14/Main.java");
    }};

    private final Map<Byte, String> programasExcepciones = new HashMap<Byte, String>() {{
        put((byte) 1, "Practica17/src/practica17/App.java");
        put((byte) 2, "Practica18/src/practica18/Main.java");
        put((byte) 3, "Practica19/src/practica19/Main.java");
    }};

    private final Map<Byte, String> programasArchivos = new HashMap<Byte, String>() {{
        put((byte) 1, "Practica20-2/src/practica20_2/Main.java");
        put((byte) 2, "Practica21/src/practica21/Main.java");
        put((byte) 3, "Practica22/src/practica22/Main.java");
    }};

    DirProgramas(){}


}
