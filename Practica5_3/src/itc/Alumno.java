package itc;

import javax.swing.JOptionPane;

public class Alumno extends Persona {
    private double promedio;
    private String gradoEscolar;
    private String grupo;
    private String turno;
    private String numeroControl;


    public Alumno(double promedio, String gradoEscolar, String grupo, String turno, String numeroControl, String nombre, String apellido, int edad, char genero, String fechaNacimiento, String nacionalidad){
        super(nombre, apellido, edad, genero, fechaNacimiento, nacionalidad);
        this.promedio = promedio;
        this.gradoEscolar = gradoEscolar;
        this.grupo = grupo;
        this.turno = turno;
        this.numeroControl = numeroControl;
    }


    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getGradoEscolar() {
        return gradoEscolar;
    }

    public void setGradoEscolar(String gradoEscolar) {
        this.gradoEscolar = gradoEscolar;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    @Override
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, datosPersona() + "Promedio: "+ getPromedio()+ "\nGrado: "+ getGradoEscolar()+
                "\nGrupo: "+ getGrupo()+ "\nTurno: "+ getTurno()+ "\nNúmero de Control: " + getNumeroControl());
    }
}
