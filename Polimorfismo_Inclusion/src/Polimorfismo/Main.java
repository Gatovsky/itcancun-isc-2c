package Polimorfismo;

public class Main {

    public static void main(String[] args){

        Operaciones suma1 = new Suma();
        suma1.pedirDatos();
        suma1.operaciones();
        suma1.mostrarResultado();

        Operaciones resta1 = new Resta();
        resta1.pedirDatos();
        resta1.operaciones();
        resta1.mostrarResultado();
    }
}
