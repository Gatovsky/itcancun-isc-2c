package itc;

import javax.swing.JOptionPane;

public class Persona {
    private final String nombre;
    private final int edad;


    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return this.nombre;
    }


    public int getEdad() {
        return this.edad;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad());
    }
}
