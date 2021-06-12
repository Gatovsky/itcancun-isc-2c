package itc;


import javax.swing.JOptionPane;

public class Main {



    public static void main(String[] args){
        int selecOpcion = 0;
        int entrar = 0;
        boolean close_program = false;
        String menuPrincipal = "1- ingresar datos \n2- ver datos \n3: salir";
        String IngresarDatos ="1- Empleado \n2- Directivo \n3- Cliente";
        String VerDatos ="1- Empleado \n2- Directivo \n3- Cliente";

        do{
            do {
                try {
                    entrar = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal).trim());
                }catch (Exception InputMisMatch){
                    JOptionPane.showMessageDialog(null, "Verifique su marcación");
                    break;
                }
                if (entrar == 1){
                    do{
                        try {
                            selecOpcion = Integer.parseInt(JOptionPane.showInputDialog(IngresarDatos).trim());
                            ManipulacionDatos.crearUsuario(selecOpcion);

                        }catch (Exception InputMisMatch){
                            JOptionPane.showMessageDialog(null, "Verifique su marcación");
                        }
                    }while (selecOpcion < 0 || selecOpcion > 3);
                }
                
                //---
                if (entrar == 2){
                    do{
                        try {
                            selecOpcion = Integer.parseInt(JOptionPane.showInputDialog(VerDatos).trim());
                            ManipulacionDatos.mostrarUsuario(selecOpcion);

                        }catch (Exception InputMisMatch){
                            JOptionPane.showMessageDialog(null, "Imposible acceder. Verifique su marcación");
                        }
                    }while (selecOpcion < 0 || selecOpcion > 3);
                }

                if (entrar == 3){
                    close_program = true;
                }
            }while (entrar < 0 || entrar > 3);

        }while (!close_program);

    }
}
