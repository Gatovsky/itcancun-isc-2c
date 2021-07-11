package menu;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Menu {

    private static void buscarPrograma(String baseDir, byte selPrograma, Map<Byte, String> programas) throws IOException, InterruptedException {
        ProcessBuilder pb;
        for(Map.Entry<Byte,String> entry : programas.entrySet()){
            if(selPrograma == entry.getKey()){
                pb = new ProcessBuilder("java","-cp", "/home/hector/itcancun-isc-2c/Practica20-2/out/artifacts/Practica20_2_jar/Practica20-2.jar", baseDir+entry.getValue());
                Process startP = pb.inheritIO().start();
                startP.waitFor();
            }
        }
    }


    public static void menu(byte sel) throws IOException, InterruptedException, NumberFormatException {
        String baseDir =" ";
        byte selPrograma = 0;
        boolean salirMenu = false;

        Map<Byte, String> programas;
        baseDir = "/home/hector/itcancun-isc-2c/";

        switch (sel){
            case 1:
                //--Unidad 3

                //--llenado del map
                programas = new HashMap<>();
                programas.put((byte) 1, "Practica4/src/itc/Main.java");
                programas.put((byte) 2, "Practica8/src/itc/Main.java");
                programas.put((byte) 3, "Practica9/src/itc/Main.java");

                do{
                    selPrograma = Byte.parseByte(JOptionPane.showInputDialog("1 - Práctica 04\n" +
                            "2 - Práctica 08\n" +
                            "3 - Práctica 09\n" +
                            "4 - Salir del menú"));
                    if(selPrograma == 4){
                        salirMenu = true;
                    }
                    if(selPrograma >= 1 && selPrograma <=3){

                        buscarPrograma(baseDir, selPrograma, programas);
                    }

                }while (!salirMenu);
                break;
            case 2:
                //---Unidad 6

                //--llenado del map
                programas = new HashMap<>();
                programas.put((byte) 1, "Practica20/src/practica20/Main.java");
                programas.put((byte) 2, "Practica20-2/src/practica20_2/Main.java");
                programas.put((byte)3, "Practica22/src/practica22/Main.java");

                do{
                    selPrograma = Byte.parseByte(JOptionPane.showInputDialog("1 - Práctica 20\n" +
                            "2 - Práctica 20_2\n"+
                            "3 - Práctica 22\n" +
                            "4 - Salir del submenú"));
                    if(selPrograma == 4){
                        salirMenu = true;
                    }
                    if(selPrograma >=1 && selPrograma <= 3){

                        buscarPrograma(baseDir, selPrograma, programas);
                    }

                }while (!salirMenu);
                break;
        }
    }


    public static void main(String[] args)throws Exception{
        byte sel;
        boolean salir = false;

        do {
            sel = Byte.parseByte(JOptionPane.showInputDialog("1 - Programas Herencia\n" +
                    "2 - Programas Polimorfismo\n" +
                    "3 - Programas Interfaces\n"+
                    "4 - Programas Excepciones\n" +
                    "5 - Programas Archivos\n" +
                    "6 - Salir"));
            if(sel == 6){
                salir = true;
            }
            if(sel >= 1 && sel <=5){
                menu(sel);
            }
        }while (!salir);
    }
}
