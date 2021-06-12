package itc;

import javax.swing.JOptionPane;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        String sel;
        boolean salida = false;
        //System.out.println("Elige 1 [Empleado], 2 [Directivo], 3 [Cliente], 4 [salir]");
        while (!salida){
            sel = JOptionPane.showInputDialog("Elige 1 [Empleado], 2 [Directivo], 3 [Cliente], 4 [salir]");
            switch (sel) {
                case "1":
                    Empleado empleado = new Empleado();
                    empleado.setNombre(JOptionPane.showInputDialog("Nombre"));
                    empleado.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
                    empleado.setSueldoBruto(Double.parseDouble(JOptionPane.showInputDialog("Sueldo")));

                    empleado.mostrar();
                    break;
                case "2":
                    Directivo directivo = new Directivo();
                    directivo.setNombre(JOptionPane.showInputDialog("Nombre"));
                    directivo.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
                    directivo.setCategoria(JOptionPane.showInputDialog("Categoria"));
                    directivo.setSueldoBruto(Double.parseDouble(JOptionPane.showInputDialog("Sueldo")));

                    directivo.mostrar();
                    break;
                case "3":
                    Cliente cliente = new Cliente();
                    cliente.setNombre(JOptionPane.showInputDialog("Nombre"));
                    cliente.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
                    cliente.setTelefono(JOptionPane.showInputDialog("Telefono"));

                    cliente.mostrar();
                    break;
                case "4":
                    salida = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oops! Opción inválida. Intenta otra vez");

            }
        }
    }
}
