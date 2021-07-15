package menu;

import javax.swing.JOptionPane;
import java.io.IOException;

public class MenuProcess {


    /*private static void buscarPrograma(String baseDir, byte selPrograma, Map<Byte, String> programas) throws IOException, InterruptedException {
        ProcessBuilder pb;
        for(Map.Entry<Byte,String> entry : programas.entrySet()){
            if(selPrograma == entry.getKey()){
                pb = new ProcessBuilder("java","-cp", "/home/hector/itcancun-isc-2c/Practica20-2/out/artifacts/Practica20_2_jar/Practica20-2.jar", baseDir+entry.getValue());
                Process startP = pb.inheritIO().start();
                startP.waitFor();
            }
        }
    }*/

    private static void buscarPrograma(String baseDir, byte selPrograma, String[][] programas) throws IOException, InterruptedException, IndexOutOfBoundsException{
        ProcessBuilder pb;
        String jarFile = "";
        String javaFile = "";
        for (String[] pP : programas) {
            if (pP == programas[selPrograma - 1]) {
                jarFile = pP[0];
                javaFile = pP[1];
                break;
            }
        }
        pb = new ProcessBuilder("java", "-cp", baseDir+jarFile, baseDir+javaFile);
        Process startProcess = pb.inheritIO().start();
        startProcess.waitFor();
    }


    public static void menu(byte sel) throws IOException, InterruptedException, NumberFormatException {
        String baseDir =" ";
        byte selPrograma = 0;
        boolean salirMenu = false;

        baseDir = "/home/hector/itcancun-isc-2c/";

        switch (sel){
            case 1:
                //--Programas Herencia

                do{
                    selPrograma = Byte.parseByte(JOptionPane.showInputDialog("1 - Práctica 9\n" +
                            "2 - Salir del submenú"));
                    if(selPrograma == 2){
                        salirMenu = true;
                    }
                    if(selPrograma == 1){

                        buscarPrograma(baseDir, selPrograma, DirProgramas.programas(sel));
                    }

                }while (!salirMenu);
                break;
            case 2:
                //--Programas Polimorfismo

                do{
                    selPrograma = Byte.parseByte(JOptionPane.showInputDialog("1 - Práctica 10\n" +
                            "2 - Práctica Polimorfismo Inclusion\n" +
                            "3 - Salir del submenú"));
                    if(selPrograma == 3){
                        salirMenu = true;
                    }
                    if(selPrograma >= 1 && selPrograma <=2){

                        buscarPrograma(baseDir, selPrograma, DirProgramas.programas(sel));
                    }

                }while (!salirMenu);
                break;
            case 3:
                //--Programas Interfaces
                do{
                    selPrograma = Byte.parseByte(JOptionPane.showInputDialog("1 - Práctica 13\n" +
                            "2 - Práctica 14\n" +
                            "3 - Salir del submenú"));
                    if(selPrograma == 3){
                        salirMenu = true;
                    }
                    if(selPrograma >= 1 && selPrograma <=2){

                        buscarPrograma(baseDir, selPrograma, DirProgramas.programas(sel));
                    }

                }while (!salirMenu);
                break;
            case 4:
                do{
                    selPrograma = Byte.parseByte(JOptionPane.showInputDialog("1 - Práctica 17\n" +
                            "2 - Práctica 18\n" +
                            "3 - Práctica 19\n"+
                            "4 . Salir del submenú"));
                    if(selPrograma == 4){
                        salirMenu = true;
                    }
                    if(selPrograma >= 1 && selPrograma <=3){

                        buscarPrograma(baseDir, selPrograma, DirProgramas.programas(sel));
                    }

                }while (!salirMenu);
                break;
            case 5:
                //---Programas Archivos

                do{
                    selPrograma = Byte.parseByte(JOptionPane.showInputDialog("1 - Práctica 20_2\n"+
                            "2 - Práctica 21\n" +
                            "3 - Práctica 22\n" +
                            "4 - Salir del submenú"));
                    if(selPrograma == 4){
                        salirMenu = true;
                    }
                    if(selPrograma >=1 && selPrograma <= 3){

                        buscarPrograma(baseDir, selPrograma, DirProgramas.programas(sel));
                    }

                }while (!salirMenu);
                break;
        }
    }


}
