package itc;

import javax.swing.JOptionPane;

public class Profesor extends Persona{
    private String numeroEmpleado;
    private String perfil;

    public Profesor(String numeroEmpleado, String perfil, String nombre, String apellido, int edad, char genero, String fechaNacimiento, String nacionalidad){
        super(nombre, apellido, edad, genero, fechaNacimiento, nacionalidad);
        this.numeroEmpleado = numeroEmpleado;
        this.perfil = perfil;
    }


    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, datosPersona()+ "\nNúmero Empleado: "+ getNumeroEmpleado() + "\nPerfil: "+ getPerfil());

    }
}
