package itc;

public class Persona implements PersonaInterface {
    private double ahorro;
    private double fondoRetiro;
    private String nombre;
    private String apellido;

    public Persona(double ahorro, double fondoRetiro, String nombre, String apellido) {
        this.ahorro = ahorro;
        this.fondoRetiro = fondoRetiro;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public double saldoTotal() {
        double total = this.ahorro + this.fondoRetiro;
        System.out.println("El total se su saldo es: " + total);
        return total;
    }

    @Override
    public String nombreCompleto() {
        System.out.println(this.nombre + " " + this.apellido);
        return this.nombre + " " + this.apellido;
    }
}
