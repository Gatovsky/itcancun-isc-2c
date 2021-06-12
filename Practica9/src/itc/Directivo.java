package itc;

import javax.swing.*;

public class Directivo extends Empleado {
    private String categoria;

    public Directivo() {
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad() + "\nCategoría: " + getCategoria() + "\nSueldo: " + getSueldoBruto() + "\n Sueldo neto: " + calcularSueldoNeto());

    }
}
