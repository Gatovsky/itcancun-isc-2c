package practica22;

/*
Crea una aplicación que almacene los datos básicos de un vehículo como la matricula(String),
marca (String), carga máxima (double) y modelo (String) en ese orden y de uno en uno.
Los datos anteriores se pedirán por teclado y se irán añadiendo al archivo.
Muestra todos los datos de cada coche.
 */


import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static ArrayList<RegistroVehiculo> menu(int sel) {
        ArrayList<RegistroVehiculo> arrayListRegistroVehiculo = new ArrayList<>();
        ManipularArchivo dato;

        switch (sel) {
            case 1:
                try {
                    RegistroVehiculo registro = new RegistroVehiculo();
                    dato = new ManipularArchivo();
                    dato.setRuta(JOptionPane.showInputDialog("Ruta del archivo a escribir"));

                    registro.setMatricula(JOptionPane.showInputDialog("Matrícula"));
                    registro.setMarca(JOptionPane.showInputDialog("Marca"));
                    registro.setCargaMax(Double.parseDouble(JOptionPane.showInputDialog("Carga máxima del vehículo")));
                    registro.setModelo(JOptionPane.showInputDialog("Modelo"));
                    arrayListRegistroVehiculo.add(registro);

                    dato.escribirArchivo(arrayListRegistroVehiculo);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error de entrada " + e.getMessage());
                }

                break;
            case 2:
                try {
                    dato = new ManipularArchivo();
                    dato.setRuta(JOptionPane.showInputDialog("Ruta del Archivo"));
                    dato.leerArchivo();
                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "No existe el fichero o directorio" + e.getLocalizedMessage());
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
            case 3:
                try {
                    dato = new ManipularArchivo();
                    dato.setRuta(JOptionPane.showInputDialog("Ruta del Archivo"));
                    dato.abrirArchivo(dato.getRuta());

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
        }

        return arrayListRegistroVehiculo;
    }


    public static void main(String[] args) {
        int sel;
        boolean salir = false;

        do {
            try {
                sel = Integer.parseInt(JOptionPane.showInputDialog("1 - Ingresar Datos\n" +
                        "2 - Ver Datos\n" +
                        "3 - Abrir Archivo\n" +
                        "4 - Salir"));
                if (sel == 4) {
                    salir = true;
                }
                if (sel >= 1 & sel <= 3) {
                    menu(sel);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } while (!salir);
    }

}
