package itc;

import javax.swing.JOptionPane;

public class Empleado extends Persona {
    private final double sueldo_bruto;


    public Empleado(double sueldo_bruto, String nombre, int edad){
        super(nombre, edad);
        this.sueldo_bruto = sueldo_bruto;
    }

    public double getSueldoBruto(){
        return this.sueldo_bruto;
    }

    public double calcularSueldoNeto(double sueldo_bruto){
        double tasa_interes = 14.5;
        return sueldo_bruto - ((tasa_interes * sueldo_bruto) / 100);

    }
    @Override
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad() + "\nSueldo: " + getSueldoBruto() + "\nSueldo neto: " + calcularSueldoNeto(getSueldoBruto()));
    }

}
