package practica9UnOfficial;

import javax.swing.JOptionPane;

public class Directivo extends Empleado {
    private final String categoria;


    public Directivo(String categoria, double sueldo_bruto, String nombre, int edad){
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;

    }

    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad() + "\nCategoría: " + getCategoria() + "\nSueldo: " + getSueldoBruto() + "\nSueldo neto: "+ calcularSueldoNeto(getSueldoBruto()));

    }

}
