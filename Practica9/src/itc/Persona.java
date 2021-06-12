package itc;

import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad());
    }
}