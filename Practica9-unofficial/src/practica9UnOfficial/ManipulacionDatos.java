package practica9UnOfficial;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ManipulacionDatos {


    public static ArrayList<Persona> usuarios = new ArrayList<>();

    public static boolean validarSoloNumeros (String cadena){
        /*---si hay al menos una letra será verdadero. al invocar el método en el while de la clase Main el bucle se rompe
        *solo si este método retorna falso*/
        Pattern soloNumeros = Pattern.compile("[a-zA-Z]+");
        Matcher cadenaNumerica = soloNumeros.matcher(cadena);
        return cadenaNumerica.matches();
    }

    public static boolean validarSoloTexto (String cadena){
        Pattern soloTexto = Pattern.compile("[a-zA-Z]+");
        Matcher cadenaAlfabetica = soloTexto.matcher(cadena);

        return cadenaAlfabetica.matches();
    }

    public static String quitarEspacios(String cadena){

        //--String regexAnnio = "/^\d{4}$/";

        String sinEspacios = "";

        StringTokenizer cadenaTexto = new StringTokenizer(cadena);
        while (cadenaTexto.hasMoreElements()){
            sinEspacios += cadenaTexto.nextElement();
        }

        return sinEspacios;
    }

    public static void mostrarUsuario(int sel){

        switch (sel){
            case 1:
                for (Persona i : usuarios){
                    if(i instanceof Empleado != i instanceof Directivo) {
                        i.mostrar();
                    }
                }
                break;

            case 2:
                for (Persona i : usuarios){
                    if(i instanceof Directivo) {
                        i.mostrar();
                    }
                }
                break;

            case 3:
                for (Persona i : usuarios){
                    if(i instanceof Cliente) {
                        i.mostrar();
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Volviendo al menú principal.....");
        }

    }



    public static void  crearUsuario(int sel) {
        Persona usuario = null;

        switch (sel){
            case 1:
                do{
                    try {
                        String nombre = JOptionPane.showInputDialog("Nombre").trim();
                        String StEdad = JOptionPane.showInputDialog("Edad");
                        int edad = Integer.parseInt(quitarEspacios(StEdad));
                        String stSueldo_bruto = JOptionPane.showInputDialog("Sueldo bruto");
                        double sueldo_bruto = Double.parseDouble(quitarEspacios(stSueldo_bruto));

                        usuario = new Empleado(sueldo_bruto,nombre,edad);
                        break;


                    }catch (Exception InputMisMatch){
                        JOptionPane.showMessageDialog(null, "Error tipo de dato" + InputMisMatch.getCause());
                    }
                }while (true);
                break;

            case 2:
                do{
                    try {
                        String nombre = JOptionPane.showInputDialog("Nombre").trim();
                        String StEdad = JOptionPane.showInputDialog("Edad");
                        int edad = Integer.parseInt(quitarEspacios(StEdad));
                        String categoria;
                        do {
                            categoria = JOptionPane.showInputDialog("Categoría");
                            categoria = quitarEspacios(categoria);
                        }while (!validarSoloTexto(categoria));
                        String StSueldo_bruto = JOptionPane.showInputDialog("Sueldo bruto");
                        double sueldo_bruto = Double.parseDouble(quitarEspacios(StSueldo_bruto));

                        usuario = new Directivo(categoria, sueldo_bruto, nombre, edad);
                        break;

                    }catch (Exception InputMisMatch){
                        JOptionPane.showMessageDialog(null, "Error tipo de dato" + InputMisMatch.getCause());
                    }
                }while (true);
                break;

            case 3:
                do{
                    try {
                        String nombre = JOptionPane.showInputDialog("Nombre").trim();
                        String StEdad = JOptionPane.showInputDialog("Edad");
                        int edad = Integer.parseInt(quitarEspacios(StEdad));
                        String telefono_de_contacto = JOptionPane.showInputDialog("Telefono");
                        telefono_de_contacto = quitarEspacios(telefono_de_contacto);

                        usuario = new Cliente(telefono_de_contacto, nombre, edad);
                        break;


                    }catch (Exception InputMisMatch){
                        JOptionPane.showMessageDialog(null, "Error tipo de dato" + InputMisMatch.getCause());
                    }
                }while(true);
                break;

        }

        usuarios.add(usuario);
    }

}
