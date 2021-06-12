package itc;

public class Main {
    public static void main(String[] args){

        String nombre = "hector";
        String apellido = "hernandez";
        int edad = 23;
        char genero = 'M';
        String nacimiento = "1998404";
        String nacionalidad = "Mexicana";
        double promedio = 88;
        String grado = "2";
        String grupo = "C";
        String turno = "Vespertino";
        String numControl = "L20522830";

        Persona alumno = new Alumno(promedio, grado, grupo, turno, numControl, nombre, apellido, edad, genero, nacimiento, nacionalidad);


        alumno.mostrarDatos();



    }
}
