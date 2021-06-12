package itc;

public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona(20000.00,50000.00,"Edwin","López");
        p1.nombreCompleto();
        System.out.println("Su salto total en su cuenta es:");
        p1.saldoTotal();
    }
}
