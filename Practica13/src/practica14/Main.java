package practica14;

/*
* Práctica de uso de interfaces*/

public class Main {
    public static void main(String[] args) {
        Vehiculo moto = new Automovil(4, false, "2021VW30494746", 2, 0, "Azul", 2, 0);
        Vehiculo camion = new Camion(6, false, "1998MZ746452373289", 6, 2, "Verde", 4, 0, 5000);
        moto.encender();
        if (moto.encendido) {
            System.out.println("La moto está encendida");
        }
        moto.acelerar(5);
        System.out.println("La moto va a una velocia de: " + moto.velocidad + "km/H");
        moto.frenar();
        System.out.println("La moto va a una velocia de: " + moto.velocidad + "km/H");
        camion.encender();
        if (camion.encendido) {
            System.out.println("El camión está encendido");
        }
        camion.acelerar(10);
        System.out.println("El camión va a una velocia de: " + camion.velocidad + "km/H");
        camion.frenar();
        camion.frenar();
        System.out.println("El camión va a una velocia de: " + camion.velocidad + "km/H");
        moto.apagar();
        camion.apagar();
        if (!moto.encendido) {
            System.out.println("La moto está apagado");
        }
        if (!camion.encendido) {
            System.out.println("El camión está apagado");
        }

    }
}
