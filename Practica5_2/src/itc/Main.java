package itc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Alumno a1 = new Alumno();
        Profesor p1 = new Profesor();
        Scanner input = new Scanner(System.in);

        //------ Alumno 1
        System.out.print("Nombre Alumno > ");
        a1.setNombre(input.next());
        System.out.print("Apellido Alumno > ");
        a1.setApellido(input.next());
        System.out.print("Edad Alumno > ");
        a1.setEdad(input.nextInt());
        System.out.print("Fecha Nacimiento Alumno > ");
        a1.setFechaNacimiento(input.next());
        System.out.print("Nacionalidad Alumno > ");
        a1.setNacionalidad(input.next());
        System.out.print("Género Alumno > ");
        a1.setGenero(input.next().charAt(0));
        System.out.print("Grado Alumno > ");
        a1.setGradoEscolar(input.next());
        System.out.print("Grupo Alumno > ");
        a1.setGrupo(input.next());
        System.out.print("Turno del Alumno > ");
        a1.setTurno(input.next());
        System.out.print("Número de control Alumno > ");
        a1.setNumeroControl(input.next());
        System.out.print("Promedio del Alumno > ");
        a1.setPromedio(input.nextDouble());

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

        System.out.println();
        System.out.println("##################################################################");
        System.out.println();

        //------- Profesor 1
        System.out.print("Nombre Profesor > ");
        p1.setNombre(input.next());
        System.out.print("Apellido Profesor > ");
        p1.setApellido(input.next());
        System.out.print("Edad Profesor > ");
        p1.setEdad(input.nextInt());
        System.out.print("Fecha Nacimmiento Profesor > ");
        p1.setFechaNacimiento(input.next());
        System.out.print("Nacionalidad Profesor > ");
        p1.setNacionalidad(input.next());
        System.out.print("Género Profesor > ");
        p1.setGenero(input.next().charAt(0));
        System.out.print("Número Empleado > ");
        p1.setNumeroEmpleado(input.next());
        System.out.print("Perfil del Profesor > ");
        p1.setPerfil(input.next());

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
