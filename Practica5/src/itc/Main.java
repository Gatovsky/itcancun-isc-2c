package itc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Alumno a1 = new Alumno();
        Profesor p1 = new Profesor();
        Scanner input = new Scanner(System.in);

        //------ Alumno 1
        a1.setNombre("Hector");
        a1.setApellido("Hernandez");
        a1.setEdad(25);
        a1.setFechaNacimiento("96");
        a1.setNacionalidad("Mexicana");
        a1.setGenero('M');
        a1.setGradoEscolar("2");
        a1.setGrupo("C");
        a1.setTurno("Vespertino");
        a1.setNumeroControl("20345t72");
        a1.setPromedio(8.8);

        System.out.println(a1.getNombre());
        System.out.println(a1.getApellido());
        System.out.println(a1.getEdad());
        System.out.println(a1.getFechaNacimiento());
        System.out.println(a1.getNacionalidad());
        System.out.println(a1.getGenero());
        System.out.println(a1.getGradoEscolar());
        System.out.println(a1.getGrupo());
        System.out.println(a1.getTurno());
        System.out.println(a1.getNumeroControl());
        System.out.println(a1.getPromedio());

        System.out.println("##################################################################");
        //------- Profesor 1
        p1.setNombre("Edgar");
        p1.setApellido("Poe");
        p1.setEdad(54);
        p1.setFechaNacimiento("no te digo");
        p1.setNacionalidad("Estadounidense");
        p1.setGenero('M');
        p1.setNumeroEmpleado("0607689");
        p1.setPerfil("Literario");

        System.out.println(p1.getNombre());
        System.out.println(p1.getApellido());
        System.out.println(p1.getEdad());
        System.out.println(p1.getFechaNacimiento());
        System.out.println(p1.getNacionalidad());
        System.out.println(p1.getGenero());
        System.out.println(p1.getNumeroEmpleado());
        System.out.println(p1.getPerfil());
    }

}
