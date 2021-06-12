package itc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //---- definir un Array que almacene los objetos
    public static ArrayList<SeleccionFutbol> integrantesArrayList = new ArrayList<>();
    public static ArrayList<Futbolista> futbolistaArrayList = new ArrayList<>();
    public static ArrayList<Entrenador> entrenadorArrayList = new ArrayList<>();
    public static ArrayList<Masajista> masajistaArrayList = new ArrayList<>();

    public static void main(String[] args){
        char sel;
        int sel2;
        boolean salida = false;
        boolean salida2 = false;
        Scanner input = new Scanner(System.in);

        //------- levantar registro de integrantes
        while (!salida){
            System.out.println("\nIngresa F[utbolista], E[entrenador] o M[asajista] para iniciar el registro" +
                    "o presione S para salir\n");
            System.out.print("--------------> ");
            sel = input.next().toLowerCase().charAt(0);

            switch (sel){
                case ('f'):
                    Futbolista f1 = new Futbolista();
                    System.out.println("-----------------Ingresa los datos correspondientes----------------\n");
                    System.out.print("ID ---> ");
                    f1.setId(input.nextInt());
                    input.nextLine();
                    System.out.print("Nombre ---> ");
                    f1.setNombre(input.nextLine());
                    //input.nextLine();
                    System.out.print("Apellidos ---> ");
                    f1.setApellidos(input.nextLine());
                    //input.nextLine();
                    System.out.print("Edad ---> ");
                    f1.setEdad(input.nextInt());
                    input.nextLine();
                    System.out.print("Dorsal ---> ");
                    f1.setDorsal(input.nextInt());
                    input.nextLine();
                    System.out.print("Demarcación ---> ");
                    f1.setDemarcacion(input.nextLine());
                    //input.nextLine();
                    integrantesArrayList.add(f1);
                    futbolistaArrayList.add(f1);
                    break;

                case ('e'):
                    Entrenador e1 = new Entrenador();
                    System.out.println("-----------------Ingresa los datos correspondientes----------------\n");
                    System.out.print("ID ---> ");
                    e1.setId(input.nextInt());
                    input.nextLine();
                    System.out.print("Nombre ---> ");
                    e1.setNombre(input.nextLine());
                    //input.nextLine();
                    System.out.print("Apellidos ---> ");
                    e1.setApellidos(input.nextLine());
                    //input.nextLine();
                    System.out.print("Edad ---> ");
                    e1.setEdad(input.nextInt());
                    input.nextLine();
                    System.out.print("ID de Federación ---> ");
                    e1.setIdFederacion(input.nextInt());
                    input.nextLine();
                    integrantesArrayList.add(e1);
                    entrenadorArrayList.add(e1);
                    break;

                case ('m'):
                    Masajista m1 = new Masajista();
                    System.out.println("-----------------Ingresa los datos correspondientes----------------\n");
                    System.out.print("ID ---> ");
                    m1.setId(input.nextInt());
                    input.nextLine();
                    System.out.print("Nombre ---> ");
                    m1.setNombre(input.nextLine());
                    //input.nextLine();
                    System.out.print("Apellidos ---> ");
                    m1.setApellidos(input.nextLine());
                    //input.nextLine();
                    System.out.print("Edad ---> ");
                    m1.setEdad(input.nextInt());
                    input.nextLine();
                    System.out.print("Años de Experiencia ---> ");
                    m1.setAniosExperiencia(input.nextInt());
                    input.nextLine();
                    System.out.print("Titulo ---> ");
                    m1.setTitulacion(input.nextLine());
                    //input.nextLine();
                    integrantesArrayList.add(m1);
                    masajistaArrayList.add(m1);
                    break;

                case ('s'):
                    salida = true;
                    break;

                default:
                    System.out.println("Oops! selección inválida");
                    break;

            }
        }

        //---- llamar a los objetos a pantalla
        while (!salida2){
            System.out.println("\n Ver integrantes de la Selección Nacional que " +
                    "están concentrados: 1 | viajan: 2 | entrenan: 3 | juegan: 4 | masajean: 5 " +
                    "o presione 6 para salir");
            System.out.print("--------> ");
            sel2 = input.nextInt();
            input.nextLine();

            switch (sel2){
                case (1):
                    for (SeleccionFutbol i : integrantesArrayList){
                        System.out.print(+ i.getId()+" "+ i.getNombre()+" "+ i.getApellidos()+" "+ i.getEdad()+"---> ");
                        i.Concentrarse();
                    }
                    break;
                case (2):
                    for (SeleccionFutbol i : integrantesArrayList){
                        System.out.print(i.getId()+" "+ i.getNombre()+" "+ i.getApellidos()+" "+ i.getEdad()+"---> ");
                        i.Viajar();
                    }
                    break;
                case (3):
                    for(SeleccionFutbol i : integrantesArrayList){
                        for (Futbolista f : futbolistaArrayList){
                            if(i.equals(f)){
                                System.out.print(i.getId()+ " "+ i.getNombre()+ " "+ i.getApellidos()+ " "+ i.getEdad()
                                        +" "+ f.getDorsal()+ " "+ f.getDemarcacion()+ "---> ");
                                f.Entrenar();
                                break;

                            }
                        }
                        for (Entrenador e : entrenadorArrayList){
                            if(i.equals(e)){
                                System.out.print(i.getId()+ " "+ i.getNombre()+ " "+ i.getApellidos()+ " "+ i.getEdad()
                                        +" "+ e.getIdFederacion()+ "---> ");
                                e.DirigirEntrenamiento();
                                break;
                            }
                        }
                    }
                    break;
                case (4):
                    for(SeleccionFutbol i : integrantesArrayList){
                        for (Futbolista f : futbolistaArrayList){
                            if(i.equals(f)){
                                System.out.print(i.getId()+ " "+ i.getNombre()+ " "+ i.getApellidos()+ " "+ i.getEdad()
                                        +" "+ f.getDorsal()+ " "+ f.getDemarcacion()+ "---> ");
                                f.JugarPartido();
                                break;

                            }
                        }
                        for (Entrenador e : entrenadorArrayList){
                            if(i.equals(e)){
                                System.out.print(i.getId()+ " "+ i.getNombre()+ " "+ i.getApellidos()+ " "+ i.getEdad()
                                        +" "+ e.getIdFederacion()+ "---> ");
                                e.DirigirPartido();
                                break;
                            }
                        }
                    }
                    break;
                case (5):
                    for(SeleccionFutbol i : integrantesArrayList){
                        for (Masajista m : masajistaArrayList){
                            if (i.equals(m)){
                                System.out.print(i.getId()+ " "+ i.getNombre()+ " "+ i.getApellidos()+ " "+ i.getEdad()
                                        +" "+ m.getTitulacion()+ " "+ m.getAniosExperiencia()+ "---> ");
                                m.darMasaje();
                                break;
                            }
                        }
                    }
                    break;
                case (6):
                    salida2 = true;
                    break;
                default:
                    System.out.println("Selección inválida");
                    break;
            }
        }


    }
}
