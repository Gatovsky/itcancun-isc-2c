package itc;

import javax.swing.*;

public class Empleado extends Persona {
    private double sueldo_bruto;

    public Empleado(){}

    public void setSueldoBruto(double sueldo_bruto){
        this.sueldo_bruto = sueldo_bruto;
    }

    public double getSueldoBruto(){
        return this.sueldo_bruto;
    }

    public double calcularSueldoNeto(){
        double tasa_interes = 14.5;
        return this.sueldo_bruto - ((tasa_interes * this.sueldo_bruto) / 100);

    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad() + "\nSueldo: " + getSueldoBruto() + "\n Sueldo neto: " + calcularSueldoNeto());
    }

}
