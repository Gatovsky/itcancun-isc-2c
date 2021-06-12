package itc;

import javax.swing.JOptionPane;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private String fechaNacimiento;
    private String nacionalidad;

    //public Persona(){}

    public Persona(String nombre, String apellido, int edad, char genero, String fechaNacimiento, String nacionalidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String datosPersona(){
        return "\nNombre: "+ getNombre()+ "\nApellido: "+ getApellido()+
                "\nEdad: "+ getEdad() + "\nGénero: " + getGenero() + "\nFecha Nacimiento: "+ getFechaNacimiento() + "\nNacionaidad: " + getNacionalidad();
    }

    public abstract void mostrarDatos();
}
